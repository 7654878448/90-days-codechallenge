package one_to_one_mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Transaction;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class maainClass {
	public static void main(String[]args)
	{
		Session ses=getsession();
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=scn.nextInt();
		while(true)
		{
			if(choice==5)break;
			switch(choice)
			{
			case 1:
				insert(ses);
			case 2:
				readfromEmployee(ses);
				
				
			}
		}
		
	}
	
	public static void insert(Session ses)
	{
		Account ac=new Account(4562435,"zerodha",987.90);
		Education deu=new Education("vatsal thapliyal","haldwani");
		GovernementAd gov=new GovernementAd(26627,"prateek","bihar");
		Employee emp1=new Employee(102,"tester","654.90",ac,deu,gov);
		
		Transaction tr=ses.beginTransaction();
		int pk=(int)ses.save(emp1);
		System.out.println(pk);
		
		tr.commit();
		//st.close();
		
	}
	public static void readfromEmployee(Session ses)
	{
		Employee emp=ses.get(Employee.class,101);
		if(emp!=null)
		{
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getSlaery());
		System.out.println(emp.account.getAccnumber());
		System.out.println(emp.account.getBalance());
		System.out.println(emp.account.getBankname());
		System.out.println(emp.getAdhar().getAdharno());
		System.out.println(emp.getAdhar().getAdress());
		}
		else
		{
			System.out.println("date not found");
		}
		
		
	}
	
	
	
	
	
	public static Session getsession()
	{
		Configuration con=new Configuration();
		Properties pro=new Properties();
		pro.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		pro.put(Environment.URL,"jdbc:mysql://localhost:3306/cricketer");
		pro.put(Environment.USER,"root");
		pro.put(Environment.PASS,"12345");
		pro.put(Environment.HBM2DDL_AUTO,"update");
		pro.put(Environment.SHOW_SQL,true);
		con.setProperties(pro);
		con.addAnnotatedClass(Employee.class);
		con.addAnnotatedClass(GovernementAd.class);
		Session str=con.buildSessionFactory().openSession();
		
		return str;
		
	}

}
