package java8features;

import java.util.function.Predicate;

public class chechpredicate {
	public static void main(String[]args)
	{
	String[]names= {"Anu","anuradha","anuja","samnata","samira"};	
		
	/*Predicate<String> chec=name->name.startsWith("a")||name.startsWith("A");
	for(String res:names)
	{
	    if(chec.test(res)==true)
	    {
	    	System.out.println(res);
	    }
	}
	*/
	Predicate<String> res=name->name.charAt(0)=='a'||name.charAt(0)=='A';
	for(String nam:names)
	{
		if(res.test(nam)==true)
		{
			System.out.println(nam);
			
		}
		
	}
}
}
