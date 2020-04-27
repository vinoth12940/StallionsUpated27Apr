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
		<security:authorize access="hasAnyRole('ADMIN', 'USER')">
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
        </security:authorize>
    </header>
    
    <!-- nav bar -->
	<jsp:include page="navbar.jsp" />

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <section class="content-header">
            <h1>Contact Us <small>Person you can enquiry</small></h1>
            <ol class="breadcrumb">
                <li>Home</li>
                <li>Contact Us</li>
            </ol>
        </section>
        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="callout callout-info">
                        <h4>For general enquiries!</h4>

                        <p>
                            Please contact: +91 9840733122 Or via e-mail mailtostallionscc@gmail.com
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="info-box">
                        <span class="info-box-icon bg-aqua">
                            <img src="${pageContext.request.contextPath}/resources/img/no_user.png" style="width: 75px; height: 75px;" alt="User" class="" />
                        </span>

                        <div class="info-box-content">
                            <div class="info-box-caption">SRINIVAS S </div>
                            <div class="info-box-text">Coach & Captian</div>
                            <div style="margin-top:10px;float:left;">
                                <span style="float:left" class="info-box-number">
                                    <i class="fa fa-phone"></i> +91 9840733122
                                </span>
                                <span style="margin-left:250px; float: left" class="info-box-number"><i class="fa fa-envelope"></i> mailtostallionscc@gmail.com</span>
                            </div>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="info-box">
                        <span class="info-box-icon bg-aqua">
                            <img src="${pageContext.request.contextPath}/resources/img/no_user.png" style="width: 75px; height: 75px;" alt="User" class="" />
                        </span>

                        <div class="info-box-content">
                            <div class="info-box-caption">SARATHY</div>
                            <div class="info-box-text">Vice Captian</div>
                            <div style="margin-top:10px;float:left;">
                                <span style="float:left" class="info-box-number">
                                    <i class="fa fa-phone"></i> +91 9840733122
                                </span>
                                <span style="margin-left:250px; float: left" class="info-box-number"><i class="fa fa-envelope"></i> mailtostallionscc@gmail.com</span>
                            </div>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                </div>
            </div>
            <div class="row">
                <div class="col-xs-12">
                    <div class="info-box">
                        <span class="info-box-icon bg-aqua">
                            <img src="${pageContext.request.contextPath}/resources/img/no_user.png" style="width: 75px; height: 75px;" alt="User" class="" />
                        </span>

                        <div class="info-box-content">
                            <div class="info-box-caption">SRINIVAS S </div>
                            <div class="info-box-text">Coach</div>
                            <div style="margin-top:10px;float:left;">
                                <span style="float:left" class="info-box-number">
                                    <i class="fa fa-phone"></i> +91 9840733122
                                </span>
                                <span style="margin-left:250px; float: left" class="info-box-number"><i class="fa fa-envelope"></i> mailtostallionscc@gmail.com</span>
                            </div>
                        </div>
                        <!-- /.info-box-content -->
                    </div>
                    <!-- /.info-box -->
                </div>
            </div>
			
			<div class="container marketing">
				<div class="container">
					<div class="row">
							<div class="col-sm-12 features section-description wow fadeIn" id="Contact">
								<h2>Contact Us</h2>
								<div class="divider-1 wow fadeInUp"><span></span></div>
							</div>
					</div>
						 
					<div class="row">
						<div class="col-md-8">
							<div class="well well-sm">
								<form:form action="${ pageContext.request.contextPath }/welcome/mailSuccess" method="POST" modelAttribute="mail" class="form-horizontal">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<label for="firstName">
												Name</label>
											<form:input type="text" path="firstName" id="firstName" class="form-control" placeholder="First Name"/>
										</div>
										<div class="form-group">
											<label for="mobileNo">
												Mobile #:</label>
											<form:input type="text" path="mobileNo" id="mobileNo" class="form-control" placeholder="Mobile #"/>
										</div>
										<div class="form-group">
											<label for="mailFrom">
												Email</label>
											<div class="input-group">
												<span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span>
												</span>
												<form:input type="text" path="mailFrom" id="mailFrom" class="form-control" placeholder="Your email id"/></div>
										</div>
										<div class="form-group">
											<label for="mailSubject">
												Subject</label>
											<form:select path="mailSubject" id="mailSubject" class="form-control" placeholder="Select subject">
												<form:option value="">Select Subject</form:option>
												<form:option value="Wanna be a member">Wanna be a member</form:option>
												<form:option value="suggestions">suggestions</form:option>
											</form:select>	
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<label for="mailContent">
												Message</label>
											<form:textarea path="mailContent" name="mailContent" id="mailContent" class="form-control" rows="15" cols="25" required="required"
												placeholder="Message"></form:textarea>
										</div>
									</div>
									<div class="col-md-12">
										<input type="submit" value="SendMessage" class="btn btn-primary btn-sm pull-right"/>
									</div>
								</div>
								</form:form>
							</div>
						</div>
						<div class="col-md-4">
							<form>
							<legend><span class="glyphicon glyphicon-globe"></span> Our office</legend>
								<address>
								  <strong>Stallions Cricket Club</strong><br>
								  Sachin street,<br>
								  Pallavaram, Chennai-600 047, India.<br>
								  <abbr title="Phone">P:</abbr> +91 9840733122
								</address>

								<address>
								  <strong>Email</strong><br>
								  <a href="mailto:#">mailtostallionscc@gmail.com</a>
								</address>                    
							</form>
						</div>
					</div>
				</div>
			</div><!-- /.container -->
        </section>
    </div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js" ></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>

    <script src="https://code.highcharts.com/highcharts.js"></script>
	
</body>
</html>