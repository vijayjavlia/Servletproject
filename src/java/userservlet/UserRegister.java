/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;
import usercontrol.UserManager;

/**
 *
 * @author vijay
 */
@WebServlet(urlPatterns = "/UserRegister")
public class UserRegister extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("html\text");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("pwd");
        String phone=request.getParameter("phone");
        RequestDispatcher rd=request.getRequestDispatcher("signin.jsp");
        boolean status;
        User u=new User();
        UserManager us=new UserManager();
        u.setEmail(email);
        u.setName(name);
        u.setPassword(password);
        u.setPhone(phone);
       
        try{
            if(email.equals("")&&password.equals("")&&name.equals("")&&phone.equals("")||name.isEmpty()&&email.isEmpty()&&password.isEmpty()&&phone.isEmpty())
            {
            String error="Please Fill Boxes...";
                request.setAttribute("error", error);
             rd.include(request, response);
            }
            else
            {
                
                status=us.userRegister(u);
            out.println(status);
           }
        
        }
        catch(Exception e)
        {
          e.getStackTrace().toString();
         
        }       
      
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
