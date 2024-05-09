package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class employee {
	String empname;
	String empAdress;
	String Empdep;
	public employee(String empname,String empAdress,String Empdep)
	{
		this.empname=empname;
		this.empAdress=empAdress;
		this.Empdep=Empdep;
	}
	

}
 public class test{
	 public static void main(String[]args)
	 {
		 employee emp1=new employee("sumit","dehradun","java");
		 employee emp2=new employee("Vikash","hydarabad","salesforce");
		 employee emp3=new employee("sonali","hydarabad","graphics");
		 employee emp4=new employee("manisha","hydarabad","mysql");
		List <employee>emps= Arrays.asList(emp1,emp2,emp3,emp4);
		Predicate<employee>p1=(e)->e.empAdress.equals("hydarabad");
		Predicate<employee>p2=(e)->e.Empdep.equals("mysql");
		Predicate<employee>re=p1.and(p2);
		for(employee emp:emps)
		{
			if(re.test(emp)==true)
			{
				System.out.println(emp.empname);
			}
		}
		 
	 }
	 
 }
