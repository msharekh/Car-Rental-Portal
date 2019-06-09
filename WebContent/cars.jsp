<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Cars</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="node_modules/bootstrap/dist/css/bootstrap.min.css">
<!-- Font Awesome -->
<link rel="stylesheet"
	href="node_modules/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet"
	href="node_modules/ionicons/dist/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="node_modules/admin-lte/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet"
	href="node_modules/admin-lte/dist/css/skins/_all-skins.min.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

<!-- Google Font -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">

<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
</style>

</head>

<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper" ng-app="carRentalApp" ng-controller="carsCtrl">


		<header class="main-header">
			<!-- Logo -->
			<a href="../../index2.jsp" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>{{title_short}}</b></span> <!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>{{title}}</b></span>
			</a>
			<!-- Header Navbar: style can be found in header.less -->
			<nav class="navbar navbar-static-top">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="push-menu"
					role="button"> <span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</a>

				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- Messages: style can be found in dropdown.less-->

						<!-- Notifications: style can be found in dropdown.less -->

						<!-- Tasks: style can be found in dropdown.less -->

						<!-- User Account: style can be found in dropdown.less -->

						<!-- Control Sidebar Toggle Button -->

					</ul>
				</div>
			</nav>
		</header>
		<!-- Left side column. contains the logo and sidebar -->

		<%@ include file="main-sidebar.html"%>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>{{formtitle}}</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li><a href="#">Forms</a></li>
					<li class="active">General Elements</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="row">
					<!-- left column -->
					<div class="col-md-6">
						<!-- general form elements -->


						<div class="box box-info">
							<div class="box-header with-border">

								<form action="CarController">
									<input type="hidden" name="command" value="ADD">

									<div class="form-group">
										<label for="carName">Car Name :</label> <input type="text"
											class="form-control" name="carName" id="carName"
											value="Honda">
									</div>

									<button type="submit" class="btn btn-default">Save</button>
								</form>
							</div>
							<div class="box-body">



								<table class="table">
									<thead>
										<tr>
											<th>Car Name</th>
											<th></th>
										</tr>

									</thead>
									<tbody>
										<c:forEach var="car" items="${CAR_LIST}">


											<c:url var="deleteLink" value="CarController">
												<c:param name="command" value="DELETE"></c:param>
												<c:param name="carId" value="${car.carId}" />
											</c:url>
											<tr>
												<td>${car.carName}</td>
												<td><a href="${deleteLink}"
													onclick="if (!(confirm('ARE YOU SURE?'))) return false;">Delete</a>

												</td>
											</tr>


										</c:forEach>


									</tbody>
								</table>


								<!-- /input-group -->
							</div>
							<!-- /.box-body -->
						</div>
						<!-- /.box -->



						<!-- Input addon -->

						<!-- /.box -->

					</div>
					<!--/.col (left) -->
					<!-- right column -->
					<div class="col-md-6">
						<div class="box-body">





							<div id="myCarousel" class="carousel slide" data-ride="carousel">
								<!-- Indicators -->
								<ol class="carousel-indicators">
									<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
									<li data-target="#myCarousel" data-slide-to="1"></li>
									<li data-target="#myCarousel" data-slide-to="2"></li>
									<li data-target="#myCarousel" data-slide-to="3"></li>
									<li data-target="#myCarousel" data-slide-to="4"></li>
								</ol>

								<!-- Wrapper for slides -->
								<div class="carousel-inner" role="listbox">

									<div class="item active">
										<img src="img/car1.jpeg" width="460" height="345">

									</div>

									<div class="item">
										<img src="img/car2.jpg" width="460" height="345">

									</div>

									<div class="item">
										<img src="img/car3.jpg" width="460" height="345">

									</div>
									<div class="item">
										<img src="img/car4.jpeg" width="460" height="345">

									</div>
									<div class="item">
										<img src="img/car5.jpg" width="460" height="345">

									</div>

								</div>

								<!-- Left and right controls -->
								<a class="left carousel-control" href="#myCarousel"
									role="button" data-slide="prev"> <span
									class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
									<span class="sr-only">Previous</span>
								</a> <a class="right carousel-control" href="#myCarousel"
									role="button" data-slide="next"> <span
									class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
									<span class="sr-only">Next</span>
								</a>
							</div>










						</div>
						<!-- /.box-body -->

					</div>
					<!--/.col (right) -->
				</div>
				<!-- /.row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		<%@ include file="main-footer.html"%>
		<!-- footer -->

		<!-- Control Sidebar -->

		<!-- /.control-sidebar -->
		<!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
		<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->

	<!-- jQuery 3 -->
	<script src="node_modules/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap 3.3.7 -->
	<script src="node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="node_modules/fastclick/lib/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="node_modules/admin-lte/dist/js/adminlte.min.js"></script>
	<!-- AdminLTE for demo purposes -->
	<script src="node_modules/admin-lte/dist/js/demo.js"></script>

	<!-- AngularJS -->
	<script src="node_modules/angular/angular.min.js"></script>
	<script src="js/angularjs.js"></script>

	<script>
	$(function(){
		var _name="CAR"+Date.now().toString().substr(Date.now().toString().length-2,2);
		document.querySelector("#carName").value=_name;
	})
	</script>
</body>

</html>