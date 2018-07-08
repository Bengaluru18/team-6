<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
	<head>
            <style >table, th, td {
    border: 1px solid black;
    align: center;
    padding: 15px;
    table {
    border-spacing: 5px;
}
}</style>
	<title>Care Works</title>
	

  	<!-- Facebook and Twitter integration -->
	
	<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700" rel="stylesheet">
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body align="center">
	
	
	<div class="fh5co-loader"></div>
	
	<div id="page">
	<nav class="fh5co-nav" role="navigation">
		<div class="container">
			<div class="row">
				<div class="col-xs-2 text-left">
					<div id="fh5co-logo"><a href="home.jsp">CWF<span>.</span></a></div>
				</div>
				<div class="col-xs-10 text-right menu-1">
					<ul>
						<li><a href="home.jsp">Home</a></li>
						<li >
							<a href="logout">Logout</a>
							
						</li>

						
						
						
						
					</ul>
				</div>
			</div>
			
		</div>
	</nav>

	<header id="fh5co-header" class="fh5co-cover fh5co-cover-sm" role="banner" style="background-image:url(images/img_bg_1.jpg);" data-stellar-background-ratio="0.5">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-7 text-left">
					<div class="display-t">
						<div class="display-tc animate-box" data-animate-effect="fadeInUp">
							<h1 class="mb30">Administrator Portal</h1>
                                                        <h2 class="mb30">CareWorks Foundation</h2>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
            <%
    
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
%>    
<table style="width:100%" align="center">
  
    <tr>
        <th align="center" > School ID</th>
        
        <th> School Name </th>
        
        <th> No. Of Students </th>
        
    </tr>
<%
    rs = st.executeQuery("SELECT school_id,school_name, total_no_of_students  FROM school_details order by total_no_of_students desc;");
    while(rs.next())
    { 
    school_id=rs.getInt(1);
    school_name=rs.getString(2);
    total=rs.getString(3);
    
%>    
    <tr>
        
        <td>
            <%=school_id%>
        </td>
        
        
        <td>
            <%=school_name%>
        </td>
    <td>
            <%=total%>
        </td>
        
    </tr>
    
<tr>
    <%
    
    }
    %>
    
    
</tr>
</table>
	
    <br> 
    <form action="viewdetails" name="viewdetails" method="post">
       <h1>Enter School ID to view details</h1> <input type="text" name="id"/>
        <input type="submit" value="submit"/>
    </form>

			<div class="row copyright">
				<div class="col-md-12 text-center">
					<p>
						<small class="block">&copy; 2018. All Rights Reserved.</small> 
						<small class="block">Designed by CFG team </small>
					</p>
					<p>
						<ul class="fh5co-social-icons">
							<li><a href="twitter.com"><i class="icon-twitter"></i></a></li>
							<li><a href="facebook.com"><i class="icon-facebook"></i></a></li>
						</ul>
					</p>
				</div>
			</div>

		</div>
	</footer>
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Stellar -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>

	</body>
</html>

