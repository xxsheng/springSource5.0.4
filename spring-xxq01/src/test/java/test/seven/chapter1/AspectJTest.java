package test.seven.chapter1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJTest {

	@Pointcut("execution(* test.*.chapter1.*.test(..))")
	public void test(){}

	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
		throw new RuntimeException();
//		return;
	}

	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}

//	@Around("test()")
//	public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint) {
//		System.out.println("brfore1");
//		Object o = null;
//
//		try {
//			o = proceedingJoinPoint.proceed();
//		} catch (Throwable throwable) {
//			throwable.printStackTrace();
//		}
//		System.out.println("after1");
//		return o;
//	}

}
