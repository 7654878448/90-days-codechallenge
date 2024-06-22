package com.spring;

public class meta {
	private String facebookId;
	private String password;
	
	
	public meta()
	{
		System.out.println("work always");
		
	}


	public String getFacebookId() {
		return facebookId;
	}


	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "meta [facebookId=" + facebookId + ", password=" + password + "]";
	}
	
	

}
