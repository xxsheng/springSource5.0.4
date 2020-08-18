package org.springframework.rmi.xxq.service.impl;

import org.springframework.rmi.xxq.service.HelloRMIService;

public class HelloRMIServiceImpl implements HelloRMIService {
	@Override
	public int getAdd(int a, int b) {
		return a+b;
	}
}
