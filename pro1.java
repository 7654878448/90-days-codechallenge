package exception_handling;

import java.io.FileReader;

public class pro1 {
	public static void main(String[]args)
	{
		System.out.println("main method started");
		System.out.println("welcome to Exception handling");
		//graceful termination is when program  execute succefull
		int i=10/0;
		//abnoramal termination>>when termintion in middlee of execution;
		FileReader fr =new FileReader("anc.txt");
		//it will give me an error durnig compiled time >>
		
		//it is used to check the file and example at compiled time  exception and checked exception ..
		//it will give the file not found exception;
		System.out.println("main method ended");
		String s=null;
		s.length();
		//exmple of null pointer exception and it is unchecked exception;
		
		
	}

}
