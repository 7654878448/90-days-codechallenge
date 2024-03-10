package collectionFramework;

import java.util.LinkedList;

public class linked {
	public static void main(String[]args)
	{
		LinkedList l1=new LinkedList();
		l1.add(101);
		l1.add(102);
		l1.add("hydrawad");
		l1.addFirst("jahanabad");
		System.out.println(l1);
		l1.removeFirst();
		l1.add(2, 202);
		System.out.println(l1);
		// as we all know lnkedlist used scatter memory and it provide the functionality to insert delete and 
		// and we can can say any manupulation can be easily done with the help of this liinkedlist
		System.out.println(l1.contains(101));
		System.out.println(l1.getClass());
		// it is used to get the class>>>class java.util.LinkedList>>>
		System.out.println(l1.size());
	    
		
	}

}
