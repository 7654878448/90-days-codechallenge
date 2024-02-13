package notes;
//var args is an new features introduced in 1.5;
//when we donot know the parameeter that a method will then we will go with var args;

public class important {
	public void add(int ...a)//it is var args it can take any number of parameter ;
	//when we dont aware how many parameter to take ;
	// >>>>>>>>>NOTE>>
	//MUST having 3 dots only known as ellips and must be last variable..var args last me ayega uske badd kuch nahi ayega;
	// a method should conatain only one variable args >>int ...i,one is allow if we take int ...j get an error ek allowed hai
	//public void add(String s,boolean...b ...>>>>valid
	//public void add (String s,int ...i)>>>validd ;
	//public void add(int ...i,int ...j)>>>>invalid 
	//public void add(int ...i,int j)>>>>invalid because we can take anything after var args;
	
	
	
	{
		int sum=0;
		for(int t: a)
		{
		 sum=sum+t;
		 
			
		}
		System.out.println(sum);
		
	}
	public static void main(String...args)
	// it is also valid 
	{
		important i1=new important();
		i1.add(20,56,7,8,9,33,55,56,23,2,8,90);
		i1.add(3,5,6,7,8);
		i1.add(3,5,6,7,8,3,4,0,22);
		//any number of parameter we can take ;
		
	}
	

}
