<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
</head>

<body>
    <header class="main-header">
        <!-- Logo -->
        <a href="home" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class=""><img src="${pageContext.request.contextPath}/resources/img/stallion-icon.png" style="width:45px;height:45px;" alt="Stallions" class="img-circle" /> </span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Stallions </b>Cricket Club</span>
        </a>

        <nav class="navbar">
            <div class="pull-right">
                <a class="btn btn-default" href="${pageContext.request.contextPath}/welcome/contactUs/"><b>Want to become a member with us?</b></a>
            </div>
        </nav>

    </header>

    <!-- Left side column. contains the logo and sidebar -->
    <div class="main-sidebar">
        <section class="sidebar">
            <ul class="sidebar-menu">
                <li class="header">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <i class="fa fa-align-justify"></i><span>NAVIGATION MENU</span>
                    </a>
                </li>
                <li class="active"><a href="${pageContext.request.contextPath}/"><i class="fa fa-home"></i> <span>Home</span></a></li>
                <li><a href="${pageContext.request.contextPath}/showMyLoginPage"><i class="fa fa-sign-in"></i> <span>Sing in</span></a></li>
                <li><a href="${pageContext.request.contextPath}/welcome/gallery"><i class="fa fa-image"></i> <span>Gallery</span></a></li>
                <li><a href="${pageContext.request.contextPath}/welcome/aboutUs"><i class="fa fa-book"></i> <span>About Us</span></a></li>
                <li><a href="${pageContext.request.contextPath}/welcome/contactUs"><i class="fa fa-mobile"></i> <span>Contact Us</span></a></li>
            </ul>
        </section>
    </div>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <section class="content-header">
            <h1>Home <small>match / player dashboard</small></h1>
            <ol class="breadcrumb"></ol>
        </section>
        <section class="content">
            <div class="row">
                <div class="col-md-12">
                    <div style="background-color:white; border-radius:2px; min-height:250px;">
                    	<div class="mySlides"><img src="${pageContext.request.contextPath}/resources/img/banner-8.jpg" height="250" /></div>
                    	<div class="mySlides"><img src="${pageContext.request.contextPath}/resources/img/banner-9.jpg" height="250" /></div>
                    	<div class="mySlides"><img src="${pageContext.request.contextPath}/resources/img/banner-10.jpg" height="250" /></div>
                    	<div class="mySlides"><img src="${pageContext.request.contextPath}/resources/img/banner-11.jpg" height="250" /></div>
                    	<div class="mySlides"><img src="${pageContext.request.contextPath}/resources/img/banner-12.jpg" height="250" /></div>
                    	<div class="mySlides"><img src="${pageContext.request.contextPath}/resources/img/banner-13.jpg" height="250" /></div>
                        <div class="mySlides"><img src="${pageContext.request.contextPath}/resources/img/banner-5.jpg" height="250" /></div>
                            
                            <!--<img class="mySlides" src="styles/images/banner/banner-2.jpg" height="250" />
                            <img class="mySlides" src="styles/images/banner/banner-3.jpg" height="250" />
                            <img class="mySlides" src="styles/images/banner/banner-4.jpg" height="250" />
                            <img class="mySlides" src="styles/images/banner/banner-5.jpg" height="250" />
                            <img class="mySlides" src="styles/images/banner/banner-6.jpg" height="250" />
                            <img class="mySlides" src="styles/images/banner/banner-7.jpg" height="250" />-->
                        </div>
                </div>
            </div>
        </section>
        <section class="content">
            <div class="row">        
	            <div class="col-md-4">
	                <div class="panel panel-default">
	                    <div class="panel-heading"><h3>Hello.</h3></div>
	                        <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet         vulputate.Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
	                          dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
	                          Aliquam in felis sit amet augue.
	                    	</div>
	                </div>
	             </div>
			     <div class="col-md-4">
			         <div class="panel panel-default">
			             <div class="panel-heading"><h3>Hello.</h3></div>
			                 <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate.Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
			                    dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
			                    Aliquam in felis sit amet augue.
			                  </div>
			        </div>
			     </div>
			     <div class="col-md-4">
		            <div class="panel panel-default">
		                <div class="panel-heading"><h3>Hello.</h3></div>
		                    <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis pharetra varius quam sit amet vulputate.Quisque mauris augue, molestie tincidunt condimentum vitae, gravida a libero. Aenean sit amet felis 
		                    dolor, in sagittis nisi. Sed ac orci quis tortor imperdiet venenatis. Duis elementum auctor accumsan. 
		                    Aliquam in felis sit amet augue.
		                    </div>
		              </div>
		           </div>
		      </div>   
        </section>
        <section class="content">
            <div class="row">        
	        	<div class="col-md-12">
                    <div class="col-md-3">
                        <div class="info-box" style="padding:20px; text-align:center">
                            <img src="${pageContext.request.contextPath}/resources/img/stallions-logo.jpg" alt="StallionCC" />
                        </div>
                    </div>
                    <div class="col-md-9">
                        <div class="info-box" style="padding: 5px 10px;">
                            <p style="text-indent: 5em;text-align: justify;">
                                This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation. This holder will contain about the Stallions club infromation.This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation.
                                This holder will contain about the Stallions club infromation. This holder will contain about the Stallions club infromation.This holder will contain about the Stallions club infromation
                            </p>
                            <p style="text-indent: 5em;text-align: justify;">
                                This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation. This holder will contain about the Stallions club infromation.This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation.
                                This holder will contain about the Stallions club infromation. This holder will contain about the Stallions club infromation.This holder will contain about the Stallions club infromation
                                This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation. This holder will contain about the Stallions club infromation.This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation.
                                This holder will contain about the Stallions club infromation.
                                This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation. This holder will contain about the Stallions club infromation.This holder will contain about the Stallions club infromation This holder will contain about the Stallions club infromation.
                                This holder will contain about the Stallions club infromation.
                            </p>
                        </div>
                    </div>
                </div>    
		    </div>   
        </section>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js" ></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js" ></script>

    <script src="https://code.highcharts.com/highcharts.js"></script>

    <script>
        var slideIndex = 0;
        slidingBanner();

        function slidingBanner() {
            var i;
            var x = document.getElementsByClassName("mySlides");
            for (i = 0; i < x.length; i++) {
                x[i].style.display = "none";
            }
            slideIndex++;
            if (slideIndex > x.length) { slideIndex = 1 }
            x[slideIndex - 1].style.display = "block";
            setTimeout(slidingBanner, 2000);
        }
    </script>

</body>
</html>