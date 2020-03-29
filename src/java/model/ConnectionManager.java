




package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class ConnectionManager {
       private static String url = "jdbc:mysql://localhost:3306/vijay";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password ="a";
    private static Connection con;
    private static String urlstring;
    private Statement st;
    public static Connection getConnetion() throws Exception
    {
 
        Class.forName(driverName);
        con=DriverManager.getConnection(url,username, password);
         return con;
    
}
}
