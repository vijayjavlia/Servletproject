package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_0020in_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        </head>\n");
      out.write("        <body style=\"background-color:#f5f5f0\">\n");
      out.write("        <header>\n");
      out.write("            <div >\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("       </header>\n");
      out.write("        <!--Sign In start-->\n");
      out.write("        <section class=\"pb-5\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("        <div class=\" col-sm-5 col-md-5  col-12\">\n");
      out.write("            <form action=\"userlogin\" method=\"post\" >\n");
      out.write("  <div class=\"form-group\"> \n");
      out.write("      <h1 class=\"text-center text-bold\">Sign In</h1>\n");
      out.write("      <hr>\n");
      out.write("    <label for=\"text\">User Name:</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" placeholder=\"Enter email\" id=\"email\" name=\"email\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"pwd\">Password:</label>\n");
      out.write("    <input type=\"password\" class=\"form-control\" placeholder=\"Enter password\" id=\"pwd\" name=\"password\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group form-check\">\n");
      out.write("    <label class=\"form-check-label\">\n");
      out.write("      <input class=\"form-check-input\" type=\"checkbox\"> Remember me\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">LogIn</button>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("                <!--Sign up form start--------------------------------------------->\n");
      out.write("<!--                <style>\n");
      out.write("                    .vl{\n");
      out.write("                     border-left: 2px solid gray;\n");
      out.write("                      height: 500px;\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("             -->\n");
      out.write("                <div class=\"col-sm-6 col-md-6  col-12\">\n");
      out.write("            <form action=\"userin\">\n");
      out.write("                 <h1 class=\"text-center text-bold\"> Sign Up</h1>\n");
      out.write("                 <hr>\n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                     <label for=\"email\">Name:</label>\n");
      out.write("                     <input type=\"name\" class=\"form-control\" placeholder=\"Enter Name\" id=\"name\" name=\"name\">\n");
      out.write("  </div>\n");
      out.write("                \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("    <label for=\"email\">Mobile Number:</label>\n");
      out.write("    <input type=\"number\" class=\"form-control\" placeholder=\"Enter Number\" id=\"number\" name=\"phone\">\n");
      out.write("  </div>             \n");
      out.write(" <div class=\"form-group\">\n");
      out.write("    <label for=\"email\">Email address:</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" placeholder=\"Enter email\" id=\"email\" name=\"email\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"pwd\">Password:</label>\n");
      out.write("    <input type=\"password\" class=\"form-control\" placeholder=\"Enter password\" id=\"pwd\" name=\"pwd\">\n");
      out.write("  </div>\n");
      out.write("<!--  <div class=\"form-group form-check\">\n");
      out.write("    <label class=\"form-check-label\">\n");
      out.write("      <input class=\"form-check-input\" type=\"checkbox\"> Remember me\n");
      out.write("    </label>\n");
      out.write("  </div>-->\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Sign Up</button>\n");
      out.write("</form> \n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
