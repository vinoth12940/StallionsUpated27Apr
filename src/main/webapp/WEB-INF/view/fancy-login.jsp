<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/custom.css">
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container main-section">
	<div class="row">
		<div class="col-md-12 text-center user-login-header">
			<h1>Login</h1>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4 col-sm-8 col-xs-12 col-md-offset-4 col-sm-offset-2 login-image-main text-center">
			<form action="${pageContext.request.contextPath}/authenticateTheUser" 
						  method="POST" class="form-horizontal">
			<div class="row">
				<div class="col-md-12 col-sm-12 col-xs-12 user-image-section">
					<img src="${pageContext.request.contextPath}/resources/img/businessman.png">
				</div>
				<div class="col-md-12 col-sm-12 col-xs-12 user-login-box">
					<div class="form-group">
					        <div class="col-xs-15">
					            <div>
									<!-- Check for login error -->
									
									<c:if test="${param.error != null}">
										<div class="alert alert-danger col-xs-offset-1 col-xs-10">
											Invalid username and password.
										</div>
									</c:if>
									<!-- Check for logout -->
									
									<c:if test="${param.logout != null}">            
										<div class="alert alert-success col-xs-offset-1 col-xs-10">
											You have been logged out.
										</div>
									</c:if>
					            </div>
					        </div>
					    </div>
					<div class="form-group">
						<!-- UserName -->
				  		<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> 
							<input type="text" name="username" placeholder="username" class="form-control">
						</div>
					</div>
					<div class="form-group">
				  		<!-- Password -->
						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> 
							<input type="password" name="password" placeholder="password" class="form-control" >
						</div>
					</div>
					<button type="submit" class="btn btn-primary btn-lg btn-block">Login</button>
					<!-- <a href="#" class="btn btn-defualt">Login</a>-->
					<input type="hidden"
							   name="${_csrf.parameterName}"
							   value="${_csrf.token}" />
				</div>
				<!-- <div class="col-md-12 col-sm-12 col-xs-12 last-part">
					<p>Want to Join as a member?<a href="#"> Contact Us</a></p>
				</div> -->
				
			</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>