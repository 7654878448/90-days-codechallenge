package string;

import java.util.Scanner;

public class substringprint {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				System.out.print(str.substring(i,j+1)+" ");
			}
			System.out.println();
		}
	}

}
