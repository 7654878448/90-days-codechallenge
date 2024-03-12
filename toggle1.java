package string;

import java.util.Scanner;

public class toggle1 {
	public static void tog(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
				
			}
			else {
				ch[i]=(char)(ch[i]-32);
			}
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		char ar[]=str.toCharArray();
		tog(ar);
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
		}
	}

}
