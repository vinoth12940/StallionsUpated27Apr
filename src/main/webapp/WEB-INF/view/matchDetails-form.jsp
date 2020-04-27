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
			<!-- form start -->
			<form:form action="saveMatchDetails" modelAttribute="matchAndMatchScoreDetails"
				method="POST" class="form-horizontal">
				<!-- need to associate this data with customer id -->
				<form:hidden path="matchSK" />
				<div class="row">
					<div class="col-lg-12">
						<div class="col-xs-8">
							<div class="box box-info">
								<div class="box-header with-border">
									<h3 class="box-title">Result Summary</h3>
								</div>
								<!-- /.box-header -->
								<div class="box-body">
									<%-- <div class="form-group">
										<label for="matchSK" class="col-sm-3 control-label">Match NO</label>
										<div class="col-md-9">
											<form:input type="text" path="matchSK"
												id="matchSK" class="form-control"
												placeholder="matchSK" />
											<div class="has-error">
												<form:errors path="matchSK" class="help-inline" />
											</div>
										</div>
									</div> --%>
									<div class="form-group">
										<label for="opponent_Team_Name" class="col-sm-3 control-label">Stallions
											Vs </label>
										<div class="col-md-9">
											<form:input type="text" path="opponent_Team_Name"
												id="opponent_Team_Name" class="form-control"
												placeholder="opponent_Team_Name" />
											<div class="has-error">
												<form:errors path="opponent_Team_Name" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="match_Date" class="col-sm-3 control-label">Date
										</label>
										<div class="col-md-9">
											<form:input type="date" path="match_Date" id="match_Date"
												class="form-control" placeholder="Start Date" />
											<div class="has-error">
												<form:errors path="match_Date" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="is_Tournament_Match"
											class="col-sm-3 control-label">Match Type</label>
										<div class="col-md-9">
											<form:select path="is_Tournament_Match"
												id="is_Tournament_Match" class="form-control"
												placeholder="Select match type">
												<form:option value="">Select Match Type</form:option>
												<form:option value="Y">Tournament</form:option>
												<form:option value="N">Practice</form:option>
											</form:select>
											<div class="has-error">
												<form:errors path="is_Tournament_Match" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="Match_Time"
											class="col-sm-3 control-label">Tournament Name</label>
										<div class="col-md-9">
											<form:select path="Match_Time"
												id="Match_Time" class="form-control"
												placeholder="Select match type">
												<form:option value="">Select Tournament name</form:option>
												<form:options items="${tournamentNameList}" />
											</form:select>
											<div class="has-error">
												<form:errors path="Match_Time" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="ground_Name" class="col-sm-3 control-label">Ground</label>
										<div class="col-md-9">
											<form:input type="text" path="ground_Name" id="ground_Name"
												class="form-control" placeholder="ground_Name" />
											<div class="has-error">
												<form:errors path="ground_Name" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="match_Type" class="col-sm-3 control-label">Match
											Type</label>
										<div class="col-md-9">
											<form:select path="match_Type" id="match_Type"
												class="form-control" placeholder="Select match type">
												<form:option value="">Select Match Type</form:option>
												<form:option value="League">League</form:option>
												<form:option value="Pre-Quarter">Pre-Quarter</form:option>
												<form:option value="Semi-finals">Semi-finals</form:option>
												<form:option value="Finals">Finals</form:option>
												<form:option value="None">None</form:option>
											</form:select>
											<div class="has-error">
												<form:errors path="match_Type" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="match_Overs" class="col-sm-3 control-label">Match
											Overs</label>
										<div class="col-md-9">
											<form:select path="match_Overs" id="match_Overs"
												class="form-control" placeholder="Select match type">
												<form:option value="">Select Match Overs</form:option>
												<form:option value="18">18/18</form:option>
												<form:option value="20">20/20</form:option>
												<form:option value="21">21 Overs</form:option>
												<form:option value="22">22 Overs</form:option>
												<form:option value="23">23 Overs</form:option>
												<form:option value="24">24 Overs</form:option>
												<form:option value="25">25 Overs</form:option>
												<form:option value="30">30 Overs</form:option>
												<form:option value="50">50 over match</form:option>
											</form:select>
											<div class="has-error">
												<form:errors path="match_Overs" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="stallions_Match_Result"
											class="col-sm-3 control-label">Result</label>
										<div class="col-md-9">
											<form:select path="stallions_Match_Result"
												id="stallions_Match_Result" class="form-control"
												placeholder="Select match type">
												<form:option value="">Select Result Type</form:option>
												<form:option value="Won">Won</form:option>
												<form:option value="Lost">Lost</form:option>
												<form:option value="Tie">Tie</form:option>
												<form:option value="No Result">No Result</form:option>
											</form:select>
											<div class="has-error">
												<form:errors path="stallions_Match_Result"
													class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="match_Result" class="col-sm-3 control-label">Stallions Match Result</label>
										<div class="col-md-9">
											<form:input type="text" path="match_Result" id="match_Result"
												class="form-control" placeholder="stallions result" />
											<div class="has-error">
												<form:errors path="match_Result" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="iS_Toss_Stallions" class="col-sm-3 control-label">Toss
											won By</label>
										<div class="col-md-9">
											<form:select path="iS_Toss_Stallions" id="iS_Toss_Stallions"
												class="form-control" placeholder="Select a toss">
												<form:option value="">Select toss</form:option>
												<form:option value="Y">Stallions</form:option>
												<form:option value="N">Opponent</form:option>
											</form:select>
											<div class="has-error">
												<form:errors path="iS_Toss_Stallions" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="toss_Summary" class="col-sm-3 control-label">Toss
											Summary</label>
										<div class="col-md-9">
											<form:input type="text" path="toss_Summary" id="toss_Summary"
												class="form-control" placeholder="toss_Summary" />
											<div class="has-error">
												<form:errors path="toss_Summary" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="Is_MOM_Stallions" class="col-sm-3 control-label">Man
											of the Match</label>
										<div class="col-md-9">
											<form:radiobutton path="Is_MOM_Stallions" id="chkYes"
												value="Y" onclick="ShowHideDiv()" />
											Stallions
											<form:radiobutton path="Is_MOM_Stallions" id="chkNo"
												value="N" onclick="ShowHideDiv()" />
											Opponent
											<div class="has-error">
												<form:errors path="Is_MOM_Stallions" class="help-inline" />
											</div>
										</div>
									</div>

									<div class="form-group" style="display: none"
										id="stallioinsplayer">
										<label for="mOM_player_name" class="col-sm-3 control-label"></label>
										<div class="col-md-9">
											<form:select path="mOM_player_name" id="mOM_player_name"
												class="form-control" placeholder="Select match type">
												<form:option value="">Select Stallions MOM name</form:option>
												<form:options items="${activePlayerNameList}" />
											</form:select>
											<div class="has-error">
												<form:errors path="mOM_player_name" class="help-inline" />
											</div>
										</div>
									</div>
									<div class="form-group" style="display: none"
										id="oppnontplayer">
										<label for="mOM_player_name" class="col-sm-3 control-label"></label>
										<div class="col-md-9">
											<form:input type="text" path="mOM_player_name" id="mOM_player_name"
												class="form-control" placeholder="mOM_player_name" />
											<div class="has-error">
												<form:errors path="mOM_player_name" class="help-inline" />
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
							<div class="box-header with-border"
								style="align-content: center; font-weight: bold;">
								Stallions</div>
							<!-- /.box-header -->
							<div class="box-body">
								<div class="row">
									<div class="col-lg-12">
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="battingFirst" class="col-sm-3 control-label">Batting
													First</label>
											</div>
											<div class="col-sm-6">
												<form:select path="battingFirst"
												id="battingFirst" class="form-control"
												placeholder="battingFirst">
												<form:option value="">Select</form:option>
												<form:option value="Y">Y</form:option>
												<form:option value="N">N</form:option>
												</form:select>
												<div class="has-error">
													<form:errors path="battingFirst" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="totalRuns" class="col-sm-3 control-label">Runs</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="totalRuns"
													id="totalRuns" class="form-control"
													placeholder="totalRuns" />
												<div class="has-error">
													<form:errors path="totalRuns" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="wickets" class="col-sm-3 control-label">Wickets</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="wickets"
													id="wickets" class="form-control"
													placeholder="wickets" />
												<div class="has-error">
													<form:errors path="wickets" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="overs" class="col-sm-3 control-label">Overs</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="overs"
													id="overs" class="form-control"
													placeholder="overs" />
												<div class="has-error">
													<form:errors path="overs" class="help-inline" />
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-12">
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="penalty_Points" class="col-sm-3 control-label">Penalty Poinsts</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="penalty_Points"
													id="penalty_Points" class="form-control"
													placeholder="penalty_Points" />
												<div class="has-error">
													<form:errors path="penalty_Points" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="bonus_Points" class="col-sm-3 control-label">Bonus Poinsts</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="bonus_Points"
													id="bonus_Points" class="form-control"
													placeholder="bonus_Points" />
												<div class="has-error">
													<form:errors path="bonus_Points" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="isStallionsDetails" class="col-sm-3 control-label"></label>
											</div>
											<div class="col-sm-6">
												<form:input type="hidden" path="isStallionsDetails"
													id="isStallionsDetails" class="form-control"
													placeholder="isStallionsDetails" value="Y"/>
												<div class="has-error">
													<form:errors path="isStallionsDetails" class="help-inline" />
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<div class="box box-info">
							<div class="box-header with-border"
								style="align-content: center; font-weight: bold;">
								Opponents</div>
							<!-- /.box-header -->
							<div class="box-body">
								<div class="row">
									<div class="col-lg-12">
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="battingFirst1" class="col-sm-3 control-label">Batting
													First</label>
											</div>
											<div class="col-sm-6">
												<form:select path="battingFirst1"
												id="battingFirst1" class="form-control"
												placeholder="battingFirst">
												<form:option value="">Select</form:option>
												<form:option value="Y">Y</form:option>
												<form:option value="N">N</form:option>
												</form:select>
												<div class="has-error">
													<form:errors path="battingFirst1" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="totalRuns1" class="col-sm-3 control-label">Runs</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="totalRuns1"
													id="totalRuns1" class="form-control"
													placeholder="totalRuns1" />
												<div class="has-error">
													<form:errors path="totalRuns1" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="wickets1" class="col-sm-3 control-label">Wickets</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="wickets1"
													id="wickets1" class="form-control"
													placeholder="Wickets" />
												<div class="has-error">
													<form:errors path="wickets1" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="overs1" class="col-sm-3 control-label">Overs</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="overs1"
													id="overs1" class="form-control"
													placeholder="overs" />
												<div class="has-error">
													<form:errors path="overs1" class="help-inline" />
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-12">
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="penalty_Points1" class="col-sm-3 control-label">Penalty Poinsts</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="penalty_Points1"
													id="penalty_Points1" class="form-control"
													placeholder="Penalty points" />
												<div class="has-error">
													<form:errors path="mOM_player_name" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="bonus_Points1" class="col-sm-3 control-label">Bonus Poinsts</label>
											</div>
											<div class="col-sm-6">
												<form:input type="text" path="bonus_Points1"
													id="bonus_Points1" class="form-control"
													placeholder="Bonus Points" />
												<div class="has-error">
													<form:errors path="bonus_Points1" class="help-inline" />
												</div>
											</div>
										</div>
										<div class="col-lg-3">
											<div class="col-sm-6">
												<label for="isStallionsDetails1" class="col-sm-3 control-label"></label>
											</div>
											<div class="col-sm-6">
												<form:input type="hidden" path="isStallionsDetails1"
													id="isStallionsDetails1" class="form-control"
													placeholder="isStallionsDetails1" value="N"/>
												<div class="has-error">
													<form:errors path="isStallionsDetails1" class="help-inline" />
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="col-lg-12">
									<div class="col-lg-6">
										<!-- <button type="submit" class="btn btn-default ">Cancel</button> -->
									</div>
									<div class="col-lg-6">
										<input type="submit" value="Save/Update"
											class="btn btn-primary pull-right" />
										<a href="${pageContext.request.contextPath}/matchPlayingXI/stallionsPlayingXI">Next</a>	
									</div>
								</div>
								<p>
									<a href="${pageContext.request.contextPath}/matchDetails/list">Back
										to List</a>
								</p>
							</div>
						</div>
					</div>
				</div>
			</form:form>
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
