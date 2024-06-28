package com.spring;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext cl=	new ClassPathXmlApplicationContext("bean.xml ");
	crud cd=(crud)	cl.getBean("crud");
	 Scanner sc = new Scanner(System.in);

     System.out.println("Enter your sn:");
     int sn = sc.nextInt();
     System.out.println("Enter your name:");
     String name = sc.next();
     System.out.println("Enter your email:");
     String email = sc.next();
	
	cd.insert(sn,name,email);
	}

}
