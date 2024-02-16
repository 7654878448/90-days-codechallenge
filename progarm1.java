package exception_handling;

public class progarm1 {
	public static void main(String[]args)
	{
		System.out.println("good morning");
		try {
		System.out.println(10/0);
		}
		catch (ArithmeticException e)
		{
			System.out.println("execption occur");
		}
		System.out.println("brreak the flow of execution");
		
	}

}
  