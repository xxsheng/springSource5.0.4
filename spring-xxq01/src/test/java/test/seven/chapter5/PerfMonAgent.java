package test.seven.chapter5;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

public class PerfMonAgent {
	static private Instrumentation inst = null;

	public static void permain(String agentArgs, Instrumentation _inst) {
		System.out.println("PerfMonAgent.permain() was called.");

		inst = _inst;
		ClassFileTransformer classFileTransformer = new PerfMonXformer();
		System.out.println("Adding a perfMonxFormer instance to the JVM.");
		inst.addTransformer(classFileTransformer);
	}
}
