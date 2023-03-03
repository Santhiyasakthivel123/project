package Banking_application;

 
import java.sql.DriverManager;

public class Connection {
	static Connection con; // Global Connection Object
    public static Connection getConnection()
    {
        try {
            
            
            String mysqlJDBCDriver
                = "com.mysql.cj.jdbc.Driver"; //jdbc driver
            String url
                = "jdbc:mysql://localhost:3306/mydata"; //mysql url
            String user = "root";        //mysql username
            String pass = "mysql123";  //mysql passcode
             Class.forName(mysqlJDBCDriver);
            con = (Connection) DriverManager.getConnection(url, user,
                                              pass);
        }
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }
 
        return con;
    }
}

	



