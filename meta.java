package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class meta {
	public void insertemp(ClassPathXmlApplicationContext cs)
	{
		Employee em=(Employee)cs.getBean("emp");
		System.out.println(em);
		
	}

}
