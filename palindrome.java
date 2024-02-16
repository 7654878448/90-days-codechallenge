package string;
import java.util.*;

public class palindrome {
	boolean pal(String str)
	{
		String tes="";
		for(int i=str.length()-1;i>=0;i--)
		{
			tes=tes+str.charAt(i);
		}
		if(str.equals(tes))
		{
			System.out.println("palindrome");
			return true;
		}
		
		
		else
		{
			System.out.println("not a palindrome");
			return false;
		}
		
	}
		
		
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your String that you want to check");
		String str=sc.nextLine();
		//String tes="";
		palindrome pl=new palindrome();
		pl.pal(str);
		
		
		
	}
}
	