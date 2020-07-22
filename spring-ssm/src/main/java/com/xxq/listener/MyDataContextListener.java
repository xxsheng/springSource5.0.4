package com.xxq.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyDataContextListener implements ServletContextListener {

	private ServletContext servletContext = null;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		this.servletContext = sce.getServletContext();
		servletContext.setAttribute("myData", "this is myData");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		this.servletContext = null;
	}
}
