package string;

public class adres {
	int i;
	String s="hello";
	public  static void main(String[]args)
	{ 
		adres s1=new adres();
		s1.i=4586;
		System.out.println(s1);
		System.out.println(s1.toString());
		
	}
	public String toString()
	{
		return i +"  " +s;
	}

}
