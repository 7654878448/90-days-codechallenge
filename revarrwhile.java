package array;

import java.util.Scanner;

public class revarrwhile {
	public static void swap(int arr[],int first,int sec)
	{
		int temp=arr[first];
		arr[first]=arr[sec];
		arr[sec]=temp;
		
	}
	public static void rev(int arr[])
	{
		int l=0;
		int h=arr.length-1;
		while(l<h)
		{
			swap(arr,l,h);
			
			l++;
			h--;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
	}
	public static void main(String[]args)
	{
		System.out.println("enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		rev(arr);// here we are simply passing the array with function;
		
		
	}
}

