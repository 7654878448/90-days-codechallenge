package collectionFramework;

import java.util.PriorityQueue;
import java.util.Scanner;

public class priority {
	public static void main(String[]args)
	{
		PriorityQueue p1=new PriorityQueue();
		
		p1.add(100);
		p1.add(50);
		p1.add(150);
		p1.add(25);
		p1.add(75);
		p1.add(125);
		p1.add(175);
		System.out.println(p1);
		System.out.println("enter the number you want ot search");
		Scanner sc =new Scanner(System.in);
		int search=sc.nextInt();
		for(int i=0;i<p1.size();i++)
		{
		if (p1.contains(search)) {
	   System.out.println("Element found in the list");
	   break;
		}
		else {
				System.out.println("element not found");
				break;
			}
		}
		
		
		
		
	}

}
