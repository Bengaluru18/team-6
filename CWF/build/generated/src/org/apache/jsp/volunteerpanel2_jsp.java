package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class volunteerpanel2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<body align=\"center\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
      out.write("\t\t\t\t\t\t\t<h1 class=\"mb30\">CareWorks Foundation</h1>\r\n");
      out.write("                                                        <h2 class=\"mb30\">SEP- Need Assesment Form 2</h2>\r\n");
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
      out.write("\t\r\n");
      out.write("       Sanitation <br>\r\n");
      out.write("<form action=\"enterdetails2\" method=\"post\" align = \"center\"> \r\n");
      out.write("    School ID <input type=\"text\" name=\"SchoolID\" required> <br> <br>\r\n");
      out.write("<table style=\"width:50%\" name=\"Sanitation\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <th>Toilet Details</th>\r\n");
      out.write("    <th >Availability</th>\r\n");
      out.write("\t<th >Req. Repair</th>\r\n");
      out.write("\t<th >New Requirement</th>\r\n");
      out.write("\t<th >Area of improvement required</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("\r\n");
      out.write("  <tr>\r\n");
      out.write("      <td><input type=\"label\" value=\"Toilet for boys\" name=\"TFB0\"> </td>\r\n");
      out.write("    <td><select name=\"TFB1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFB2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFB3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"TFB4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Urinals for boys\" name=\"UFB0\"> </td>\r\n");
      out.write("    <td><select name=\"UFB1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"UFB2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"UFB3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"UFB4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"toilet for girls\" name=\"TFG0\"></td>\r\n");
      out.write("    <td><select name=\"TFG1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFG2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFG3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"TFG4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\" No. of Toilets for CWSN \" name=\"TFC0\"></td>\r\n");
      out.write("    <td><select name=\"TFC1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFC2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFC3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"TFC4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Toilet for staff\" name=\"TFS0\"></td>\r\n");
      out.write("    <td><select name=\"TFS1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFS2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"TFS3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"TFS4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Painting\" name=\"P0\"></td>\r\n");
      out.write("    <td><select name=\"P1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"P2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"P3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"P4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Handwash Area\" name=\"HW0\"></td>\r\n");
      out.write("    <td><select name=\"HW1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"HW2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"HW3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"HW4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Utensils Cleaning Area\" name=\"UCA0\"></td>\r\n");
      out.write("    <td><select name=\"UCA1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"UCA2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td><select name=\"UCA3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"UCA4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Health Campus organized every year?\" name=\"HCO0\"></td>\r\n");
      out.write("    <td><select name=\"HCO1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td>-</td>\r\n");
      out.write("    <td><select name=\"HCO3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"HCO4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"General Camp\" name=\"GC0\"></td>\r\n");
      out.write("    <td><select name=\"GC1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td>-</td>\r\n");
      out.write("    <td><select name=\"GC3\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"GC4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Dental Camp \" name=\"DC0\"></td>\r\n");
      out.write("    <td><select name=\"DC1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td>-</td>\r\n");
      out.write("    <td><select name=\"DC2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"DC4\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Eye Check up \" name=\"EC0\"></td>\r\n");
      out.write("    <td><select name=\"EC1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td>-</td>\r\n");
      out.write("    <td><select name=\"EC2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"EC3\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"Medicines are provided? \" name=\"M0\"></td>\r\n");
      out.write("    <td><select name=\"M1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td>-</td>\r\n");
      out.write("    <td><select  name=\"M2\">\r\n");
      out.write("  <option value=\"YES\">YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"M3\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("  <tr>\r\n");
      out.write("  <td><input type=\"label\" value=\"First Aid \" name=\"FA0\"></td>\r\n");
      out.write("    <td><select name=\"FA1\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("    <td>-</td>\r\n");
      out.write("    <td><select name=\"FA2\">\r\n");
      out.write("  <option value=\"YES\" >YES</option>\r\n");
      out.write("  <option value=\"NO\" >NO</option>\r\n");
      out.write("  </select></td>\r\n");
      out.write("\t<td><input type=\"text\" name=\"FA3\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  \r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("<input type=\"submit\" value=\"Submit\">\r\n");
      out.write("<input type=\"Button\" value=\"next\">\r\n");
      out.write("</form>\r\n");
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
