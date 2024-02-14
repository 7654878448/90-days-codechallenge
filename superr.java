package oppps;
 class parrent{
	void m1()
	{
		System.out.println("i am m1 method of parrent class");
	}
}

public class  superr extends parrent  {
	void m1()
	{
		super.m1();
//super keywords not used in static area >>and it is used to call parrent class method variable and also a constructor;
		
		System.out.println("i am m1 method of child class");
		
	}
	public static void main(String[]args)
	{
		superr s1=new superr();
		
		s1.m1();
		
	}
	

}
