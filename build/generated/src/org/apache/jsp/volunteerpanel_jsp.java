package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class volunteerpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\n");
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
      out.write("\t<header id=\"fh5co-header\" class=\"fh5co-cover fh5co-cover-sm\" role=\"banner\" style=\"background-image:url(images/img_bg_1.jpg);\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("\t\t<div class=\"overlay\"></div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-7 text-left\">\n");
      out.write("\t\t\t\t\t<div class=\"display-t\">\n");
      out.write("\t\t\t\t\t\t<div class=\"display-tc animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"mb30\">CareWorks Foundation</h1>\n");
      out.write("                                                        <h2 class=\"mb30\">SEP-Need Assesment Form</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\n");
      out.write("<form action=\"enterdetails\" method=\"post\" align = \"center\">\n");
      out.write("School ID <input type=\"text\" name=\"SchoolID\" required> <br> <br>\n");
      out.write("School Name <input type=\"text\" name=\"SchoolName\" required> <br> <br>\n");
      out.write("Locality   <br>\n");
      out.write("Rural <input type=\"radio\" name=\"Locality\" value=\"Rural\">\n");
      out.write("Urban <input type=\"radio\" name=\"Locality\" value=\"Urban\">\n");
      out.write("Tribal <input type=\"radio\" name=\"Locality\" value=\"Tribal\"> <br>\n");
      out.write("School Address <textarea  name = \"SchoolAddress\" rows=\"4\" cols=\"50\" placeholder=\"Please enter the address\" required> </textarea> <br> <br>\n");
      out.write("District <textarea name = \"District\" rows=\"4\" cols=\"50\" placeholder=\"Please enter the District\" required> </textarea> <br> <br>\n");
      out.write("State <textarea name = \"State\" rows=\"4\" cols=\"50\" placeholder=\"Please enter the State\" required> </textarea> <br> <br>\n");
      out.write("Total Classes <br>\n");
      out.write("Lower Primary School (1 - 5th std)<input type=\"radio\" name=\"TotClasses\" value=\"LPS\">\n");
      out.write("Higher Primary (1 - 7th std)<input type=\"radio\" name=\"TotClasses\" value=\"HP7\">\n");
      out.write("Higher Primary (1-8th std) <input type=\"radio\" name=\"TotClasses\" value=\"HP8\"> <br>\n");
      out.write("Gender \n");
      out.write("Male<input type=\"radio\" name=\"Gender\" value=\"Male\">\n");
      out.write("Female<input type=\"radio\" name=\"Gender\" value=\"Female\">\n");
      out.write("Co-ed<input type=\"radio\" name=\"Gender\" value=\"Co-ed\">  <br>\n");
      out.write("Medium of Instructions\n");
      out.write("Kannada <input type=\"radio\" name=\"Medium\" value=\"Kannada\">\n");
      out.write("Kannada and English <input type=\"radio\" name=\"Medium\" value=\"Kannada and English\">\n");
      out.write("Tamil <input type=\"radio\" name=\"Medium\" value=\"Tamil\">\n");
      out.write("Urdu <input type=\"radio\" name=\"Medium\" value=\"Urdu\">\n");
      out.write("Telugu <input type=\"radio\" name=\"Medium\" value=\"Telugu\">\n");
      out.write("Other <input type=\"text\" name=\"Medium\" value=\"Other\"> <br>\n");
      out.write("\n");
      out.write("Total Number of Students: <input type=\"text\" name=\"NumberOfStudent\" required> <br>\n");
      out.write("\n");
      out.write("Students <br>\n");
      out.write("\n");
      out.write("<table style=\"width:50%\" name=\"KannadaMediumTable\">\n");
      out.write("  <tr>\n");
      out.write("    <th>Class</th>\n");
      out.write("    <th >Boys</th>\n");
      out.write("\t<th >Girls</th>\n");
      out.write("        <th>Medium</th>\n");
      out.write("\t<th >Total</th>\n");
      out.write("        \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td> <input type=\"label\" name=\"c1\" value=\"1\"/></td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM1\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM1\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM1\"></td>\n");
      out.write("     <td><input type=\"text\" name = \"TKM1\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><input type=\"label\" name=\"c2\" value=\"2\"/></td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM2\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM2\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM2\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM2\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td> <input type=\"label\" name=\"c3\" value=\"3\"/> </td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM3\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM3\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM3\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM3\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <td> <input type=\"label\" name=\"c4\" value=\"4\"/> </td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM4\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM4\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM4\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM4\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><input type=\"label\" name=\"c5\" value=\"5\"/> </td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM5\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM5\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM5\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM5\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><input type=\"label\" name=\"c6\" value=\"6\"/></td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM6\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM6\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM6\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM6\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <td><input type=\"label\" name=\"c7\" value=\"7\"/></td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM7\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM7\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM7\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM7\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td> <input type=\"label\" name=\"c8\" value=\"8\"/> </td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM8\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM8\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM8\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM8\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td> <input type=\"label\" name=\"c9\" value=\"9\"/> </td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM9\"></td>\n");
      out.write("    <td><input type=\"text\"name = \"GKM9\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM9\"></td>\n");
      out.write("    <td><input type=\"text\"name = \"TKM9\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td> <input type=\"label\" name=\"c10\" value=\"10\"/> </td>\n");
      out.write("    <td><input type=\"text\" name = \"BKM10\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"GKM10\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"MKM10\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"TKM10\"></td>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("</table\n");
      out.write("<br>\n");
      out.write("\n");
      out.write(" <br>\n");
      out.write("\n");
      out.write("SC/ST Children Details <br>\n");
      out.write("<table style=\"width:50%\" name=\"SC/ST_Children\">\n");
      out.write("  <tr>\n");
      out.write("    <th colspan=\"2\" >Boys</th>\n");
      out.write("\t<th colspan=\"2\">Girls</th>\n");
      out.write("\t<th >Total</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <tr>\n");
      out.write("    <th >SC</th>\n");
      out.write("\t<th >ST</th>\n");
      out.write("\t<th >SC</th>\n");
      out.write("\t<th >ST</th>\n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("    <tr>\n");
      out.write("    <td><input type=\"text\" name = \"SC1\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"SC2\"></td>\n");
      out.write("\t<td><input type=\"text\" name = \"SC3\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"SC4\"></td>\n");
      out.write("\t<td><input type=\"text\" name = \"SC5\"></td>\n");
      out.write("    </tr>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("\n");
      out.write("School DISE Code <input type=\"text\" name=\"SchoolDISE\"> <br>\n");
      out.write("Teachers details <input type=\"text\" name=\"TeachersDetails\"> <br>\n");
      out.write("<br>\n");
      out.write("<table style=\"width:45%\" name=\"FullTimeJob\">\n");
      out.write("  <tr>\n");
      out.write("    <th colspan=\"2\" >FullTime</th>\n");
      out.write("\t<th >Total</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <tr>\n");
      out.write("    <th >Male</th>\n");
      out.write("\t<th >Female</th>\n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("    <tr>\n");
      out.write("    <td><input type=\"text\" name = \"FT1\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"FT2\"></td>\n");
      out.write("\t<td><input type=\"text\" name = \"FT3\"></td>\n");
      out.write("    </tr>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("<table style=\"width:45%\" name=\"PartTimeJob\">\n");
      out.write("  <tr>\n");
      out.write("    <th colspan=\"2\" >PartTime</th>\n");
      out.write("\t<th >Total</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <tr>\n");
      out.write("    <tr>\n");
      out.write("    <th >Male</th>\n");
      out.write("\t<th >Female</th>\n");
      out.write("    </tr>\n");
      out.write("  \n");
      out.write("    <tr>\n");
      out.write("    <td><input type=\"text\" name = \"PT1\"></td>\n");
      out.write("    <td><input type=\"text\" name = \"PT2\"></td>\n");
      out.write("\t<td><input type=\"text\" name = \"PT3\"></td>\n");
      out.write("    </tr>\n");
      out.write("  </tr>2\n");
      out.write("  \n");
      out.write("</table><br>\n");
      out.write("School Profile continuation <br>\n");
      out.write("\n");
      out.write("<table style=\"width:50%\" name=\"StudentProf2\">\n");
      out.write("  <tr>\n");
      out.write("    <th>Designation</th>\n");
      out.write("    <th >Name</th>\n");
      out.write("\t<th >Contact Number</th>\n");
      out.write("\t<th >Email id</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("   <td> HM </td>\n");
      out.write("    <td><input type=\"text\" name=\"HM1\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"HM2\">></td>\n");
      out.write("    <td><input type=\"email\" name=\"HM3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> Assistant Teacher</td>\n");
      out.write("    <td><input type=\"text\" name=\"AT1\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"AT2\">></td>\n");
      out.write("    <td><input type=\"email\" name=\"AT3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> CRP </td>\n");
      out.write("    <td><input type=\"text\" name=\"CRP1\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"CRP2\">></td>\n");
      out.write("    <td><input type=\"email\"name=\"CRP3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> BRC </td>\n");
      out.write("    <td><input type=\"text\" name=\"BRC1\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"BRC2\">></td>\n");
      out.write("    <td><input type=\"email\" name=\"BRC3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> BEO/CEO </td>\n");
      out.write("    <td><input type=\"text\" name=\"BEO1\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"BEO2\">></td>\n");
      out.write("    <td><input type=\"email\" name=\"BEO3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table style=\"width:50%\" name=\"StudentProf3\">\n");
      out.write("  <tr>\n");
      out.write("\n");
      out.write("    <th>StakeHolder</th>\n");
      out.write("    <th >total Members</th>\n");
      out.write("\t<th >Meeting Duration</th>\n");
      out.write("\t<th >Contact details</th>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("   <td> SDMC </td>\n");
      out.write("    <td><input type=\"text\" name=\"SDMC1\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"SDMC2\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"SDMC3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> SMC/SBC</td>\n");
      out.write("    <td><input type=\"text\" name=\"SM1\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"SM2\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"SM3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> Allumini Association </td>\n");
      out.write("    <td><input type=\"text\" name=\"AA1\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"AA2\">></td>\n");
      out.write("    <td><input type=\"text\" name=\"AA3\">></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> Shala Samsath </td>\n");
      out.write("    <td><input type=\"text\" name=\"SS1\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SS2\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SS3\"></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("  <td> Parents Teachers Meeting </td>\n");
      out.write("    <td><input type=\"text\" name=\"PTM1\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"PTM2\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"PTM3\"></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table style=\"width:50%\" name=\"StudentProf4\">\n");
      out.write("  <tr>\n");
      out.write("\n");
      out.write("    <th>Sl. No.</th>\n");
      out.write("    <th >Name of Organization/individual donor</th>\n");
      out.write("\t<th >No. org Members</th>\n");
      out.write("\t<th >Major Activities</th>\n");
      out.write("\t<th >Contact Details</th>\n");
      out.write("  </tr>\n");
      out.write("  <td> 1 </td>\n");
      out.write("    <td><input type=\"text\" name=\"SP411\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SP412\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SP413\"></td>\n");
      out.write("\t<td><input type=\"text\" name=\"SP414\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <td> 2 </td>\n");
      out.write("    <td><input type=\"text\" name=\"SP421\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SP422\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SP423\"></td>\n");
      out.write("\t<td><input type=\"text\" name=\"SP424\"></td>\n");
      out.write("  </tr>\n");
      out.write("  <td> 3 </td>\n");
      out.write("    <td><input type=\"text\" name=\"SP431\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SP432\"></td>\n");
      out.write("    <td><input type=\"text\" name=\"SP433\"></td>\n");
      out.write("\t<td><input type=\"text\" name=\"SP434\"></td>\n");
      out.write("  </tr>\n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("\n");
      out.write("Any Other Information:\n");
      out.write("<Textarea rows=\"3\" cols=\"50\" name=\"otherinfo\" ></Textarea>\n");
      out.write("\n");
      out.write("\n");
      out.write("<input type=\"submit\" value=\"Submit\">\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\t\n");
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
