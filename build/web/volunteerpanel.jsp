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
	
<form action="enterdetails" method="post" align = "center">
School ID <input type="text" name="SchoolID" required> <br> <br>
School Name <input type="text" name="SchoolName" required> <br> <br>
Locality   <br>
Rural <input type="radio" name="Locality" value="Rural">
Urban <input type="radio" name="Locality" value="Urban">
Tribal <input type="radio" name="Locality" value="Tribal"> <br>
School Address <textarea  name = "SchoolAddress" rows="4" cols="50" placeholder="Please enter the address" required> </textarea> <br> <br>
District <textarea name = "District" rows="4" cols="50" placeholder="Please enter the District" required> </textarea> <br> <br>
State <textarea name = "State" rows="4" cols="50" placeholder="Please enter the State" required> </textarea> <br> <br>
Total Classes <br>
Lower Primary School (1 - 5th std)<input type="radio" name="TotClasses" value="LPS">
Higher Primary (1 - 7th std)<input type="radio" name="TotClasses" value="HP7">
Higher Primary (1-8th std) <input type="radio" name="TotClasses" value="HP8"> <br>
Gender 
Male<input type="radio" name="Gender" value="Male">
Female<input type="radio" name="Gender" value="Female">
Co-ed<input type="radio" name="Gender" value="Co-ed">  <br>
Medium of Instructions
Kannada <input type="radio" name="Medium" value="Kannada">
Kannada and English <input type="radio" name="Medium" value="Kannada and English">
Tamil <input type="radio" name="Medium" value="Tamil">
Urdu <input type="radio" name="Medium" value="Urdu">
Telugu <input type="radio" name="Medium" value="Telugu">
Other <input type="text" name="Medium" value="Other"> <br>

Total Number of Students: <input type="text" name="NumberOfStudent" required> <br>

Students <br>

<table style="width:50%" name="KannadaMediumTable">
  <tr>
    <th>Class</th>
    <th >Boys</th>
	<th >Girls</th>
        <th>Medium</th>
	<th >Total</th>
        
  </tr>
  <tr>
      <td> <input type="label" name="c1" value="1"/></td>
    <td><input type="text" name = "BKM1"></td>
    <td><input type="text" name = "GKM1"></td>
    <td><input type="text" name = "MKM1"></td>
     <td><input type="text" name = "TKM1"></td>
  </tr>
  <tr>
    <td><input type="label" name="c2" value="2"/></td>
    <td><input type="text" name = "BKM2"></td>
    <td><input type="text" name = "GKM2"></td>
    <td><input type="text" name = "MKM2"></td>
    <td><input type="text" name = "TKM2"></td>
  </tr>
  <tr>
    <td> <input type="label" name="c3" value="3"/> </td>
    <td><input type="text" name = "BKM3"></td>
    <td><input type="text" name = "GKM3"></td>
    <td><input type="text" name = "MKM3"></td>
    <td><input type="text" name = "TKM3"></td>
  </tr>
  <td> <input type="label" name="c4" value="4"/> </td>
    <td><input type="text" name = "BKM4"></td>
    <td><input type="text" name = "GKM4"></td>
    <td><input type="text" name = "MKM4"></td>
    <td><input type="text" name = "TKM4"></td>
  </tr>
  <tr>
    <td><input type="label" name="c5" value="5"/> </td>
    <td><input type="text" name = "BKM5"></td>
    <td><input type="text" name = "GKM5"></td>
    <td><input type="text" name = "MKM5"></td>
    <td><input type="text" name = "TKM5"></td>
  </tr>
  <tr>
    <td><input type="label" name="c6" value="6"/></td>
    <td><input type="text" name = "BKM6"></td>
    <td><input type="text" name = "GKM6"></td>
    <td><input type="text" name = "MKM6"></td>
    <td><input type="text" name = "TKM6"></td>
  </tr>
  <td><input type="label" name="c7" value="7"/></td>
    <td><input type="text" name = "BKM7"></td>
    <td><input type="text" name = "GKM7"></td>
    <td><input type="text" name = "MKM7"></td>
    <td><input type="text" name = "TKM7"></td>
  </tr>
  <tr>
    <td> <input type="label" name="c8" value="8"/> </td>
    <td><input type="text" name = "BKM8"></td>
    <td><input type="text" name = "GKM8"></td>
    <td><input type="text" name = "MKM8"></td>
    <td><input type="text" name = "TKM8"></td>
  </tr>
  <tr>
    <td> <input type="label" name="c9" value="9"/> </td>
    <td><input type="text" name = "BKM9"></td>
    <td><input type="text"name = "GKM9"></td>
    <td><input type="text" name = "MKM9"></td>
    <td><input type="text"name = "TKM9"></td>
  </tr>
  <tr>
    <td> <input type="label" name="c10" value="10"/> </td>
    <td><input type="text" name = "BKM10"></td>
    <td><input type="text" name = "GKM10"></td>
    <td><input type="text" name = "MKM10"></td>
    <td><input type="text" name = "TKM10"></td>
  </tr>

</table
<br>

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
    <td><input type="text" name = "SC1"></td>
    <td><input type="text" name = "SC2"></td>
	<td><input type="text" name = "SC3"></td>
    <td><input type="text" name = "SC4"></td>
	<td><input type="text" name = "SC5"></td>
    </tr>
  </tr>
  
</table>

School DISE Code <input type="text" name="SchoolDISE"> <br>

<br>
<table style="width:45%" name="FullTimeJob">
  <tr>
    <th colspan="2" >FullTime/PartTime</th>
	
  </tr>
  
  <tr>
    <tr>
    <th >Male</th>
	<th >Female</th>
        <th>FullTime/PartTime</th>
        <th >Total</th>
    </tr>
  
    <tr>
    <td><input type="text" name = "FT1"></td>
    <td><input type="text" name = "FT2"></td>
	<td><input type="text" name = "FT3"></td>
        <td><input type="text" name = "FT4"></td>
    </tr>
  </tr>
  
</table>
<br>
<br>
School Profile continuation <br>

<table style="width:50%" name="StudentProf2">
  <tr>
    <th>Designation</th>
    <th >Name</th>
	<th >Contact Number</th>
	<th >Email id</th>
  </tr>
  
   <td> <input type="label" name="HM" value="HM"/> </td>
    <td><input type="text" name="HM1"></td>
    <td><input type="text" name="HM2">></td>
    <td><input type="email" name="HM3">></td>
  </tr>
  
  <td><input type="label" name="AT" value="Assistant Teacher"/></td>
    <td><input type="text" name="AT1">></td>
    <td><input type="text" name="AT2">></td>
    <td><input type="email" name="AT3">></td>
  </tr>
  
  <td> <input type="label" name="CRP" value="CRP"/> </td>
    <td><input type="text" name="CRP1">></td>
    <td><input type="text" name="CRP2">></td>
    <td><input type="email"name="CRP3">></td>
  </tr>
  
  <td> <input type="label" name="BRC" value="BRC"/> </td>
    <td><input type="text" name="BRC1">></td>
    <td><input type="text" name="BRC2">></td>
    <td><input type="email" name="BRC3">></td>
  </tr>
  
  <td><input type="label" name="BEO" value="BEO/CEO"/></td>
    <td><input type="text" name="BEO1">></td>
    <td><input type="text" name="BEO2">></td>
    <td><input type="email" name="BEO3">></td>
  </tr>
  
</table>

<table style="width:50%" name="StudentProf4">
  <tr>

    <th>Sl. No.</th>
    <th >Name of Organization/individual donor</th>
	<th >No. org Members</th>
	<th >Major Activities</th>
	<th >Contact Details</th>
  </tr>
  <td> 1 </td>
    <td><input type="text" name="SP411"></td>
    <td><input type="text" name="SP412"></td>
    <td><input type="text" name="SP413"></td>
	<td><input type="text" name="SP414"></td>
  </tr>
  <td> 2 </td>
    <td><input type="text" name="SP421"></td>
    <td><input type="text" name="SP422"></td>
    <td><input type="text" name="SP423"></td>
	<td><input type="text" name="SP424"></td>
  </tr>
  <td> 3 </td>
    <td><input type="text" name="SP431"></td>
    <td><input type="text" name="SP432"></td>
    <td><input type="text" name="SP433"></td>
	<td><input type="text" name="SP434"></td>
  </tr>
  
</table>

Any Other Information:
<Textarea rows="3" cols="50" name="otherinfo" ></Textarea>


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

