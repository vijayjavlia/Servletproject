/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usercontrol;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.ConnectionManager;
import model.User;

/**
 *
 * @author vijay
 */
public class UserManager {
   static ConnectionManager co=new ConnectionManager();
   static ResultSet rs; 
     static Statement st;
    public static boolean validUser(User u)
    {
       Connection con=co.getConnetion();
       String name="";
//        ArrayList<String> list=new ArrayList<String>();
 boolean status=false;  
       try{
        st=con.createStatement();
           System.out.println(con.toString());
            String email=u.getEmail();
            String password=u.getPassword();
//          String query="select *from register where email and password=(?,?)";
             rs=st.executeQuery("select *from register");
//           PreparedStatement ps=(PreparedStatement)con.prepareStatement(query); where email='"+email+"'and password='"+password+"'"
//           rs=ps.executeQuery();
//           ps.setString(0,u.getEmail());
//           ps.setString(1,u.getPassword());
           while(rs.next())
             { 
               if(u.getEmail().equals(rs.getString("email"))&&u.getPassword().equals(rs.getString("password")))
               {
                 status=true;
                 }
               else
               {
                 System.out.println("please enter a correct value"+rs.getString("email").equals(u.getEmail()));
               }
            }
           con.close();
             }
            catch(Exception e)
             {
               System.out.println(e.getStackTrace().toString());
             }
            
             return status;
    }
    public static boolean userRegister(User u) throws SQLException 
       {
        Connection con=co.getConnetion();
        String email=u.getEmail();
        String name=u.getName();
        String password=u.getPassword();
        String phone=u.getPhone();
        st=con.createStatement();
         boolean status=false;
         
          String query="insert into register(email,name,password,phone)values(?,?,?,?)";
//        String query="insert into register(email,name,password,phone)values('"+email+"','"+name+"','"+password+"','"+phone+"')";
           PreparedStatement ps=con.prepareStatement(query);
        try
        {
            ps.setString(1,email );
            ps.setString(2,name );
            ps.setString(3,password );
            ps.setString(4,phone );
            ps.execute();
//            st.executeQuery(query);
             status=true;
            
           
            
        }
         catch(Exception e)
        {
            
            System.out.println(e.getStackTrace().toString()+e.getMessage()+"Unsuccesfull");
            
        }
//        con.close();
           System.out.println("-**************************----------------****************");
         return status;
        }

    
}
 