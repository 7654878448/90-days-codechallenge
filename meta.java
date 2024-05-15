package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class meta {
	public void insertdetails(ClassPathXmlApplicationContext ap)
	{
	//ClassPathXmlApplicationContext cn=	new ClassPathXmlApplicationContext("scope.xml");
	Employee emp=(Employee)	ap.getBean("emp");
	System.out.println(emp);
	}
	

}
