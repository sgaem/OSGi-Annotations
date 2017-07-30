package com.poc.osgiannotation.core.servlets;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

@Component(service=TestService.class,immediate=true)
public class TestService {

		public String getName()	
		{
			return "shivani";
		}
}
