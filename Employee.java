package com.spring;

public class Employee {
	private int eid;
	private int sal;
	
	
	
	
	public Employee(int eid, int sal) {
		super();
		System.out.println("bina change hue constructor");
		this.eid = eid;
		this.sal = sal;
	}
	public Employee(String  eid, String  sal) {
		
		super();
		System.out.println("parse int constructor");
		this.eid = Integer.parseInt(eid);
		this.sal = Integer.parseInt(sal);
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", sal=" + sal + "]";
	}
	

	
	

}
