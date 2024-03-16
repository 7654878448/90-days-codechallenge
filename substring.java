package string;

import java.util.Scanner;

public class substring {
	public static void main(String[]args)
	{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=scr.nextLine();
		System.out.println(str.substring(0,4));
		// sub String always less than last index>>ek phale tak leta hai..
		System.out.println(str.substring(0));
		//jahn se start karenge vohn se poora string print kar dega 
		
		
		
	}

}
