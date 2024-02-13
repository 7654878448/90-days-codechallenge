package notes;

public class boxing {
	public static void main(String[]args)
	{
		byte b=20;
		System.out.println(b);
		Byte b1=new Byte(b);
		//this is boxing here we convert primtive type to object type;
		
		System.out.println(b1);
		byte b3=b1;
		System.out.println(b3);//__--->>uboxing to convert object to primitive
		
		
		
				
				
		
	}

}
