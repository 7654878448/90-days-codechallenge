package com.reflection;

public class create {
	
	public void createobject(String name) throws Exception
	{
		try {
			Class<?> cl=Class.forName(name);
			Object newinstance =cl.newInstance();
			System.out.println(newinstance);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
