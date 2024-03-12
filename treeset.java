package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
	public static void main(String[]args)
	{
		// in tree set null value are not allowed and it follow binary tree dataStructure
		//it will maintain the sorting mechanism
		// it will only for homogenous value like array
	
		TreeSet<Object> t1=new TreeSet();
		t1.add(101);
		t1.add(103);
		t1.add(102);
		t1.add(105);
		t1.add(104);
		t1.add(null);
		// by default it will not main the insertion order it will maintain the sorting order and it is by default homogenous in nature
		
		
		//t1.add("raju");because of homogenous it will throw an error and this line will give mw an error;
		// it will
		System.out.println(t1);
		Iterator i1=t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		
		
		
	}

}
