package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class google {
	public void insertemp(ClassPathXmlApplicationContext cs)
	{
		Employee em=(Employee)cs.getBean("emp");
		em.setEid(101);
		em.setEname("Sumit Sehgal");
		System.out.println(em);
		
		
	}
	

}
