package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext cr=	new ClassPathXmlApplicationContext("life.xml");
		google gog=(google)cr.getBean("google");
		gog.insertemp(cr);
		meta me=(meta)cr.getBean("meta");
		me.insertemp(cr);
		
		
	}

}
