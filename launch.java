package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext cls= new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=(Employee)cls.getBean("emp");
		System.out.println(emp);
		
	}

}
