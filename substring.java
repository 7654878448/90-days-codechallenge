package string;
import java.util.*;

public class substring {
	public static void SubString(String str)
	{
		int length=str.length();
		for(int i=0;i<length;i++)
		{
			for(int j=i;j<length;j++)
			{
			System.out.println(	str.substring(i,j+1));
			}
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String test=sc.nextLine();
		SubString(test);
		
	}

}
