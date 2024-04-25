package nativesql;

import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;

public class launch {
	public static void main(String[]args)
	{
		Session ses=getsession();
		System.out.println(ses);
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("enter the choice");
			int choice=sc.nextInt();
			if(choice==5) {
				System.out.println("you will enter the wrong choice");
				break;
			}
			switch(choice)
			{
			case 1:
				insert(ses,sc);
			break;
			case 2:
			read(ses,sc);
			break;
			case 3:
				//update();
				break;
			case 4:
				//delete();
				break;
				default:
					break;
	
			}
		}
		
	}
	public static void read(Session scr,Scanner sc)
	{
		String sql="select * from nativecricketers";
		NativeQuery nQuery=scr.createNativeQuery(sql);
		List<Object[]> ls=nQuery.getResultList();
		for(Object[] orr:ls)
		{
			for(Object obj:orr)
			{
				System.out.println(obj);
			}
			System.out.println();
			
		}
		//System.out.println(ls);
		
		
	}
	public static void insert(Session scc,Scanner str)
	{
		Transaction tra=scc.beginTransaction();
		System.out.println("enter the player jn number");
		int jn=str.nextInt();
		System.out.println("enter the name");
		String name=str.next();
		System.out.println("enter the adress");
		String adress=str.next();
		System.out.println("enter the salery");
		int salery=str.nextInt();
		
		String sql="insert into nativecricketers(jn,name,adress,salery)values(:jn,:name,:adress,:salery)";
		NativeQuery<?> nq=scc.createNativeQuery(sql);
		nq.setParameter("jn", jn);
		nq.setParameter("name",name);
		nq.setParameter("adress",adress);
		nq.setParameter("salery", salery);
		
		int row=nq.executeUpdate();
		System.out.println(row);
		tra.commit();
		str.close();
		
		
		
	}
	
	public static Session getsession()
	{
		Configuration con=new Configuration();
		Properties pro=new Properties();
		pro.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		pro.put(Environment.URL,"jdbc:mysql://localhost:3306/cricketer");
		pro.put(Environment.USER,"root");
		pro.put(Environment.PASS,"12345");
		pro.put(Environment.SHOW_SQL,true);
		pro.put(Environment.HBM2DDL_AUTO,"update");
		con.setProperties(pro);
		con.addAnnotatedClass(Cricketer.class);
		Session str=con.buildSessionFactory().openSession();
		return str;	
	}
	
	
	

}
