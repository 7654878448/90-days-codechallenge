package hbn_first_project;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class launch {
	public static void main(String[]args)
	{
		Session session2=getsession();
		Scanner sc=new Scanner(System.in);
		student stu=session2.load(student.class,233);//it is quries of select8 from table name
		//insert(session2,sc);
		System.out.println("enter your secret code");
		if(sc.nextInt()==1234)
		{
		System.out.println(stu.toString());
		}
		else
		{
			System.out.println("your are from some other group");
		}
	}
		
		public static void insert(Session sn,Scanner sc)
		{
		System.out.println("enter the roll number");
		int roll=sc.nextInt();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the marks");
		double marks=sc.nextDouble();
		System.out.println("enter the fav subject");
		String favsubject=sc.next();
		student s1=new student(roll,name,marks,favsubject);
		Transaction t1=sn.beginTransaction();
		int pk=(int) sn.save(s1);
		System.out.println(pk);
		t1.commit();
		sc.close();
		}
		
		
		
		
	
	private static Session getsession()
	{
	Configuration con=new Configuration();
	con.configure("hbn.cfg.xml");
	SessionFactory sun=con.buildSessionFactory();
	Session ses=sun.openSession();
	
	return ses;
	}

}
/*
Caching: Think of caching as a temporary storage area. The Session has a cache where it keeps recently accessed data. This helps speed up your application because if you need the same data again, it can be fetched quickly from this cache instead of going all the way to the database.
Lazy Loading: Lazy loading is like being efficient with resources. When you're working with a lot of data, you don't want to load everything at once. The Session helps by loading only what you need when you need it. For example, if you have a list of items and each item has details, lazy loading ensures that the details are fetched only when you ask for them, not all at once.
Identity Map: Imagine you have a list of students, and each student has a unique roll number. The Session keeps track of which roll number corresponds to which student object. This way, if you ask for the student with roll number 123 twice, the Session gives you the same object both times, ensuring consistency.
*/