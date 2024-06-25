package com.postProcesor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.spring.google;

@Component

public class customMethod {
	
	@Bean(name = "get1")
	public static  google get()
	{
		System.out.println("custom logic");
		return new google();
	}


}
