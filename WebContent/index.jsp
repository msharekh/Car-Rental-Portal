<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Car Rental</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet" type="text/css"
	href="node_modules/bootstrap/dist/css/bootstrap.min.css">

<!-- Font Awesome -->
<link rel="stylesheet" type="text/css"
	href="node_modules/font-awesome/css/font-awesome.min.css">
<!-- Ionicons -->
<link rel="stylesheet" type="text/css"
	href="node_modules/ionicons/dist/css/ionicons.min.css">
<!-- Theme style -->
<link rel="stylesheet" type="text/css"
	href="node_modules/admin-lte/dist/css/AdminLTE.min.css">
<!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
<link rel="stylesheet" type="text/css"
	href="node_modules/admin-lte/dist/css/skins/_all-skins.min.css">



<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<!-- Google Font -->
<link rel="stylesheet" type="text/css"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
<style>
body {
	background-image: url("img/bg.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}
</style>
</head>

<body>




	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Car Rental Portal</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="addCar.jsp">add Car</a></li>
				<li><a href="addCustomer.jsp">add Customer</a></li>
				<li><a href="rentCar.jsp">rent Car</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<h3>Car Rental Application</h3>
		<p>This application allow customers to rent cars</p>
	</div>




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
</body>

</html>