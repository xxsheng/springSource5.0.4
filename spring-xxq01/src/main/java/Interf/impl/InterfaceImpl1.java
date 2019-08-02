package Interf.impl;

import Interf.Interface1;
import org.springframework.stereotype.Service;

@Service
public class InterfaceImpl1 implements Interface1 {
	@Override
	public void sayHello() {
		System.out.println("this is InterfaceImpl1");
	}
}
