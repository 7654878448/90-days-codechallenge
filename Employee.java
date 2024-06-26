package com.spring;

import java.util.List;

public class Employee {
	private Car car;
	private Account acc;
	private List<String>Booklist;
	
	
	public Employee()
	{
		System.out.println("employee Object is Created");
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public List<String> getBooklist() {
		return Booklist;
	}
	public void setBooklist(List<String> booklist) {
		Booklist = booklist;
	}
	@Override
	public String toString() {
		return "Employee [car=" + car + ", acc=" + acc + ", Booklist=" + Booklist + "]";
	}
	public Employee(Car car, Account acc, List<String> booklist) {
		super();
		this.car = car;
		this.acc = acc;
		Booklist = booklist;
	}
	

}
