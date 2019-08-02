package Interf.impl;

import Interf.Interface1;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class InterfaceImpl implements Interface1 {
	@Override
	public void sayHello() {
		System.out.println("InterfaceImpl....");
	}
}
