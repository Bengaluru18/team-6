package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

public final class viewalldetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("            <style >table, th, td {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    align: center;\n");
      out.write("    padding: 15px;\n");
      out.write("    table {\n");
      out.write("    border-spacing: 5px;\n");
      out.write("}\n");
      out.write("}</style>\n");
      out.write("\t<title>Care Works</title>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("  \t<!-- Facebook and Twitter integration -->\n");
      out.write("\t\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("\t<!-- Bootstrap  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("\t<!-- Theme style  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\t<!-- Modernizr JS -->\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\t<!-- FOR IE9 below -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body align=\"center\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<div class=\"fh5co-loader\"></div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t<nav class=\"fh5co-nav\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-2 text-left\">\n");
      out.write("\t\t\t\t\t<div id=\"fh5co-logo\"><a href=\"home.jsp\">CWF<span>.</span></a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-10 text-right menu-1\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t<li >\n");
      out.write("\t\t\t\t\t\t\t<a href=\"logout\">Logout</a>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("            ");

    
    int school_id=0;
    String school_name="";
    String total="";
    String list[]= new String[100];
    
    Connection con = null;
    String url="jdbc:mysql://localhost:3306/cfw";
       String UN="root";
       String PW="root";
          Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,UN,PW);
    Statement st = con.createStatement();
    
    ResultSet rs=null;

      out.write("    \n");
      out.write("<table style=\"width:100%\" align=\"center\">\n");
      out.write("  \n");
      out.write("    <tr>\n");
      out.write("        <th align=\"center\" > School ID</th>\n");
      out.write("        \n");
      out.write("        <th> School Name </th>\n");
      out.write("        \n");
      out.write("        <th> No. Of Students </th>\n");
      out.write("        \n");
      out.write("    </tr>\n");

    rs = st.executeQuery("SELECT school_id,school_name, total_no_of_students  FROM school_details order by total_no_of_students desc;");
    while(rs.next())
    { 
    school_id=rs.getInt(1);
    school_name=rs.getString(2);
    total=rs.getString(3);
    

      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        \n");
      out.write("        <td>\n");
      out.write("            ");
      out.print(rs.getInt(1));
      out.write("\n");
      out.write("        </td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <td>\n");
      out.write("            ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("        </td>\n");
      out.write("    <td>\n");
      out.write("            ");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("        </td>\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("<tr>\n");
      out.write("    ");

    
    }
    
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\t\n");
      out.write("    <br> \n");
      out.write("    <form action=\"viewdetails\" name=\"viewdetails\" method=\"post\">\n");
      out.write("       <h1>Enter School ID to view details</h1> <input type=\"text\" name=\"id\"/>\n");
      out.write("        <input type=\"submit\" value=\"submit\"/>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row copyright\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<small class=\"block\">&copy; 2018. All Rights Reserved.</small> \n");
      out.write("\t\t\t\t\t\t<small class=\"block\">Designed by CFG team </small>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<ul class=\"fh5co-social-icons\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"twitter.com\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"facebook.com\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"gototop js-top\">\n");
      out.write("\t\t<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<!-- jQuery Easing -->\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Waypoints -->\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<!-- countTo -->\n");
      out.write("\t<script src=\"js/jquery.countTo.js\"></script>\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t<script src=\"js/magnific-popup-options.js\"></script>\n");
      out.write("\t<!-- Stellar -->\n");
      out.write("\t<script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("\t<!-- Main -->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
