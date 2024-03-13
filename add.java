package string;

import java.util.Scanner;

public class add {
	public static void main(String[]args)
	{
		/*String st="1234";
		String te="456262";
		int  re=Integer.parseInt(st)+Integer.parseInt(te);
		System.out.println(re);
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		int count=0;
		if(str.charAt(0)!=' ')
		{
			count++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			 if(str.charAt(i)==' '&&str.charAt(i+1)!=' ') {
				count++;
				
			}
		}
		System.out.println(count);
		
		
		
	}

}
