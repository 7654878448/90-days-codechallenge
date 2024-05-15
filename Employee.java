package com.scope;

public class Employee {
	private int eid;
	private String Ename;
	
	public Employee()
	{
		//default constructor>>
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", Ename=" + Ename + "]";
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}

}
