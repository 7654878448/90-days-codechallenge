package java8features;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


 class agelamda {
	String name;
	int age;
	
	
	
	public agelamda(String name,int age)
	{
		this.name=name;
		this.age=age;
	}



	
	public  static class  test{
		public static void main(String[]args)
		{
			agelamda a1=new agelamda("sumit",10);
			agelamda a2=new agelamda("tet",20);
			agelamda a3=new agelamda("jai",33);
			agelamda a4=new agelamda("bhand",22);
			agelamda a5=new agelamda("ash",15);
			
			List<agelamda> peron=Arrays.asList(a1,a2,a3,a4,a5);
		Predicate<agelamda> te=l2->l2.age>=18;
			for(agelamda l3:peron)
			{
				if(te.test(l3)==true)
				{
					System.out.println(l3.name);
				}
				
			}
			
			
	}
		
	
	}
	
	
    

}
