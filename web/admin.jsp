<%-- 
    Document   : admin
    Created on : Dec 22, 2019, 1:36:32 PM
    Author     : vijay
--%>
<%--<%@page import="mycontroller.ProductController" %>--%>
<%--<%@page import="org.hibernate.Session"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Saveproduct"   method="Post" enctype="multipart/form-data"  >
            <input type="file" name="myfile"><br/>
            <input type="file" name="myfile1"><br/>
            <input type="file" name="myfile2"><br/>
            <a href="admin.jsp"></a>
            <input type="text" name="description" placeholder="description"><br/>
            <input type="text" name="price" placeholder="price"><br/>
            <input type="text" name="pname" placeholder="title"><br/>
            <input type="submit" value="Save">
        </form>
      
        
    </body>
</html>
