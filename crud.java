package com.spring;

import org.springframework.jdbc.core.JdbcTemplate;

public class crud {
	private JdbcTemplate jd;
	

	
	public JdbcTemplate getJd() {
		return jd;
	}





	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}





	public void insert(int sn,String name,String email)
	{
		String sql="insert into contact(sn,name,email)values(?,?,?)";
		int row=jd.update(sql,sn,name,email);
		System.out.println(row);
		
	}
	

}
