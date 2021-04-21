package com.dolma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

// this class is created to remove dolma-servlet.xml which is a configuration file which is an xml file.

@Configuration
@ComponentScan({ "com.dolma" })
public class DolmaConfig 
{
 // in future if we want to change extension we can change in this config class.
	@Bean
	public InternalResourceViewResolver viewResolver()
			{
		      InternalResourceViewResolver vr = new InternalResourceViewResolver();
		      vr.setPrefix("/WEB-INF/"); // specifying the path 
		      vr.setSuffix(".jsp"); // setting the extension
		      
		      return vr;
			}
	
	
}
