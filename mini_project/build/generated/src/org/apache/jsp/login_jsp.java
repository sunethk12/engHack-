package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

String email=request.getParameter("email");
session.putValue("email",email);
String password=request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/enghack","root","");
Statement st= con.createStatement();
ResultSet rs=st.executeQuery("select * from user where email='"+email+"' and password='"+password+"'");
try{
rs.next();
if(rs.getString("password").equals(password)&&rs.getString("userid").equals(email))
{
 System.out.println("ok");
}
else{
out.println("Invalid password or username.");
}
}
catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang = \"en\">\n");
      out.write("<head>\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("  <link rel = \"stylesheet\" type = \"text/css\" href = \"css/about_us.css\">\n");
      out.write("  <!--Bootstrap--> \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write(" <title>Robo Battle</title>\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("p.heading{\n");
      out.write("       text-align : center;\t\n");
      out.write("\t   padding : 20px;\n");
      out.write("\t   font-size : 50px;\n");
      out.write("\t   color : #00FFFF;\n");
      out.write("\t   font-family: HeadFont;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("body{\n");
      out.write("       background: linear-gradient(rgba(0,0,0,.7), rgba(0,0,0,.5)), url('Image/new first.jpeg');\n");
      out.write("\t   background-size: cover;\n");
      out.write("\t   background-repeat: no-repeat;\n");
      out.write("       background-attachment:fixed;\n");
      out.write("\t   background-position : center center;\n");
      out.write("\t   \n");
      out.write("\t   \n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("\t   width: 90%;\n");
      out.write("\t   padding: 5px 2px;\n");
      out.write("\t   margin: 10px 0;\n");
      out.write("\t   display: inline-block;\n");
      out.write("\t   border: 1px solid #ccc;\n");
      out.write("\t   border-radius: 5px;\n");
      out.write("\t   \n");
      out.write("    } \n");
      out.write("\n");
      out.write(".start_login{\n");
      out.write("\t   padding: 16px;\n");
      out.write("\t   text-align : center;\n");
      out.write("\t  \n");
      out.write("\t}\n");
      out.write("\n");
      out.write(".form_design{\n");
      out.write("\t   margin : 3% 30% 0% 35%;\n");
      out.write("\t   width  : 30%;\n");
      out.write("\t   background: linear-gradient(rgba(0,0,0,.6), rgba(0,0,0,.6));\n");
      out.write("\t   border: 1px solid black;\n");
      out.write("\t   border-radius: 40px;\n");
      out.write("\t   \n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("*{\n");
      out.write("       box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("@font-face {\n");
      out.write("      font-family: NavFont;\n");
      out.write("      src: url(Fonts/fon4.otf);\n");
      out.write("   \n");
      out.write("}\n");
      out.write("@font-face{\n");
      out.write("\t   font-family: TextFont;\n");
      out.write("\t   src: url(Fonts/font1.otf);;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@font-face {\n");
      out.write("   \t   font-family: HeadFont;\n");
      out.write("   \t   src: url(Fonts/font2.otf);\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\t\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    \n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li><a href=\"Index.html\">Home</a></li>\n");
      out.write("      <li><a href=\"rools.html\">Rules </a></li>\n");
      out.write("      <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("    </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"Register.html\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("      <li class=\"active\"><a href=\"Login.html\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("     <p class = \"heading\"><b>Login</b></p>\n");
      out.write("   \n");
      out.write("       <form class = \"form_design\"  action = \"login\" method = \"post\">\n");
      out.write("\n");
      out.write("        <div class = \"start_login\">\n");
      out.write("\t\t  \t<label for = \"u_name\" style = \"font-size:30px; color:#F5FFFA;\">Username / Email</label>\n");
      out.write("\t\t  \t<input type = \"text\" placeholder = \"Enter username / email\" name = \"u_name\" required>\n");
      out.write("\t\t  \n");
      out.write("\t\t \t<label for = \"pswd\" style = \"font-size:30px; color:#F5FFFA;\">Password</label>\n");
      out.write("\t\t  \t<input type = \"password\" placeholder = \"Enter Password\" name = \"pswd\" required><br><br>\n");
      out.write("\t\t  \n");
      out.write("\t\t  \t<button type = \"submit\" class=\"btn btn-primary\" name = \"user-login\" style=\"font-size: 20px; width: 50%;\"><b>Login</b></button>\n");
      out.write("\t\t</div>\n");
      out.write("\t   </form>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("     \n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
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
