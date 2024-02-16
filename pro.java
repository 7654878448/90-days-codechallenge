package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pro {
public static void main(String[]args)
{
	try {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the first number");
	int n=sc.nextInt();
	//at this point if we give some wrong input example it try to take int value and if we give an string input then it will throw an
	// input mismatch exception>>.java.util.InputMismatchException>>> 
	System.out.println("enter the Second  number");
	int n2=sc.nextInt();
int result=n/n2;
/*
 * we will Write multiple catch with one try and for check the track at every level of exception we will E.printstackTrack(
 * print Stcak track is used when we have multiple line of code and it will give me th line at which line error is occred 
 * 
 */
System.out.println(result);
	}
	catch(InputMismatchException E)
	{
		//here we are tring to handle to handle all the exception 
		
		System.out.println("wrong input");
		System.out.println(E);//it will show the which exception ;;
		E.printStackTrace();//it will tarack all the exception
		
		
	}
	catch(ArithmeticException E)
	{
		System.out.println("can not divide by zero");
		System.out.println(E);
		
	}

	
	
}

}
