package collectionFramework;

import java.util.ArrayList;

public class genricList {
	public static void main(String[]args)
	{
		ArrayList<String> str=new ArrayList();
		str.add("jadeja");
		str.add("Dhoni");
		str.add("shami");
		for(String a:str)// print with the help of for each LOoop
		{
			System.out.println(a);
		}
	}

}
