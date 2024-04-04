package array;

import java.util.Scanner;

public class sorted_or_not {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element of an array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Boolean test=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				test=false;
				break;
			}
		}
		if(test)
		{
			System.out.println("are in sorted order");
		}
		else {
			System.out.println("are not in sorted order");
		}
	}


}
