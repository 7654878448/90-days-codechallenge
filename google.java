package com.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")// if our class having the scope of prototype then we have to explicitly call the destroy method>>

@Lazy
public class google {
	private int k=10;
	public google()
	{
		System.out.println("this is an google Object");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("this is an init method");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("this is an destroy method");
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	@Override
	public String toString() {
		return "google [k=" + k + "]";
	}
	

}
