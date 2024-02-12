package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class linkedlist {
	public static void main(String[]args)
	{
		//Scanner sc=new Scanner(System.in);
		//LinkedList<Object> l1 = new LinkedList();
//List <Object> link=new LinkedList<Object>();
		List<Object> l1=getcollect();
		//we dont want to show the list soo we can make it hide as we known as data hinding'
		l1.add("hello i am Abstraction");
				l1.add(101);
				l1.add(null);
				l1.add(1,"mohan");
				System.out.println(l1);
				
		

  
		
	}

	private static List<Object> getcollect() {
		// TODO Auto-generated method stub
		return new LinkedList<Object>();
	}

}
