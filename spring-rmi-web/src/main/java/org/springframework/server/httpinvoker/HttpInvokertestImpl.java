package org.springframework.server.httpinvoker;

public class HttpInvokertestImpl implements HttpInvokerTest {
	@Override
	public String getTestPo(String desp) {
		return "getTestPo" + desp;
	}
}
