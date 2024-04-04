package array;

import java.util.Scanner;

public class countpair {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target elemnent");
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(arr[i] +" "+ arr[j]);
					
				}
			}
		}
		
	}

}
