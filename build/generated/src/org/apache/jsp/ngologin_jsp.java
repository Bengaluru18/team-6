package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ngologin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\r\n");
      out.write("\tConcept by gettemplates.co\r\n");
      out.write("\tTwitter: http://twitter.com/gettemplateco\r\n");
      out.write("\tURL: http://gettemplates.co\r\n");
      out.write("-->\r\n");
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
      out.write("\t\t\t\t\t<div id=\"fh5co-logo\"><a href=\"index.jsp\">CWF<span>.</span></a></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-xs-10 text-right menu-1\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"home.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"has-dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"adminlogin.jsp\">Login</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"adminlogin.jsp\">Admin</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"ngologin.jsp\">NGO</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"volunteerlogin.jsp\">Volunteer</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"fh5co-contact\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 animate-box\">\r\n");
      out.write("\t\t\t\t\t<h3>NGO Login</h3>\r\n");
      out.write("\t\t\t\t\t<form action=\"loginngo\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"email\">Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" id=\"email\" name=\"loginusername\" class=\"form-control\" placeholder=\"Your email address\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                            <div class=\"row form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"email\">Password</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" id=\"password\" name=\"loginpassword\" class=\"form-control\" placeholder=\"Your Password\" required>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"Login\" class=\"btn btn-lg btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</form>\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row copyright\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<small class=\"block\">&copy; 2018. All Rights Reserved.</small> \r\n");
      out.write("                                                <small class=\"block\">Designed by CFG team </small>\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"fh5co-social-icons\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"twitter.com\"><i class=\"icon-twitter\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"facebook.com\"><i class=\"icon-facebook\"></i></a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                               \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
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
      out.write("\r\n");
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
