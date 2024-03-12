package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class set1 {
	public static void main(String[]args)
	{
	LinkedHashSet <Integer> i1=new LinkedHashSet<>();
	i1.add(10);
	i1.add(20);
	i1.add(null);
	i1.add(30);
	i1.add(40);
	//here null value are allowed ;
	// inseertion order is maintained
	
	System.out.println(i1);
	Iterator ii= i1.iterator();
	// remember iterator is an interface we will not make an  object it is simply traverse the set and it will always word on forward direction
	while(ii.hasNext())
	{
		System.out.println(ii.next());
		
	}
	
		
		
	}

}
