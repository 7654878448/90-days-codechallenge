package java8features;
interface vechicle{
	public void start();
	//public void clean();__-->>>it will give me an because it is an abstract method for this in java 8 one method called default and static method that has method body
	public default void clean()
	{
		System.out.println("cleaning is process");
	}
	//with this my excitng class is not failing as we alreday know when ever we implements any
	// interface compulsory we should override their abstract method here we are not overide with default method
	public static void coll()
	{
		System.out.println("collection of new cars are added");
	}
	// another new method are introduce in java * main difference is static method is not overide and default method can be override
	
}

public class inter implements vechicle {
	
	@Override
	public void clean() {
		System.out.println("overide cleaning");
		
		
	}
	@Override
	/*public static void coll()
	{
		System.out.println("collection of new cars are added");
	}
	here we are trying to override the static method that we can not override
	
	*/

	public void start()
	{
		System.out.println("car is started");
	}
	public static void main(String[]args)
	{
		inter i=new inter();
		i.start();
		i.clean();
		vechicle.coll();
	}
	
	
	
	
}
