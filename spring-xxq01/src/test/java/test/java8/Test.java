package test.java8;

import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;
import java.util.function.Function;

public class Test {

	public static void main(String [] args) {
		int a = test2(Test::test1);
//		System.out.println(a);
//		test3(Test::test4);
//		test5(Test::test6);

//		FunctionTest test = o -> System.out.println(o);
//		test.sayHello("xxx");
	}

	private static void test6() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("-----");
	}

	private static void test4(String s) {
		UserJava8 user = new UserJava8();
		if ("test3".equals(s)){
			user.setId(s);
		} else if ("test31".equals(s)){
			user.setName(s);
		}
		System.out.println(user);
	}

	private static int test1(String o) {
		System.out.println(o);
		return 1;
	}

	private static int test2(Function<String,Integer> function) {
		Integer apply = function.apply("2");
		return apply;
	}


	private static void test3(Consumer<String> consumer){
		consumer.accept("test3");
		consumer.accept("test31");
	}
//	public static int test1(){
//
//		System.out.println("---------");
//		return 1;
//	}

	private static void test5(@NotNull Runnable runnable){
		System.out.println(Thread.currentThread().getName());
		runnable.run();
	}
}

class UserJava8{
	private String name;
	private String id;

	@Override
	public String toString() {
		return "UserJava8{" +
				"name='" + name + '\'' +
				", id='" + id + '\'' +
				'}';
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}
}

@FunctionalInterface
interface FunctionTest{

	void sayHello(String s);
}