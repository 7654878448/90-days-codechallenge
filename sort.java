package string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class sort {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.print(arr);
		TreeSet<Character> ts=new TreeSet<>();
		for(int i=0;i<arr.length;i++)
		{
			ts.add(arr[i]);
			
		}
		System.out.print(ts);
		char ar2[]=str.toCharArray();
		Arrays.sort(ar2);
		System.out.print(ar2);
		
		
		
		
		
	}

}
