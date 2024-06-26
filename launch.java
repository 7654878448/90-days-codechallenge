package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext cl=	new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=(Employee) cl.getBean("emp");
		System.out.println(emp);
	}

}
