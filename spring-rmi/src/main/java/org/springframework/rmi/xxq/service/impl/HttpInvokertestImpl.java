package org.springframework.rmi.xxq.service.impl;

import org.springframework.rmi.xxq.service.HttpInvokerTest;

public class HttpInvokertestImpl implements HttpInvokerTest {
	@Override
	public String getTestPo(String desp) {
		return "getTestPo" + desp;
	}
}
