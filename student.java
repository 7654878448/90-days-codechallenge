package oppps;

public class student {
	int id;
	String name;
	public static void main(String[]args)
	{ 
		student s1=new student();
		s1.id=101;
		s1.name="Ashokit";
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		String s=new String("hai");
		System.out.println(s);
		System.out.println(s.hashCode());
		//here we override the object class method by using hashcode method
		
		//
		String str=new String("hai");
		String st=new String("hai");
		System.out.println(str.equals(st));
		// .equals method will check the adreess of the object not the content;
		if(str==st)
		{
			System.out.println("it is equal in content");
			
		}
		else
		{
			System.out.println("it is not equal in content");
		}
		
		
	}
	public String toString()// we override the method
	
	{
		return id + " "+ name;
	}
	public int  hashCode()
	{
		return  id ;
	}

}
