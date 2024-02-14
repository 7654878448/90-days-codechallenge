package oppps;

abstract class vehicles {
	public abstract int  getnoOfTires();
	

}
class bus extends vehicles{
	public  int  getnoOfTires()
	{
		return 8;
	}
	
}
class motar extends vehicles{
	public  int  getnoOfTires()
	{
		return 2;
	}
	
}
class trr {
	public static void main(String[]args)

{
		 bus b1=new bus();
		 System.out.println(b1.getnoOfTires());
		motar t1=new motar();
		 System.out.println(t1.getnoOfTires());

}
}
	
