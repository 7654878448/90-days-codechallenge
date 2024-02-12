package collectionFramework;

import java.util.ArrayList;

public class object {
	public static void main(String[]args)
	{
		ArrayList <Object> data=new ArrayList();
		data.add(1023);
		data.add("hello");
		
	ArrayList <Object> al=new ArrayList();
	al.add("naresh");
	al.add(101);
	al.add("virat kohli");
	al.add("virat kohli");
	// here two kohli is there we can make change in it also This one is done with the hlp of set also;
	al.set(3,"devilers");
	// it will change kohli to devliers;
	al.add(1,"jadeja");//here we are tring to add as index based 1 will add jadega at one index
    al.addAll(0,data);// here with the help of addAll we can add all data of data arralist in al;
	// we can add this with index with also;
   System.out.println(al.contains("jadeja"));
   //this will check whether any particular items are present or not >>>
   
    System.out.println(al);
    al.clear();
   
    //it will clear the arraylist;
    System.out.println(al);
   
  //it will clear the arraylist;

	}

}
