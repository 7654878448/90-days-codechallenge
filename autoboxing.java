package collectionFramework;

public class autoboxing {
	public static void main(String[]args)
	{
		int a=100;
		/// we can not use any collection method for use the method we have to make primtive to object;;;
		//Integer i=new Integer(a);
		// here we make an object with refrence of i and we perform several method ;
		// it will automatically convert an primiitve data type to object type this is called as autoboxing ..>>
		
		//System.out.println(i.hashCode());
		String str="1000";
		Integer i=Integer.parseInt(str);
		// parse int is a method to convert an String to integer;
		System.out.println(str);
		
		
		
		
	}

}
