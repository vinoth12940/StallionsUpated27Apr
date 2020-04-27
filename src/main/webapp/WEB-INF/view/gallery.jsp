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
            <h1>Gallery<small>some of our valueable moments</small></h1>
            <ol class="breadcrumb">
                <li>Home</li>
                <li>Gallery</li>
            </ol>
        </section>
        <section class="content">
            <div class="row">
                <div class="col-md-12">
                    <!-- USERS LIST -->
                    <div class="box">
                        <div class="box-header with-border">
                            <h3 class="box-title">Awards</h3>
                            <div class="box-tools pull-right">

                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body no-padding">
                            <ul class="users-list clearfix">
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Pavan</a>
                                    <span class="users-list-date">Man of match</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Karthik</a>
                                    <span class="users-list-date">Best Bowler</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Vinoth</a>
                                    <span class="users-list-date">Leading wicket taker</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Sarathy</a>
                                    <span class="users-list-date">Man of match</span>
                                </li>                                
                            </ul>
                            <!-- /.users-list -->
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer text-center">
                            <a href="javascript:void(0)" class="uppercase">View All</a>
                        </div>
                        <!-- /.box-footer -->
                    </div>
                    <!--/.box -->
                </div>
                <!-- /.col -->
            </div>
            <div class="row">
                <div class="col-md-12">
                    <!-- USERS LIST -->
                    <div class="box">
                        <div class="box-header with-border">
                            <h3 class="box-title">Team Players</h3>
                            <div class="box-tools pull-right">
                                
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body no-padding">
                            <ul class="users-list clearfix">
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Alexander Pierce</a>
                                    <span class="users-list-date">Today</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Norman</a>
                                    <span class="users-list-date">Yesterday</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Jane</a>
                                    <span class="users-list-date">12 Jan</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">John</a>
                                    <span class="users-list-date">12 Jan</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Alexander</a>
                                    <span class="users-list-date">13 Jan</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Sarah</a>
                                    <span class="users-list-date">14 Jan</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Nora</a>
                                    <span class="users-list-date">15 Jan</span>
                                </li>
                                <li>
                                    <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">
                                    <a class="users-list-name" href="#">Nadia</a>
                                    <span class="users-list-date">15 Jan</span>
                                </li>
                            </ul>
                            <!-- /.users-list -->
                        </div>
                        <!-- /.box-body -->
                        <div class="box-footer text-center">
                            <a href="javascript:void(0)" class="uppercase">View All</a>
                        </div>
                        <!-- /.box-footer -->
                    </div>
                    <!--/.box -->
                </div>
                <!-- /.col -->
            </div>            
            <div class="row">
                <div class="col">
                    <div class="col-md-4">
                        <!-- USERS LIST -->
                        <div class="box">
                            <div class="box-header with-border">
                                <h3 class="box-title">Team Outting 2017</h3>
                                <div class="box-tools pull-right">
                                   
                                </div>
                            </div>
                            <!-- /.box-header -->
                            <div class="box-body no-padding">
                                <ul class="users-tile clearfix">
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                        
                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                       
                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                        
                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                        
                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                        
                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                        
                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                        
                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">                                        
                                    </li>
                                </ul>
                                <!-- /.users-list -->
                            </div>
                            <!-- /.box-body -->
                            <div class="box-footer text-center">
                                <a href="javascript:void(0)" class="uppercase">View All</a>
                            </div>
                            <!-- /.box-footer -->
                        </div>
                        <!--/.box -->
                    </div>
                    <div class="col-md-4">
                        <!-- USERS LIST -->
                        <div class="box">
                            <div class="box-header with-border">
                                <h3 class="box-title">One Day Out 2017</h3>
                                <div class="box-tools pull-right">
                                    
                                </div>
                            </div>
                            <!-- /.box-header -->
                            <div class="box-body no-padding">
                                <ul class="users-tile clearfix">
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                </ul>
                                <!-- /.users-list -->
                            </div>
                            <!-- /.box-body -->
                            <div class="box-footer text-center">
                                <a href="javascript:void(0)" class="uppercase">View All</a>
                            </div>
                            <!-- /.box-footer -->
                        </div>
                        <!--/.box -->
                    </div>
                    <div class="col-md-4">
                        <!-- USERS LIST -->
                        <div class="box">
                            <div class="box-header with-border">
                                <h3 class="box-title">Team Outting 2015</h3>
                                <div class="box-tools pull-right">
                                   
                                </div>
                            </div>
                            <!-- /.box-header -->
                            <div class="box-body no-padding">
                                <ul class="users-tile clearfix">
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                    <li>
                                        <img src="${pageContext.request.contextPath}/resources/img/no_user.png" width="115" height="115" alt="User Image">

                                    </li>
                                </ul>
                                <!-- /.users-list -->
                            </div>
                            <!-- /.box-body -->
                            <div class="box-footer text-center">
                                <a href="javascript:void(0)" class="uppercase">View All</a>
                            </div>
                            <!-- /.box-footer -->
                        </div>
                        <!--/.box -->
                    </div>
                </div>
                <!-- /.col -->
            </div>
        </section>
    </div>
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js" ></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>

    <script src="https://code.highcharts.com/highcharts.js"></script>

</body>
</html>