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
							<h1 class="mb30">CareWorks Foundation</h1>
                                                        <h2 class="mb30">SEP-Need Assesment Form</h2>
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
	
       Sanitation <br>
<form action="enterdetails2" method="post" align = "center"> 
    School ID <input type="text" name="SchoolID" required> <br> <br>
<table style="width:50%" name="Sanitation">
  <tr>
    <th>Toilet Details</th>
    <th >Availability</th>
	<th >Req. Repair</th>
	<th >New Requirement</th>
	<th >Area of improvement required</th>
  </tr>

  <tr>
      <td><input type="label" value="Toilet for boys" name="TFB0"> </td>
    <td><select name="TFB1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFB2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFB3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="TFB4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Urinals for boys" name="UFB0"> </td>
    <td><select name="UFB1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="UFB2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="UFB3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="UFB4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="toilet for girls" name="TFG0"></td>
    <td><select name="TFG1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFG2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFG3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="TFG4"></td>
  </tr>
  
  <tr>
  
  <tr>
  <td><input type="label" value=" No. of Toilets for CWSN " name="TFC0"></td>
    <td><select name="TFC1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFC2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFC3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="TFC4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Toilet for staff" name="TFS0"></td>
    <td><select name="TFS1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFS2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="TFS3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="TFS4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Painting" name="P0"></td>
    <td><select name="P1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="P2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="P3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="P4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Handwash Area" name="HW0"></td>
    <td><select name="HW1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="HW2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="HW3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="HW4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Utensils Cleaning Area" name="UCA0"></td>
    <td><select name="UCA1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="UCA2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td><select name="UCA3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="UCA4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Health Campus organized every year?" name="HCO0"></td>
    <td><select name="HCO1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td>-</td>
    <td><select name="HCO3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="HCO4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="General Camp" name="GC0"></td>
    <td><select name="GC1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td>-</td>
    <td><select name="GC3">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="GC4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Dental Camp " name="DC0"></td>
    <td><select name="DC1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td>-</td>
    <td><select name="DC2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="DC4"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Eye Check up " name="EC0"></td>
    <td><select name="EC1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td>-</td>
    <td><select name="EC2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="EC3"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="Medicines are provided? " name="M0"></td>
    <td><select name="M1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td>-</td>
    <td><select  name="M2">
  <option value="YES">YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="M3"></td>
  </tr>
  
  <tr>
  <td><input type="label" value="First Aid " name="FA0"></td>
    <td><select name="FA1">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
    <td>-</td>
    <td><select name="FA2">
  <option value="YES" >YES</option>
  <option value="NO" >NO</option>
  </select></td>
	<td><input type="text" name="FA3"></td>
  </tr>
  
</table>

<input type="submit" value="Submit">
<input type="Button" value="next">
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

