package com.xxq.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

@Slf4j
public class MyDataContextListener implements ServletContextListener {

	private ServletContext servletContext = null;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		this.servletContext = sce.getServletContext();
		servletContext.setAttribute("myData", "this is myData");
		log.info("---------");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		this.servletContext = null;
	}
}
