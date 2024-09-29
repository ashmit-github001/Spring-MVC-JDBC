package com.ashmitagarwal.e_commerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.ashmitagarwal.e_commerce.controllers", "com.ashmitagarwal.e_commerce.api"})
public class AppConfig {

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
		return viewResolver;
	}
	
	@Bean
	public JdbcTemplate getJdbcDriver() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://localhost:5432/postgres", "postgres","postgres");
		dataSource.setDriverClassName("org.postgresql.Driver");
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template;
	}
}
