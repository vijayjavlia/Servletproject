/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userservlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author vijay
 */
//@WebServlet(urlPatterns ="/Saveproduct")
 @MultipartConfig
public class Saveproduct extends HttpServlet {
 public static final String STORAGE_PRODUCT_IMAGES = "/storage/images/products/";
    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        response.setContentType("html\text");
        PrintWriter out=response.getWriter();
       
//        String description=request.getParameter("description");
//        String price=request.getParameter("price");
//        String titile=request.getParameter("title");
        Part myfile=request.getPart("myfile");
       
        Part myfile1=request.getPart("myfile1");
        Part myfile2=request.getPart("myfile2");
//        String name=request.getContextPath();
        Part []parts={myfile,myfile1,myfile2};
        ArrayList <String>list=new ArrayList<String>();
        String name1="";
        list=getFileName(parts);//call to methode got a file name
        for(String name:list)
        {
            
           name1=name;
           out.println(name1);
             if(name1.lastIndexOf(".")!=-1&& name1.lastIndexOf(".")!=0)
        {
            out.println(name1.substring(name1.lastIndexOf(".")+1));
            
        }
//           out.println(name1);
        }
        String path = request.getServletContext().getRealPath("/") + STORAGE_PRODUCT_IMAGES;
        path= path + "/" + name1;
        //path = path + "/" + pCode;

        File f = new File(path);
        if (f.exists() == false) 
        {
            f.mkdirs();
        }
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    private String getFilename(String newFileName) {
        if (newFileName.isEmpty() == false) {
            newFileName = newFileName.replace(" ", "_");
            newFileName = newFileName.toLowerCase();
            return newFileName;
        }
        return "";
    }

    //file name get through this method
    private ArrayList getFileName(Part []parts) {
        ArrayList<String>list=new ArrayList<String>();
        for(int i=0;i<parts.length;i++)
        {
            Part part=parts[i];
    for (String content : part.getHeader("content-disposition").split(";")) {
        if (content.trim().startsWith("filename"))
          list.add( content.substring(content.indexOf("=") + 2, content.length() - 1));
        }
        }
   return list;
}

}
