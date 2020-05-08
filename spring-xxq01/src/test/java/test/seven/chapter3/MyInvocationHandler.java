package test.seven.chapter3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

	private Object target;

	public MyInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println(proxy);
		System.out.println("----------before");
		Object invoke = method.invoke(target, args);
		System.out.println("----------after");
		return invoke;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		UserService userService = new UserServiceImpl();

		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);
		UserService proxy = (UserService) myInvocationHandler.getProxy();
		proxy.add();
		boolean proxyClass = Proxy.isProxyClass(proxy.getClass());
		InvocationHandler invocationHandler = Proxy.getInvocationHandler(proxy);
		Class<?> proxyClass1 = Proxy.getProxyClass(Thread.currentThread().getContextClassLoader(), userService.getClass().getInterfaces());
		Object o = proxyClass1.getConstructor(InvocationHandler.class).newInstance(myInvocationHandler);

		MyInvocationHandler myInvocationHandler1 = new MyInvocationHandler(proxy);
		UserService proxy1 = (UserService)myInvocationHandler1.getProxy();
		proxy1.add();

		UserService userService1 = new UserServiceImpl();
		MyInvocationHandler myInvocationHandler2 = new MyInvocationHandler(userService1);
		UserService proxy2 = (UserService) myInvocationHandler2.getProxy();
	}
}
