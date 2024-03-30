import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connection {
    private static final String url = "jdbc:mysql://localhost:3306/zepto?user=root";
    private static final String user_name = "root";
    private static final String password = "12345";
    private static final String insert = "INSERT INTO book VALUES(110, 'ruby', 180.65)";
    private static final String query = "SELECT * FROM book";

    public static void main(String[] args) throws Exception {
        // First, load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //second ww will have to build the connection for that we will have to use driver maneger
        Connection ctr=DriverManager.getConnection(url,user_name,password);
        //third step create statement
        Statement str=ctr.createStatement();
        //forth step is to execute the query
        int get=str.executeUpdate(insert);
        System.out.println("execyte queries are" +get);
        //for retriving all the information we have to execute resultset their return type
        ResultSet resu= str.executeQuery(query);
        System.out.println(" all the details are ");
        while(resu.next())
        {
            int id=resu.getInt("Book_id");
            String Bookname=resu.getString("Book_Name");
            Double price=resu.getDouble("Book_price");
            System.out.println("id of the book are"+id +"name of the book are"+Bookname +"price of the book are" +price);

        }



    }
}
