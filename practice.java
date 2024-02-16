package string;

abstract public class practice {
	    abstract void show();
	    
	    void display() {
	        System.out.println("parent class abstract method called");
	    }
	}

	class base extends practice {
	    void show() {
	        System.out.println("show method of abstract class is called");
	    }

	    void test() {
	        System.out.println("test method of sub class being called");
	    }

	    public static void main(String[] args) {
	        base obj = new base();
	        obj.display();
	        obj.show();
	        obj.test();
	    }
	}


