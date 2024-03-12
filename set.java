package collectionFramework;

import java.util.HashSet;

public class set {
	public static void main(String[]args)
	{
		HashSet<String> h1=new HashSet<>();
		h1.add("One");
		h1.add("two");
		h1.add("three");
		h1.add("four");
		System.out.println("Hash Set will not mainatin the order of insertion" + h1);
		h1.add("one");
		System.out.println(h1);
		
	}

}
