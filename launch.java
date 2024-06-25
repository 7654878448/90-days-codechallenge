package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.configuration;

public class launch {
	public static void main(String[]args)
	{
		AnnotationConfigApplicationContext ano=	new AnnotationConfigApplicationContext(configuration.class);
		google gog= (google) ano.getBean("get1");
		
		gog.setK(345);
		System.out.println(gog.getK());
	
		ano.close();
		
	}

}
