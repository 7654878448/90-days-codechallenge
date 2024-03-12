package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iter {
	public static void main(String[]args)
	{
		ArrayList h1=new ArrayList();
			h1.add(102);
			h1.add(103);
			h1.add(104);
			h1.add(105);
			h1.add(106);
			h1.add(107);
			Iterator i1=h1.iterator();
			//iterator is an type of cursor which is used to traverse in set and set interface only in forward direction not in backward directio;
			//itearor is an interface so we can not be able to create an object of iterator;
			//it will not work in backward direction';>>>>
			
			while(i1.hasNext())// it work run until the element are present in the collection
				
			{
				System.out.println(i1.next());// here next is used to fetch the date 
				
			}
			ListIterator i2=h1.listIterator();
			while(i2.hasPrevious())
			{
				System.out.println(i2.previous());
			}
			
		
			
			
	}

}
