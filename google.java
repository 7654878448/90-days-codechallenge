package com.spring;

import java.util.List;

public class google {
	private int gid;
	private String cname;
	private List<String>list;
	
	
	
	public google()
	{
		
	}
	



	public google(int gid, String cname, List<String> list) {
		super();
		this.gid = gid;
		this.cname = cname;
		this.list = list;
	}




	public int getGid() {
		return gid;
	}




	public void setGid(int gid) {
		this.gid = gid;
	}




	public String getCname() {
		return cname;
	}




	public void setCname(String cname) {
		this.cname = cname;
	}




	public List<String> getList() {
		return list;
	}




	public void setList(List<String> list) {
		this.list = list;
	}




	@Override
	public String toString() {
		return "google [gid=" + gid + ", cname=" + cname + ", list=" + list + "]";
	}
	
	

}
