<!DOCTYPE HTML>

<html>
	<head>
	
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
	<body>
		
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
							<h1 class="mb30">Enter the Data</h1>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
            <div class="container">
			<div class="row">
				
			</div>
		</div>
	<form  action="" method="get" align = "center">
            <br><br>School Profile <input type="text" name="SchoolProfile" required> <br> <br>
Name <input type="text" name="SchoolName" required> <br> <br>
Locality   <br>
Rural <input type="radio" name="Locality">
Urban <input type="radio" name="Locality">
Tribal <input type="radio" name="Locality"> <br>
School Address <textarea  name = "SchoolAddress" rows="4" cols="50" placeholder="Please enter the address" required> </textarea> <br> <br>
Cluster/Block/Region/State <textarea name = "Region" rows="4" cols="50" placeholder="Please enter the Region" required> </textarea> <br> <br>
Total Classes <br>
Lower Primary School (1 - 5th std)<input type="radio" name="TotClasses">
Higher Primary (1 - 7th std)<input type="radio" name="TotClasses">
Higher Primary (1-8th std) <input type="radio" name="TotClasses"> <br>
Gender 
Male<input type="radio" name="Gender">
Female<input type="radio" name="Gender">
Co-ed<input type="radio" name="Gender"> <br>
Medium of Instructions
Kannada <input type="radio" name="Medium">
Kannada and English <input type="radio" name="Medium">
Tamil <input type="radio" name="Medium">
Urdu <input type="radio" name="Medium">
Telugu <input type="radio" name="Medium">
Other <input type="text" name="Medium"> <br>

Total Number of Students: <input type="text" name="NumberOfStudent" required> <br>

Kannada Medium <br>

<table style="width:50%" name="KannadaMediumTable">
  <tr>
    <th>Class</th>
    <th >Boys</th>
	<th >Girls</th>
	<th >Total</th>
  </tr>
  <tr>
    <td> 1 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 2 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 3 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <td> 4 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 5 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 6 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <td> 7 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 8 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 9 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 10 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
</table
<br>
English Medium <br>

<table style="width:50%" name="EnglishMediumTable">
  <tr>
    <th>Class</th>
    <th >Boys</th>
	<th >Girls</th>
	<th >Total</th>
  </tr>
  <tr>
    <td> 1 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 2 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 3 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <td> 4 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 5 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 6 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <td> 7 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 8 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 9 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> 10 </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
</table>
Children With Special needs
<table style="width:50%" name="ChildrenWithSpecialNeeds">
  <tr>
    <th>Class</th>
    <th >Boys</th>
	<th >Girls</th>
	<th >Total</th>
  </tr>
    <tr>
    <td> School </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
  <tr>
    <td> Home Based Care </td>
    <td><input type="text"></td>
    <td><input type="text"></td>
    <td><input type="text"></td>
  </tr>
</table>
<br>
SC/ST Children Details <br>
<table style="width:50%" name="SC/ST_Children">
  <tr>
    <th colspan="2" >Boys</th>
	<th colspan="2">Girls</th>
	<th >Total</th>
  </tr>
  
  <tr>
    <tr>
    <th >SC</th>
	<th >ST</th>
	<th >SC</th>
	<th >ST</th>
    </tr>
  
    <tr>
    <td><input type="text"></td>
    <td><input type="text"></td>
	<td><input type="text"></td>
    <td><input type="text"></td>
	<td><input type="text"></td>
    </tr>
  </tr>
  
</table>

School DISE Code <input type="text" name="SchoolDISE"> <br>
Teachers details <input type="text" name="TeachersDetails"> <br>
<br>
<table style="width:45%" name="FullTimeJob">
  <tr>
    <th colspan="2" >FullTime</th>
	<th >Total</th>
  </tr>
  
  <tr>
    <tr>
    <th >Male</th>
	<th >Female</th>
    </tr>
  
    <tr>
    <td><input type="text"></td>
    <td><input type="text"></td>
	<td><input type="text"></td>
    </tr>
  </tr>
  
</table>
<br>
<table style="width:45%" name="PartTimeJob">
  <tr>
    <th colspan="2" >PartTime</th>
	<th >Total</th>
  </tr>
  
  <tr>
    <tr>
    <th >Male</th>
	<th >Female</th>
    </tr>
  
    <tr>
    <td><input type="text"></td>
    <td><input type="text"></td>
	<td><input type="text"></td>
    </tr>
  </tr>
  
</table>

<input type="submit" value="Submit">

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

