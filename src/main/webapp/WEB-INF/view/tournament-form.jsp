<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE = edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <title>StallionsCC | Home</title>

    <!-- Bootstrap -->
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet"></link>
    <link href="${pageContext.request.contextPath}/resources/css/site.css" rel="stylesheet"></link>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
	
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    
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
        <a href="welcome" class="logo"> 
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class=""><img src="${pageContext.request.contextPath}/resources/img/stallion-icon.png" style="width:45px;height:45px;" alt="Stallions" class="img-circle" /> </span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Stallions </b>Cricket Club</span>
        </a>

        <nav class="navbar">
            <div class="user-login">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Welcome <security:authentication property="principal.username" /><b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <!-- User image -->
                    <li class="user-header">
                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" style="width:100px;height:100px;" alt="User" class="img-circle" />
                        <p>
                            <security:authentication property="principal.username" /> - All rounder
                            <small>Member since Feb. 2016</small>
                        </p>
                    </li>
                    <li class="user-body">

                    </li>
                    <!-- Menu Footer-->
                    <li class="user-footer">
                        <div class="pull-left">
							<!-- yet to map the profile details of the user-->
                            <a href="player.html" class="btn btn-default btn-flat">Profile</a>
                        </div>
                        <div class="pull-right">
							<form:form action="${pageContext.request.contextPath}/logout" 
									   method="POST">
										<input type="submit" value="Logout" class="btn btn-default btn-flat" />
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
			<!-- form start -->
			<form:form action="saveTournament" modelAttribute="tournament" method="POST" class="form-horizontal">
				<!-- need to associate this data with customer id -->
				<form:hidden path="id" />
				<div class="row">
					<div class="col-lg-12">
						<%-- <div class="col-xs-4">
							<div class="box box-primary">
								<div class="box-header with-border">
									<span class="box-title">Avatar</span>
								</div>
								<div class="box-body">
									<div style="text-align: center;">
										<img src="${pageContext.request.contextPath}/resources/img/no_user.png"
											style="width: 200px; height: 200px;" alt="User"
											class="img-circle" />
									</div>
								</div>
								<div class="box-footer">
									<div class="form-group">
										<label for="inputFile" class="col-sm-3 control-label">Upload:
										</label>
										<div class="col-sm-7">
											<input type="file" id="inputFile">
										</div>
									</div>
								</div>
							</div>
						</div> --%>
						<div class="col-xs-8">
							<div class="box box-info">
								<div class="box-header with-border">
									<h3 class="box-title">Tournament Details</h3>
								</div>
								<!-- /.box-header -->
								<div class="box-body">
									<div class="form-group">
										<label for="tournamentName" class="col-sm-3 control-label">Tournament
											Name</label>
										<div class="col-md-9">
											<form:input type="text" path="tournamentName" id="tournamentName"
												class="form-control" placeholder="Tournament Name" />
											<div class="has-error">
												<form:errors path="tournamentName" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="startDate" class="col-sm-3 control-label">Start
											Date</label>
										<div class="col-md-9">
											<form:input type="date" path="startDate" id="startDate"
												class="form-control" placeholder="Start Date" />
											<div class="has-error">
												<form:errors path="startDate" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="endDate" class="col-sm-3 control-label">End
												Date</label>
										<div class="col-md-9">
											<form:input type="date" path="endDate" id="endDate"
												class="form-control" placeholder="End Date" />
											<div class="has-error">
												<form:errors path="endDate" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
											<label for="matchType" class="col-sm-3 control-label">Match
												Type</label>
											<div class="col-md-9">
												<form:select path="matchType" id="matchType"
													class="form-control" placeholder="Select match type">
													<form:option value="">Select Match Type</form:option>
													<form:option value="20/20">20/20</form:option>
													<form:option value="25/25">25/25</form:option>
													<form:option value="30/30">30/30</form:option>
													<form:option value="Practice match">Practice match</form:option>
													<form:option value="50 over match">50 over match</form:option>
												</form:select>
												<div class="has-error">
													<form:errors path="matchType" class="help-inline" />
												</div>
											</div>
										</div>
									<div class="form-group">
										<label for="noOfMatches" class="col-sm-3 control-label">No Of Matches
											</label>
										<div class="col-md-9">
											<form:input type="text" path="noOfMatches" id="noOfMatches"
												class="form-control" placeholder="No Of Matches" />
											<div class="has-error">
												<form:errors path="noOfMatches" class="help-inline" />
											</div>
										</div>
									</div>
								</div>
								<!-- /.box-body -->
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<div class="box box-info">
							<div class="box-header with-border">
							</div>
							<!-- /.box-header -->
							<div class="box-body">
								<div class="col-lg-12">
										<div class="col-lg-6">
											<!-- <button type="submit" class="btn btn-default ">Cancel</button> -->
										</div>
										<div class="col-lg-6">						
											<input type="submit" value="Save/Update" class="btn btn-primary pull-right" />
										</div>
								</div>
								<p>
									<a href="${pageContext.request.contextPath}/tournament/list">Back to List</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</form:form>
		</section>
	</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js" ></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>

    <script src="https://code.highcharts.com/highcharts.js"></script>

    <script language="JavaScript">
        $(document).ready(function () {
            var title = {
                text: 'Average Performance of Batting, Bowling, Fielding'
            };
            var subtitle = {
                text: 'Points: measured by 100.'
            };
            var xAxis = {
                categories: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun',
                   'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
            };
            var yAxis = {
                title: {
                    text: 'Average'
                },
                plotLines: [{
                    value: 0,
                    width: 1,
                    color: '#808080'
                }]
            };

            var tooltip = {
                valueSuffix: '*'
            }

            var legend = {
                layout: 'vertical',
                align: 'right',
                verticalAlign: 'middle',
                borderWidth: 0
            };

            var series = [
               {
                   name: 'Batting',
                   data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2,
                      26.5, 23.3, 18.3, 13.9, 9.6]
               },
               {
                   name: 'Bowling',
                   data: [-0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8,
                      24.1, 20.1, 14.1, 8.6, 2.5]
               },
               {
                   name: 'Fielding',
                   data: [3.9, 4.2, 5.7, 8.5, 11.9, 15.2, 17.0,
                      16.6, 14.2, 10.3, 6.6, 4.8]
               }
            ];

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
    </script>

</body>
</html>
