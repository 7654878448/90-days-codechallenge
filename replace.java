package string;

import java.util.Scanner;

public class replace {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String st=sc.nextLine();
		char arr[]=st.toCharArray();
		System.out.println("enter the charecter you want to replace");
		int t=1;
		char str=sc.nextLine().charAt(0);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==str)
			{
				arr[i]=String.valueOf(t).charAt(i);
				t++;
				
				
			}
		
		
		}
		System.out.println(arr);
		
	}

}
