package test.extendsAndSuper;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<?extends Father> list = getList();
//		list.add(new Father())

		List<? super Father> list1 = new ArrayList<>();
		list1.add(new Father());
		list1.add(new Son1());
//		list1.add(new GrandFather());
	}

	private static List<? extends Father> getList() {
		List<Son1> list = new ArrayList<>();
		list.add(new Son1());
		return list;

	}
}
