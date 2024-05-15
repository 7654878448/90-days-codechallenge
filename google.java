package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class google {
	
	public void insertdetails(ClassPathXmlApplicationContext cs)
	{
		//ClassPathXmlApplicationContext xp=	new ClassPathXmlApplicationContext("scope.xml");
		Employee em=(Employee) cs.getBean("emp");
		em.setEid(100);
		em.setEname("kholi");
		System.out.println(em);
		
	}

}
