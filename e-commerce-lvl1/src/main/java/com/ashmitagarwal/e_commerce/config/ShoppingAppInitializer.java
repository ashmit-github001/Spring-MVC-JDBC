package com.ashmitagarwal.e_commerce.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ShoppingAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class arr[] = {AppConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		
		String arr[] = {"/"};
		return arr;
	}

}
