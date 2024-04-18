package connection_withhibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class launch1 {
	public static void main(String[]args)
	{
		Configuration con=new Configuration();
		con.configure("hibernate1.cfg.xml");
		SessionFactory son=con.buildSessionFactory();
		System.out.println(son);
		
		
		
		
		
	}

}
