package com.spring;


import java.util.List;
import java.util.Map;

public class meta {
	private int gid;
	private String cname;
	private List<String>list;
	private Map<String, String>map;
	
	
	public meta()
	{
		
	}
	 
	
	


	@Override
	public String toString() {
		return "meta [gid=" + gid + ", cname=" + cname + ", list=" + list + ", map=" + map + "]";
	}




	public meta(int gid, String cname, List<String> list, Map<String, String> map) {
		super();
		this.gid = gid;
		this.cname = cname;
		this.list = list;
		this.map = map;
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


	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	

}
