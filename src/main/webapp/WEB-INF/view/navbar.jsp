<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<div class="main-sidebar side-nav">
        <section class="sidebar">
            <ul class="sidebar-menu">
                <li class="header">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <i class="fa fa-align-justify"></i><span>NAVIGATION MENU</span>
                    </a>
                </li>
                <li class="active"><a href="${pageContext.request.contextPath}/welcome/" ><i class="fa fa-home"></i> <span>Home</span></a></li>
                <security:authorize access="hasAnyRole('USER')">
					<li><a href="${pageContext.request.contextPath}/scoreCard/"><i class="fa fa-calendar"></i> <span>Score Card</span></a></li>
					<li><a href="${pageContext.request.contextPath}/player/list"><i class="fa fa-angle-double-right"></i> List of Players</a></li>
				</security:authorize>
				<security:authorize access="hasAnyRole('ADMIN')">
					<li><a href="${pageContext.request.contextPath}/register/showRegistrationForm" ><i class="fa fa-pencil fa-fw"></i> <span>Register New User</span></a></li>
					<li>
						<a href="#" data-toggle="collapse" data-target="#submenu-1"><i class="fa fa-fw fa-search"></i> <span>Player</span><i class="fa fa-fw fa-angle-down pull-right"></i></a>
						<ul id="submenu-1" class="submenu collapse">
							<li><a href="${pageContext.request.contextPath}/player/list"><i class="fa fa-angle-double-right"></i> List of Players</a></li>
						</ul>
					</li>
					<li>
						<a href="#" data-toggle="collapse" data-target="#submenu-2"><i class="fa fa-fw fa-search"></i> <span>Tournament Details</span><i class="fa fa-fw fa-angle-down pull-right"></i></a>
						<ul id="submenu-2" class="submenu collapse">
							<li><a href="${pageContext.request.contextPath}/tournament/list"><i class="fa fa-angle-double-right"></i> List of Tournament</a></li>
						</ul>
					</li>                                              
					<li>
						<a href="#" data-toggle="collapse" data-target="#submenu-3"><i class="fa fa-fw fa-search"></i> <span>Match Details</span><i class="fa fa-fw fa-angle-down pull-right"></i></a>
						<ul id="submenu-3" class="submenu collapse">
							<li><a href="${pageContext.request.contextPath}/addMatch"><i class="fa fa-angle-double-right"></i> Add Match</a></li>
							<li><a href="${pageContext.request.contextPath}/addStallionsPlayers"><i class="fa fa-angle-double-right"></i> Add Stallions XI</a></li>
							<li><a href="${pageContext.request.contextPath}/addOpponentPlayers"><i class="fa fa-angle-double-right"></i> Add Opponent XI</a></li>
						</ul>
					</li>
				</security:authorize>
						
                <li><a href="${pageContext.request.contextPath}/welcome/gallery"><i class="fa fa-image"></i> <span>Gallery</span></a></li>
                <li><a href="${pageContext.request.contextPath}/welcome/aboutUs"><i class="fa fa-book"></i> <span>About Us</span></a></li>
                <li><a href="${pageContext.request.contextPath}/welcome/contactUs"><i class="fa fa-mobile"></i> <span>Contact Us</span></a></li>
            </ul>
        </section>
</div>
