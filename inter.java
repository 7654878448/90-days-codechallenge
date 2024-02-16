
package array;

interface a {
    int i = 20;

    void show();

    default void show1() {
        System.out.println("Java 8 features of default method in interface class will be called");
    }

    static void display() {
        System.out.println("Java 8 features of static method in interface class will be called");
    }
}

class Test implements a {
    @Override
    public void show() {//in above show method there is an by default public is there and here in test class default is there and 
    	//default is more restrictive soo we make it public;
    	//restrictive order---[private,default,protected,public]--last;
        System.out.println("Abstract show method is called");

        // Accessing the class variable i through the interface
        System.out.println(a.i + 2);

        // Creating an object of the implementing class
       // Test t1 = new Test();
        //t1.show1();

        // Accessing the static method through the interface
       // a.display();
    }
}

public class inter {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        Test t1 = new Test();
        t1.show1();

        // Accessing the static method through the interface
        a.display();
    }
}

/*
interface a {
	int i=20;//this is not an instance variable this is an class variable because of by default;
	//interface is an collection of public static final variable and public and abstract method;
	//by default int i=20 and we can notchange the variable 
	void show();//this is an abstract method becausse of by default;method is public and abstract;
	//starting from Java 8, you can declare concrete (non-abstract) methods in interfaces using the default and static keywords.
	default void show1()//this is an concrete method 
	{
		System.out.println("java 8 fetures of default method of interface  class will called");
		
	}
	static void display()//early by default interface method is public and abstract;
	//Starting from Java 8, interfaces can also have static methods.
	//Static methods are declared using the static keyword.
	//They can only be called on the interface itself, not on instances of implementing classes.
	{
		System.out.println("java 8 fetures of static method of interface class will called");
		
	}
}
class text implements a{
	//@Override
	@Override
	public  void show() {
		System.out.println("abstract show method is called");
		
	}
		public static void main(String[]args)
		{
			
		
	//we must have to inherit the show method;	
		text t1=new text();
		//we can not create an object of interface because it is by default abstaract;
		t1.show();
		//i=i+2;
		System.out.println(i+2);//call an class variable;
		t1.show1();
//		/((Object) t1).dispaly();
		a t2=new text();
		a.display();
		
		
		
		
		 
	 }
	
	
}
*/
