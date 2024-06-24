package com.spring;

import java.util.HashMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext cl=	new ClassPathXmlApplicationContext("bean.xml");
	    google google=(google) cl.getBean("google");
	    System.out.println(google.getList().getClass());
	    System.out.println(google);
	 ClassPathXmlApplicationContext Meta=   new ClassPathXmlApplicationContext("bean.xml");
	  meta m1=(meta)  Meta.getBean("meta");
	  System.out.println(m1.getMap().getClass());
	  System.out.println(m1);
	  
	
	}
	

}
