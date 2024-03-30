import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connection {
    private static final String url="jdbc:mysql://localhost:3306/zepto?user=root";
    private static final String user_name="root";
    private static final String password="12345";
    private static final String insert="INSERT INTO book values(107,'sql',180.65)";
    public static void main(String[]args)throws Exception
    {

        //first step we need to load the driver;
        Class.forName("com.mysql.cj.jdbc.Driver");
        // here second step ww will try to estblish the connection;
        Connection con= DriverManager.getConnection(url,user_name,password);
        // after create the connection we have to create the statement;

        Statement str=con.createStatement();
        //step 4 we have to execute the query>>>>>
        int row =str.executeUpdate(insert);
        System.out.println("row is affect"+ row);
        con.close();




    }

}
