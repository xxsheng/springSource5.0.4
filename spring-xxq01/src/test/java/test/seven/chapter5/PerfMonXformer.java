package test.seven.chapter5;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class PerfMonXformer implements ClassFileTransformer {
	@Override
	public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
		byte [] transformed = null;
		System.out.println("Transforming " + className);
		ClassPool pool = ClassPool.getDefault();
		CtClass cl = null;

		try {
			cl = pool.makeClass(new ByteArrayInputStream(classfileBuffer));
			if (!cl.isInterface()) {
				CtBehavior [] methods = cl.getDeclaredMethods();
				for (int i = 0; i < methods.length; i++) {
					if (!methods[i].isEmpty()) {
						doMethod(methods[i]);
					}
				}
				transformed = cl.toBytecode();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CannotCompileException e) {
			e.printStackTrace();
		} finally {
			if (cl != null) {
				cl.detach();
			}
		}
		return transformed;
	}

	private void doMethod(CtBehavior method) throws CannotCompileException {

		method.insertBefore("long time = System.nanoTime;");
		method.insertAfter("System.out.println(\"leave " + method.getName() + "and time : \" + (System.nanoTime() - time));");
	}
}
