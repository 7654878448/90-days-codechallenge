package array;
import java.util.*;

public class revearray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("the element are");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse mode of an array elemnt");
		for(int i=arr.length-1;i>=0;i--)
		{
			
			System.out.println(arr[i]);
		}
		
	}

}
