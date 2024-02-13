package notes;

public class hashCode {
	//>>>hashcode method is used to get the hashcode /
	//when we create an object for a class then jvm will assign an unique hash code for every object
	int id;
	String name;
	public hashCode(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public static void main(String[]args)
	{
	String s=new String("hello");
	String s1=new String("hello");
	System.out.println(s==s1);
	System.out.println(s.equals(s1));//here compare the content of the object
	hashCode h1=new hashCode(101,"sumit");
	hashCode h2=new hashCode(101,"sumit");
	System.out.println(h1==h2);
	System.out.println(s.equals(h1.equals(h2)));
	System.out.println(h1.getClass().getName());
	
	
	
	}
	

}
