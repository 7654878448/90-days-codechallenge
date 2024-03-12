package string;

import java.util.Scanner;

public class rev {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
			
		{
			str2=str2+str.charAt(i);
			
		}
		System.out.println(str2);
		StringBuffer ss=new StringBuffer(str);
		System.out.println(ss.reverse());
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		
	}

}
