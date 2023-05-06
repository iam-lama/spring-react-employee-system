package com.training.employees.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// Register all the configurations here
		return new Class[] { MyViewReslver.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// http://localhost:7070/employee-management-system-frontend/
		return new String[] { "/" };
	}

}
// Break for 10 mins