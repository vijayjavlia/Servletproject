package userservlet;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.User;

import usercontrol.UserManager;

/**
 *
 * @author vijay
 */
@WebServlet(urlPatterns = "/demo")
public class demo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        response.setContentType("html\text");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
        String a="hello";
        String h=show();
        out.println(a+" "+h);
        UserManager us=new UserManager();
        boolean status;
        String name="";
        User u=new User();
        u.setEmail(email);
        u.setPassword(password);
        status=us.validUser(u);
        if(status==true)
        {
//            session.setAttribute("user", email);
            request.setAttribute("user",email);
        }
//      ArrayList<String>list=new ArrayList<String>();
        out.print(status);
//        response.sendRedirect("home.jsp");
        rd.forward(request, response);
        
      }

    public static String show()
    {
        String a="vijay kumar";
        return a;
    }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
