package string;

public class chararray {
	public static void main(String[]args)
	{
		char arr[]= {'j','a','v','a'};
		String s=new String(arr);
		//char[] str=arr;
		System.out.println(s);
		//way to convert a charecter array  to string;;
		//another way to make string in char array according to our needs ;
		String ste=new String(arr, 0,2);//first parameter where to start and last 
		//how many word you want from the where to start;
		
		System.out .println(ste);
		
		
		
		
		
	}

}
