package com.spring;

public class google {
	
	private String gamilId;
	private String password;
	
	public google()
	{
		System.out.println("will work only if need");
		
	}

	public String getGamilId() {
		return gamilId;
	}

	public void setGamilId(String gamilId) {
		this.gamilId = gamilId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "google [gamilId=" + gamilId + ", password=" + password + "]";
	}
	
	  
	
	

}
