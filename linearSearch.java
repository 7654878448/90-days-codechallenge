package array;
import java.util.*;

public class linearSearch {
	public static void search(int arr[],int n)
	{
		int found=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				System.out.println(n +" are found"+" at index"+i);
				found++;
				break;
			}
		}
		if(found==0)
		{
			System.out.println("elemnt are not found");
		}
		
	}
			
		
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the Search elemnent");
		int search=sc.nextInt();
		search(arr,search);
		
	}
	

}
