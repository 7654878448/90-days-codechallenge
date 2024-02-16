package exception_handling;

public class pro2 {
	public static void main(String[]args)
	{
		try {
		int i=Integer.parseInt(args[0]);
		int j=Integer.parseInt(args[0]);
		int c=i/j;
		System.out.println("result +" + c);
	}catch(Exception e)
		{
		System.out.println("array index of bound exception");
	}
		
	}

}
