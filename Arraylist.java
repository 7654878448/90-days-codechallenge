package collectionFramework;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();
		
		int t=2;
		
		al.add("raju");
		al.add(t);//>>autoboxing converting an primtive type to object types;automatically;
		al.add("raju");
		Integer data=new Integer(t);
		al.remove(data);// it is used to remove an object with index based and thier indexing start with zero;
		
		
		
		
		System.out.println(al);
		 
	}

}
