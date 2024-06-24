package com.spring;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy//this line of code is for make our class lazy just like xml lazy-init=true

public class google {
	public google()
	{
		System.out.println("google object is created");
	}

}
