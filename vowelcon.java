package string;

import java.util.Scanner;

public class vowelcon {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int vo=0;
		int co=0;
		for(int i=0;i<str.length();i++)
		{
			char arr=str.charAt(i);
			if(arr=='a'||arr=='e'||arr=='o'||arr=='i'||arr=='u')
			{
				vo++;
				
			}
			else {
				co++;
			}
			
		}
		System.out.println("number of vowel are" +vo);
		System.out.println("number of cons are" +co);
		
		
	}

}
