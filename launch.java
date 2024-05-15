package com.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
	ClassPathXmlApplicationContext cn=	new ClassPathXmlApplicationContext("scope.xml");
	google go=(google)cn.getBean("goo");
	go.insertdetails(cn);
	
	// ClassPathXmlApplicationContext ps=new ClassPathXmlApplicationContext("scope.xml");
	meta ms=(meta) cn.getBean("meta");
	ms.insertdetails(cn);
	}

}
 