package array;

import java.util.Scanner;

public class countgreater_element {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		/*
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		*/
		//>>>>>>>>>>.OPTIMISE THE QUESTION>>>>
		int max=arr[0];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				//here we get the maximum element
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				count++;
			}
			
		}
		int result=arr.length-1-count;
		System.out.println(result);
		
	}

}
