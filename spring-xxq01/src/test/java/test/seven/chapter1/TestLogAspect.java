package test.seven.chapter1;

import org.aspectj.lang.ProceedingJoinPoint;

public class TestLogAspect {
	public void test(ProceedingJoinPoint proceedingJoinPoint) {
		System.out.println("----");
	}
}
