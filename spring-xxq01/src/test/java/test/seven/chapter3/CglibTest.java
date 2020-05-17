package test.seven.chapter3;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CglibTest.class);
		enhancer.setCallback(new MethodInterceptorImpl());
		CglibTest cglibTest = (CglibTest) enhancer.create();
		cglibTest.test();
		System.out.println(cglibTest);
	}

	public void test() {
		System.out.println("cgligTest test()");
	}

	private static class MethodInterceptorImpl implements MethodInterceptor {

		@Override
		public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
			System.out.println("before invoke " + method);
			Object result = methodProxy.invokeSuper(o, objects);
			System.out.println("after invoke " + method);
			return result;
		}
	}
}
