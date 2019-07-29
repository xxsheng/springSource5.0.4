package xxq;

import Interf.Interface1;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestMain {

	@Test
	public void test1(){

		System.out.println("------");
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", true);

		Interface1 proxy = (Interface1)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{Interface1.class}, new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//method.invoke(proxy, args);

				return null;
			}
		});

		proxy.sayHello();
	}
}
