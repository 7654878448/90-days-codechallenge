package com.spring;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[]args)
	{
		ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
		Scanner sc=new Scanner(System.in);
		System.out.println("p1->google and p2->meta");
		int choice=sc.nextInt();
		if(choice==1)
		{
			google go=(google)ap.getBean("google");
			go.setGamilId("sn3bdibe@gmail.com");
			go.setPassword("12345");
			System.out.println(go);
			
		}
		else if(choice==2)
		{
			meta m1=(meta)ap.getBean("meta");
			m1.setFacebookId("eiei@fb.com");
			m1.setPassword("3223");
			System.out.println(m1);
			
		}
		else {
			System.out.println("wrong data enterde");
		}
		
	}

}
