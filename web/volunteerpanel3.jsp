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
<form action="enterdetails3" method="post" align = "center"> 
    School ID <input type="text" name="SchoolID" required> <br> <br>
Computer Lab
<table style="width:100%" name="Computer lab">
  <tr>

    <th>Indicators</th>
    <th >Total Available</th>
	<th > Req. Repair</th>
	<th >New req.</th>
<th>Area of improvement required</th>
  </tr>

    <tr>
    <td><input type="label" value="NO. of Computers" name="nc0"> </td>
    <td><input type="text" name="nc1">
   </td>
    <td><select name="nc2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="nc3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><input type="text" name="nc4"></td>
  </tr>
  <tr>
    <td><input type="label" value=" laptops" name="lp0"> </td>
    <td><input type="text" name="lp1"></td>
    <td><select name="lp2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="lp3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="lp4"></td>
</tr>


  <tr>
    <td><input type="label "value=" ups" name="up0"> </td>
    <td><input type="text" name="up1"></td>
    <td><select name="up2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="up3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="up4"></td>
</tr>


  <tr>
    <td><input type="label" value=" Computer tables" name="ct0"> </td>
    <td><input type="text" name="ct1"></td>
    <td><select name="ct2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="ct3">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="ct4"></td>
</tr>


  <tr>
    <td> <input type="label" value="Computer chairs" name="cc0"> </td>
    <td><input type="text" name="cc1"></td>
    <td><select name="cc2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="cc3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="cc4"></td>
</tr>



  <tr>
    <td> <input type="label" value="Projector" name="pj0"> </td>
    <td><input type="text" name="pj1"></td>
    <td><select name="pj2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="pj3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="pj4"></td>
</tr>

  <tr>
    <td><input type="label" value=" Projector Screen" name="ps0"> </td>
    <td><input type="text" name="ps1"></td>
    <td><select name="ps2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="ps3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="ps4"></td>
</tr>

  <tr>
    <td><input type="label" value=" Renovation work required" name="rw0">  </td>
    <td><input type="text" name="rw1"></td>
    <td>
<select name="rw2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="rw3">
   <option value="YES" >Yes</option>
<option value="NO" >No</option>
</select></td>
     <td><input type="text" name="rw4"></td>
</tr>

  <tr>
    <td><input type="label" value=" Any other" name="an0"> </td>
    <td><input type="text" name="an1"></td>
    <td><select name="an2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="an3">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="an4"></td>
</tr>
</table>


Library
<table style="width:100%" name="library">
  <tr>

    <th>Indicators</th>
    <th >Total Available</th>
	<th > Req. Repair</th>
	<th >New req.</th>
<th>Area of improvement required</th>
  </tr>

    <tr>
    <td><input type="label" value=" Is library is arranged level wise" name="la0"> </td>
    <td><input type="text"name="la1" ></td>
    <td><select name="la2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="la3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><input type="text" name="la4"></td>
  </tr>

  <tr>
    <td><input type="label" value=" No. of books available" name="nb0"> </td>
    <td><input type="text" name="nb1"></td>
    <td><select name="nb2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="nb3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="nb4"></td>
</tr>


  <tr>   
 <td><input type="label" value=" Closed Cupboard"  name="cp0"></td>
    <td><input type="text" name="cp1"></td>
    <td><select name="cp2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="cp3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="cp4"></td>
</tr>


  <tr>
    <td><input type="label" value=" Open Cupboard" name="oc0"> </td>
    <td><input type="text" name="oc1"></td>
    <td><select name="oc2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="oc3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="oc4"></td>
</tr>


  <tr>
    <td><input type="label" value=" Table" name="t0"> </td>
    <td><input type="text" name="t1"></td>
    <td><select  name="t2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="t3">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="t4"></td>
</tr>



  <tr>
    <td><input type="label" value=" chairs/Benches" name="cb0"> </td>
    <td><input type="text" name="cb1"></td>
    <td><select name="cb2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="cb3">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type=" text" name="cb4"></td>
</tr>


  <tr>
    <td><input type="label" value=" Any other" name="ay0"> </td>
    <td><input type="text" name="ay1"></td>
    <td><select name="ay2">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="ay3">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="ay4"></td>
</tr>
</table>






Science Lab
<table style="width:100%" name="science">
  <tr>

    <th>Indicators</th>
    <th >Total Available</th>
	<th > Req. Repair</th>
	<th >New req.</th>
<th>Area of improvement required</th>
  </tr>

    <tr>
    <td><input type="label" value="Wall mounted table" name="wm0">  </td>
    <td><input type="text"name="wm1" ></td>
    <td><select name="wm2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="wm3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><input type="text" name="wm4"></td>
  </tr>
  <tr>
    <td><input type="label" value=" center table" name="ce0"> </td>
    <td><input type="text" name="ce1"></td>
    <td><select name="ce2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="ce3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="ce4"></td>
</tr>


  <tr>   
 <td> <input type="label" value="Chemicals" name="ch0"></td>
    <td><input type="text" name="ch1" ></td>
    <td><select name="ch2">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="ch3">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text"name="ch4" ></td>
</tr>


  <tr>
    <td><input type="label" value=" washbasin" name="wb0"> </td>
    <td><input type="text" name="wb1"></td>
    <td><select name="wb2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="wb3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="wb4"></td>
</tr>


  <tr>
    <td> <input type="label" value="Models" name="mo0"> </td>
    <td><input type="text" name="mo1"></td>
    <td><select name="mo2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="mo3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text"name="mo4" ></td>
</tr>

 
  <tr>
    <td><input type="label" value=" Any other" name="ao0"> </td>
    <td><input type="text" name="ao1"></td>
    <td><select name="ao2">
   <option value="YES" >Yes</option>
<option value="NO" >No</option>
</select></td>
    <td><select name="ao3">
   <option value="YES" >Yes</option>
<option value="NO" >No</option>
</select></td>
     <td><input type="text" name="ao4"></td>
</tr>
</table>





Drinking Water
<table style="width:100%" name="water">
  <tr>

    <th>Indicators</th>
    <th >Total Available</th>
	<th > Req. Repair</th>
	<th >New req.</th>
<th>Area of improvement required</th>
  </tr>

    <tr>
    <td><input type="label" value="RO Unit" name="ro0">  </td>
    <td><input type="text" name="ro1"></td>
    <td><select  name="ro2">
   <option value="YES">Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="ro3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><input type="text" name="ro4"></td>
  </tr>
  <tr>
    <td><input type="label" value=" UV Unit" name="uv0"> </td>
    <td><input type="text" name="uv1"></td>
    <td><select name="uv2">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
    <td><select name="uv3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="uv4"></td>
</tr>


  <tr>   
 <td><input type="label" value=" Storage Facility" name="sf0"></td>
    <td><input type="text" name="sf1"></td>
    <td><select name="sf2">
   <option value="YES" >Yes</option>
<option value="NO" >No</option>
</select></td>
    <td><select name="sf3">
   <option value="YES" >Yes</option>
<option value="NO">No</option>
</select></td>
     <td><input type="text" name="sf4"></td>
</tr>
</table>

<table style="width:100%" name="any">
<tr>

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

