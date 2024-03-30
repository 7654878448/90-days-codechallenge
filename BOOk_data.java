import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BOOk_data {
    private static final String Db_url = "jdbc:mysql://localhost:3306/zepto?user=root";

    private static final String username="root";
    private static final String password="12345";
    private static final String insert="INSERT INTO book values(105,'springboot',106.50)";
    public static void main(String[]args)throws Exception
    {
        //first step we have to load a driver
        Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con= DriverManager.getConnection(Db_url,username,password);
       //System.out.println(con);
      Statement stm= con.createStatement();
      int row=stm.executeUpdate(insert);
      System.out.println("row affected " + row);
      // we must have to close the db connection;
      con.close();




    }

}
