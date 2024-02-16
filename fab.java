package program;

import java.util.Scanner;

public class fab {
	public static void main(String[]args)
	{
		int firstNumber=-1;
		int SecondNumber=1;
		System.out.println("enter the range of an number");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int result=firstNumber+SecondNumber;
			firstNumber=SecondNumber;
			SecondNumber=result;
				System.out.println(result);
			
			
			
		}
		
	}

}
