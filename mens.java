package annotation_based_connection;

import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class mens {
	
	
	
	public static void main(String[]args)
	{
		Session ses=getsession();
		System.out.println(ses);
		Scanner st=new Scanner(System.in);
		System.out.println("enter the jersy no");
		int jn=st.nextInt();
		System.out.println("enter the player name");
		String player_name=st.next();
		System.out.println("enter the player adress");
		String adress=st.next();
		System.out.println("enter the player mobile");
		long mobile_no=st.nextLong();
		System.out.println("enter the player adhar no");
		long adharno=st.nextLong();
		System.out.println("enter the ipl team");
		String iplteam=st.next();
		System.out.println("enter the account number");
		long acc=st.nextLong();
		System.out.println("enter the salery");
		int  salery=st.nextInt();
		System.out.println("enter the bank name");
		String bankname=st.next();
		System.out.println("enter the roll no");
		int roll=st.nextInt();
		System.out.println("enter the college name");
		String collegename=st.next();
		
		
		
		System.out.println("enter the highest degree");
		String edu=st.next();
		Account account=new Account(acc,salery,bankname);
		Education education=new Education(roll,collegename);
		
		Cricketer cri = new Cricketer(jn, player_name, adress, mobile_no, adharno, iplteam, account, education);
		Transaction tr=ses.beginTransaction();
		int pk=(int)ses.save(cri);
		System.out.println(pk);
		
		tr.commit();
		st.close();
			
	}
	public static Session getsession()
	{
		Configuration con =new Configuration();
		Properties pro=new Properties();
		 pro.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
		 pro.put(Environment.URL,"jdbc:mysql://localhost:3306/cricketer");
		 pro.put(Environment.USER,"root");
		 pro.put(Environment.PASS,"12345");
		 pro.put(Environment.SHOW_SQL,true);
		pro.put(Environment.HBM2DDL_AUTO,"update");
		 pro.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		
		con.setProperties(pro);
		con.addAnnotatedClass(Cricketer.class);
		Session str=con.buildSessionFactory().openSession();
		
		return str;
		
	}

}
