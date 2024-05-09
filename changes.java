package java8features;

public interface changes {
	void show1();
	String  print();// it is an abstract method 
	default void show()
	{
		System.out.println("i am an default method");
		
	}
	default String samo()
	{
		System.out.println("i am an default method");
		return samo();
	}
	

}
