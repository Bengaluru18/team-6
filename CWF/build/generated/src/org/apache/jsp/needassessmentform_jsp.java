package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class needassessmentform_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\r\n");
      out.write("\t<title>Care Works</title>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  \t<!-- Facebook and Twitter integration -->\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Animate.css -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\r\n");
      out.write("\t<!-- Bootstrap  -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Theme style  -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modernizr JS -->\r\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\r\n");
      out.write("\t<!-- FOR IE9 below -->\r\n");
      out.write("\t<!--[if lt IE 9]>\r\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div class=\"fh5co-loader\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"page\">\r\n");
      out.write("\t<nav class=\"fh5co-nav\" role=\"navigation\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-2 text-left\">\r\n");
      out.write("\t\t\t\t\t<div id=\"fh5co-logo\"><a href=\"home.jsp\">CWF<span>.</span></a></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-10 text-right menu-1\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li >\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"logout\">Logout</a>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"fh5co-header\" class=\"fh5co-cover fh5co-cover-sm\" role=\"banner\" style=\"background-image:url(images/img_bg_1.jpg);\" data-stellar-background-ratio=\"0.5\">\r\n");
      out.write("\t\t<div class=\"overlay\"></div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-7 text-left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"display-t\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"display-tc animate-box\" data-animate-effect=\"fadeInUp\">\r\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"mb30\">Enter the Data</h1>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<form  action=\"\" method=\"get\" align = \"center\">\r\n");
      out.write("            <br><br>School Profile <input type=\"text\" name=\"SchoolProfile\" required> <br> <br>\r\n");
      out.write("Name <input type=\"text\" name=\"SchoolName\" required> <br> <br>\r\n");
      out.write("Locality   <br>\r\n");
      out.write("Rural <input type=\"radio\" name=\"Locality\">\r\n");
      out.write("Urban <input type=\"radio\" name=\"Locality\">\r\n");
      out.write("Tribal <input type=\"radio\" name=\"Locality\"> <br>\r\n");
      out.write("School Address <textarea  name = \"SchoolAddress\" rows=\"4\" cols=\"50\" placeholder=\"Please enter the address\" required> </textarea> <br> <br>\r\n");
      out.write("Cluster/Block/Region/State <textarea name = \"Region\" rows=\"4\" cols=\"50\" placeholder=\"Please enter the Region\" required> </textarea> <br> <br>\r\n");
      out.write("Total Classes <br>\r\n");
      out.write("Lower Primary School (1 - 5th std)<input type=\"radio\" name=\"TotClasses\">\r\n");
      out.write("Higher Primary (1 - 7th std)<input type=\"radio\" name=\"TotClasses\">\r\n");
      out.write("Higher Primary (1-8th std) <input type=\"radio\" name=\"TotClasses\"> <br>\r\n");
      out.write("Gender \r\n");
      out.write("Male<input type=\"radio\" name=\"Gender\">\r\n");
      out.write("Female<input type=\"radio\" name=\"Gender\">\r\n");
      out.write("Co-ed<input type=\"radio\" name=\"Gender\"> <br>\r\n");
      out.write("Medium of Instructions\r\n");
      out.write("Kannada <input type=\"radio\" name=\"Medium\">\r\n");
      out.write("Kannada and English <input type=\"radio\" name=\"Medium\">\r\n");
      out.write("Tamil <input type=\"radio\" name=\"Medium\">\r\n");
      out.write("Urdu <input type=\"radio\" name=\"Medium\">\r\n");
      out.write("Telugu <input type=\"radio\" name=\"Medium\">\r\n");
      out.write("Other <input type=\"text\" name=\"Medium\"> <br>\r\n");
      out.write("\r\n");
      out.write("Total Number of Students: <input type=\"text\" name=\"NumberOfStudent\" required> <br>\r\n");
      out.write("\r\n");
      out.write("Kannada Medium <br>\r\n");
      out.write("\r\n");
      out.write("<table style=\"width:50%\" name=\"KannadaMediumTable\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>Class</th>\r\n");
      out.write("    <th >Boys</th>\r\n");
      out.write("\t<th >Girls</th>\r\n");
      out.write("\t<th >Total</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 1 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 2 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 3 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <td> 4 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 5 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 6 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <td> 7 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 8 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 9 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 10 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table\r\n");
      out.write("<br>\r\n");
      out.write("English Medium <br>\r\n");
      out.write("\r\n");
      out.write("<table style=\"width:50%\" name=\"EnglishMediumTable\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>Class</th>\r\n");
      out.write("    <th >Boys</th>\r\n");
      out.write("\t<th >Girls</th>\r\n");
      out.write("\t<th >Total</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 1 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 2 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 3 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <td> 4 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 5 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 6 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <td> 7 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 8 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 9 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> 10 </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("Children With Special needs\r\n");
      out.write("<table style=\"width:50%\" name=\"ChildrenWithSpecialNeeds\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>Class</th>\r\n");
      out.write("    <th >Boys</th>\r\n");
      out.write("\t<th >Girls</th>\r\n");
      out.write("\t<th >Total</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td> School </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td> Home Based Care </td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("SC/ST Children Details <br>\r\n");
      out.write("<table style=\"width:50%\" name=\"SC/ST_Children\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th colspan=\"2\" >Boys</th>\r\n");
      out.write("\t<th colspan=\"2\">Girls</th>\r\n");
      out.write("\t<th >Total</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th >SC</th>\r\n");
      out.write("\t<th >ST</th>\r\n");
      out.write("\t<th >SC</th>\r\n");
      out.write("\t<th >ST</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  \r\n");
      out.write("    <tr>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("\t<td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("\t<td><input type=\"text\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("School DISE Code <input type=\"text\" name=\"SchoolDISE\"> <br>\r\n");
      out.write("Teachers details <input type=\"text\" name=\"TeachersDetails\"> <br>\r\n");
      out.write("<br>\r\n");
      out.write("<table style=\"width:45%\" name=\"FullTimeJob\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th colspan=\"2\" >FullTime</th>\r\n");
      out.write("\t<th >Total</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th >Male</th>\r\n");
      out.write("\t<th >Female</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  \r\n");
      out.write("    <tr>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("\t<td><input type=\"text\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<table style=\"width:45%\" name=\"PartTimeJob\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th colspan=\"2\" >PartTime</th>\r\n");
      out.write("\t<th >Total</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <th >Male</th>\r\n");
      out.write("\t<th >Female</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  \r\n");
      out.write("    <tr>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("    <td><input type=\"text\"></td>\r\n");
      out.write("\t<td><input type=\"text\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"Submit\">\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row copyright\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<small class=\"block\">&copy; 2018. All Rights Reserved.</small> \r\n");
      out.write("\t\t\t\t\t\t<small class=\"block\">Designed by CFG team </small>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"fh5co-social-icons\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"twitter.com\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"facebook.com\"><i class=\"icon-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"gototop js-top\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- jQuery -->\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<!-- jQuery Easing -->\r\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\r\n");
      out.write("\t<!-- Bootstrap -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<!-- Waypoints -->\r\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("\t<!-- countTo -->\r\n");
      out.write("\t<script src=\"js/jquery.countTo.js\"></script>\r\n");
      out.write("\t<!-- Magnific Popup -->\r\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/magnific-popup-options.js\"></script>\r\n");
      out.write("\t<!-- Stellar -->\r\n");
      out.write("\t<script src=\"js/jquery.stellar.min.js\"></script>\r\n");
      out.write("\t<!-- Main -->\r\n");
      out.write("\t<script src=\"js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
