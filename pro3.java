package exception_handling;

import java.io.FileReader;

public class pro3 {
	public String getName(int id) throws Exception
	//throws keyword is used to ignore the exception 
	{
		if(id==100)
		{
			return "rahul";
		}
		else if(id==101)
		{
			return "riya";
		}else
		 {
			throw  new Exception("does not matched");
			
			//throw keyword is used to create an exception
		}
	}
	public static void main(String[]args)throws Exception
	{
		pro3 p1=new pro3();
		String  nane=p1.getName(109);
		System.out.println(nane);
		//FileReader fr=new FileReader("anc.txt");
		 //Class.forName("");
		int i[]=new int[-1];
		//we get exception array neggative Exception
		System.out.println(nane);
		
	
		
		
	}

}