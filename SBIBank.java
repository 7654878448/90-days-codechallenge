package oppps;
// having same method with diffrent parameter is known as overloading;
//it is used to improved to reusuability of the code;
//overriding have same method and same parrameter in parrent and child class we will go for overriding;
//when we are not statisfy with parrent class method we will go for overriding;
//note>>>when we don;t want to execute parrent class method implementation then we can write our own
//our own implementation in child class using method overriding ;
///>>>>>>>>>>>>method overriding program>>>>>>
class RbiBank
{
	boolean CheckElgebility()
	{
		// set of logic to check the eligibility;
		return true;
	}
	
	double homeloanRofi()//home loan rate of intrest;
	{
	return 10.85;	
	}
	double personalloan()
	{
		return 11.65; 
	}
}

public class SBIBank extends RbiBank  {
	double homeloanRofi()//home loan rate of intrest;
	{
	return 12.85;	
	}
	public String applyhomeloan()
	{
		boolean status=CheckElgebility();
		if (status)
		{
			double homeloanrofi =homeloanRofi();
			String msg="your loan is approved with Ri as ::" + homeloanrofi;
			return msg;
			
		}else {
			return "you are not eliglible for home lOAn";
			
		}
	}
		
		public static void main(String[]args)
		{
			SBIBank sb=new SBIBank();
			 String msg=sb.applyhomeloan();
			 System.out.println(msg);
			
		}
		
		
		
	}
	


