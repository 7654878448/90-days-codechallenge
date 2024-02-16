package exception_handling;

public class pro5 {
	void m1()
	{
		System.out.println("m1 method executed");
		m2();
	}
	void m2()
	{
		System.out.println("m2 method executed");
		m1();
		
	}
	public static void main(String[]args)
	{
		try {
		pro5 p2=new pro5();
		p2.m1();
		}
		catch (Error E)
		{
			E.printStackTrace();
		}
		//this is an error Stack overflow
		//below error we will gEt;
		//Exception in thread "main" java.lang.StackOverflowError
		
	}

}
