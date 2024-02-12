package collectionFramework;

import java.util.List;
import java.util.Vector;

public class vector {
	// main difference of vector and arrayLIst is vector are thread Safe and called as synchronized;
	public static void main(String[]args)
	{
		List<Object>li =getlist();
		li.add("hello Shivam");
		System.out.println("i am a vector and thread Safe");
		
	}

	private static Vector<Object> getlist() {
		// TODO Auto-generated method stub
		return new Vector<Object>();
	}

}
