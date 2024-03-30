import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Queue;

public class connecton2 {
    private static final String url = "jdbc:mysql://localhost:3306/zepto?user=root";
    private static final String user_name = "root";
    private static final String password = "12345";
    private static final String Quries="INSERT INTO book values(202,'flutter',456.33)";
    public static void main(String[]args)throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // this is driver class given mysql
        Connection ctr= DriverManager.getConnection(url,user_name,password);
        Statement str=ctr.createStatement();
        // it will return no of row affected;
        int row =str.executeUpdate(Quries);
        System.out.println(row +"are succesfully added");








    }
}
