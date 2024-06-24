package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.myconfiguration;

public class launch {
	public static void main(String[]args)
	{
		AnnotationConfigApplicationContext ano=	new AnnotationConfigApplicationContext(myconfiguration.class);
	//google go=ano.getBean(google.class);
	}

}
