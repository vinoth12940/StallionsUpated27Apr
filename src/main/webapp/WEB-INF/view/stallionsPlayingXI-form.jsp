<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE = edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<title>StallionsCC | Home</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet"></link>
<link href="${pageContext.request.contextPath}/resources/css/site.css"
	rel="stylesheet"></link>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">

<!--<link href="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css" rel="stylesheet">-->
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src = "https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src = "https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
<!--<link rel="stylesheet" href="styles/css/site2.css">-->
</head>


<body>
	<header class="main-header">
		<!-- Logo -->
		<a href="welcome" class="logo"> <!-- mini logo for sidebar mini 50x50 pixels -->
			<span class=""><img
				src="${pageContext.request.contextPath}/resources/img/stallion-icon.png"
				style="width: 45px; height: 45px;" alt="Stallions"
				class="img-circle" /> </span> <!-- logo for regular state and mobile devices -->
			<span class="logo-lg"><b>Stallions </b>Cricket Club</span>
		</a>

		<nav class="navbar">
			<div class="user-login">
				<a href="#" class="dropdown-toggle" data-toggle="dropdown">Welcome
					<security:authentication property="principal.username" /><b
					class="caret"></b>
				</a>
				<ul class="dropdown-menu">
					<!-- User image -->
					<li class="user-header"><img
						src="${pageContext.request.contextPath}/resources/img/no_user.png"
						style="width: 100px; height: 100px;" alt="User" class="img-circle" />
						<p>
							<security:authentication property="principal.username" />
							- All rounder <small>Member since Feb. 2016</small>
						</p></li>
					<li class="user-body"></li>
					<!-- Menu Footer-->
					<li class="user-footer">
						<div class="pull-left">
							<!-- yet to map the profile details of the user-->
							<a href="player.html" class="btn btn-default btn-flat">Profile</a>
						</div>
						<div class="pull-right">
							<form:form action="${pageContext.request.contextPath}/logout"
								method="POST">
								<input type="submit" value="Logout"
									class="btn btn-default btn-flat" />
							</form:form>
							<!--  <a href="logout" class="btn btn-default btn-flat">Sign out</a> -->
						</div>
					</li>
				</ul>
			</div>
		</nav>
	</header>
	<!-- nav bar -->
	<jsp:include page="navbar.jsp" />

	<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<section class="content-header">
			<h1>
				Tournament<small>detailed information of the Tournament</small>
			</h1>
			<ol class="breadcrumb">
				<li>Home</li>
				<li>Tournament</li>
			</ol>
		</section>
		<section class="content">
			<div class="row">
				<div class="col-md-12">
					<div class="col-md-12">
						<div class="box">
							<div class="box-header with-border">
								<h3 class="box-title">Stallions Playing XI</h3>
								<div class="box-tools pull-right"></div>
							</div>
							<div class="box-body">
								<div class="row">
									<div class="col-md-12">
										<div class="table-responsive">
											<table id="tournamentTable" class="table table-striped">
												<thead>
													<tr>
														<th>Batting order</th>
														<th>Players</th>
														<th>Captain</th>
														<th>Wicket keeper</th>
													</tr>
												</thead>
												<tbody>
													<form:form action="saveStallionsPlayingXIDetails"
														modelAttribute="pojoForm" method="POST"
														class="form-horizontal">
														<c:forEach var="matchplayingxi" items="${pojoForm.pojos}"
															varStatus="status">
															<tr>
																<td><form:input type="text"
																		path="pojos[${status.index}].batting_Order"
																		id="batting_Order" class="form-control"
																		placeholder="batting_Order" /></td>
																<td><form:select
																		path="pojos[${status.index}].players_Name"
																		id="players_Name" class="form-control"
																		placeholder="players_Name">
																		<form:option value="">Select Player name</form:option>
																		<c:forEach items="${activePlayerNameList}"
																			var="databaseValue">
																			<form:option value="${databaseValue}"> ${databaseValue} </form:option>
																		</c:forEach>
																	</form:select></td>
																<td><form:checkbox
																		path="pojos[${status.index}].is_Captain"
																		id="is_Captain" value="Y" /></td>
																<td><form:checkbox
																		path="pojos[${status.index}].is_Wicket_Keeper"
																		id="is_Wicket_Keeper" value="Y" /></td>
																<td><form:input type="hidden"
																		path="pojos[${status.index}].isStallionsDetails"
																		id="isStallionsDetails" class="form-control"
																		placeholder="isStallionsDetails" value="Y"/></td>		
															</tr>
														</c:forEach>
														<div class="col-lg-12">
															<div class="col-lg-6">
																<!-- <button type="submit" class="btn btn-default ">Cancel</button> -->
															</div>
															<div class="col-lg-6">
																<input type="submit" value="Save/Update"
																	class="btn btn-primary pull-right" /> <a
																	href="${pageContext.request.contextPath}/matchPlayingXI/opponentPlayingXI">Next</a>
															</div>
														</div>
														<p>
															<a
																href="${pageContext.request.contextPath}/matchDetails/list">Back
																to List</a>
														</p>

													</form:form>
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
							<!-- /.box-body -->
						</div>

					</div>
				</div>
			</div>
		</section>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

	<script src="https://code.highcharts.com/highcharts.js"></script>

	<script language="JavaScript">
		$(document)
				.ready(
						function() {
							var title = {
								text : 'Average Performance of Batting, Bowling, Fielding'
							};
							var subtitle = {
								text : 'Points: measured by 100.'
							};
							var xAxis = {
								categories : [ 'Jan', 'Feb', 'Mar', 'Apr',
										'May', 'Jun', 'Jul', 'Aug', 'Sep',
										'Oct', 'Nov', 'Dec' ]
							};
							var yAxis = {
								title : {
									text : 'Average'
								},
								plotLines : [ {
									value : 0,
									width : 1,
									color : '#808080'
								} ]
							};

							var tooltip = {
								valueSuffix : '*'
							}

							var legend = {
								layout : 'vertical',
								align : 'right',
								verticalAlign : 'middle',
								borderWidth : 0
							};

							var series = [
									{
										name : 'Batting',
										data : [ 7.0, 6.9, 9.5, 14.5, 18.2,
												21.5, 25.2, 26.5, 23.3, 18.3,
												13.9, 9.6 ]
									},
									{
										name : 'Bowling',
										data : [ -0.2, 0.8, 5.7, 11.3, 17.0,
												22.0, 24.8, 24.1, 20.1, 14.1,
												8.6, 2.5 ]
									},
									{
										name : 'Fielding',
										data : [ 3.9, 4.2, 5.7, 8.5, 11.9,
												15.2, 17.0, 16.6, 14.2, 10.3,
												6.6, 4.8 ]
									} ];

							var json = {};

							json.title = title;
							json.subtitle = subtitle;
							json.xAxis = xAxis;
							json.yAxis = yAxis;
							json.tooltip = tooltip;
							json.legend = legend;
							json.series = series;

							$('#matchPerformance').highcharts(json);
							$('#matchPerformance1').highcharts(json);
						});

		function ShowHideDiv() {
			var chkYes = document.getElementById("chkYes");
			var chkNo = document.getElementById("chkNo");

			var stallioinsplayer = document.getElementById("stallioinsplayer");
			var oppnontplayer = document.getElementById("oppnontplayer");

			stallioinsplayer.style.display = chkYes.checked ? "block" : "none";
			oppnontplayer.style.display = chkNo.checked ? "block" : "none";
		}
	</script>

</body>
</html>