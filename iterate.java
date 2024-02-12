package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Object> al=new ArrayList();
		al.add("naresh");
		al.add(101);
		al.add("virat kohli");
		al.add("virat kohli");
		al.add(1,"jadeja");
	//	for(int i=0;i<al.size();i++)
	//	{
	//		System.out.println(al.get(i));
			// with the help of get method we can get the data ;
	//	}
		Iterator<Object> i1 =al.iterator();
		// by default iterator is a parrent of all collection and iterator is a method to itearate when we dont have indexing;
		
		while(i1.hasNext())//it will go until we dont get the last index element;
		{
			System.out.println(i1.next());// it will print the all Element;
			
			
		}
		

	}

}
