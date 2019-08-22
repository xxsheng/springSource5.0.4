package test.impl;

public abstract class OrderAbstract extends ITestImpl implements IOrder {

	@Override
	public void sayOrder1() {
		System.out.println("sayOrder1----");
	}
}
