<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@page session="true"%>

<html lang="en">
<head>

<style>
/* Loading Spinner */
.spinner {
	margin: 0;
	width: 70px;
	height: 18px;
	margin: -35px 0 0 -9px;
	position: absolute;
	top: 50%;
	left: 50%;
	text-align: center
}

.spinner>div {
	width: 18px;
	height: 18px;
	background-color: #333;
	border-radius: 100%;
	display: inline-block;
	-webkit-animation: bouncedelay 1.4s infinite ease-in-out;
	animation: bouncedelay 1.4s infinite ease-in-out;
	-webkit-animation-fill-mode: both;
	animation-fill-mode: both
}

.spinner .bounce1 {
	-webkit-animation-delay: -.32s;
	animation-delay: -.32s
}

.spinner .bounce2 {
	-webkit-animation-delay: -.16s;
	animation-delay: -.16s
}

@
-webkit-keyframes bouncedelay { 0%,80%,100%{
	-webkit-transform: scale(0.0)
}

40%{
-webkit-transform








:scale








(1
.0








)
}
}
@
keyframes bouncedelay { 0%,80%,100%{
	transform: scale(0.0);
	-webkit-transform: scale(0.0)
}
40%{
transform








:scale








(1
.0








);
-webkit-transform








:scale








(1
.0








)
}
}
</style>


<meta charset="UTF-8">
<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
<title>HomeoProd-${title}</title>
<meta name="description" content="">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

<!-- Favicons -->
<link rel="icon"
	href="${pageContext.request.contextPath}/static/assets/images/favicon.ico"
	type="image/x-icon">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/bootstrap/css/bootstrap.css">


<!-- HELPERS -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/animate.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/backgrounds.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/boilerplate.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/border-radius.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/grid.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/page-transitions.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/spacing.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/typography.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/utils.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/colors.css">


<!-- ELEMENTS -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/badges.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/buttons.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/content-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/dashboard-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/forms.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/images.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/info-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/invoice.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/loading-indicators.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/menus.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/panel-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/response-messages.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/responsive-tables.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/ribbon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/social-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/tables.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/tile-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/elements/timeline.css">



<!-- ICONS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/icons/font-awesome/css/font-awesome.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/icons/linecons/linecons.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/icons/spinnericon/spinnericon.css">


<!-- WIDGETS -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/accordion-ui/accordion.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/calendar/calendar.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/carousel/carousel.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/chosen/chosen.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/colorpicker/colorpicker.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/datepicker/datepicker.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/datepicker-ui/datepicker.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/daterangepicker/daterangepicker.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/dialog/dialog.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/dropdown/dropdown.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/dropzone/dropzone.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/file-input/fileinput.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/input-switch/inputswitch.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/input-switch/inputswitch-alt.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/ionrangeslider/ionrangeslider.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/jcrop/jcrop.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/jgrowl-notifications/jgrowl.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/loading-bar/loadingbar.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/maps/vector-maps/vectormaps.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/markdown/markdown.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/modal/modal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/multi-select/multiselect.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/multi-upload/fileupload.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/nestable/nestable.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/noty-notifications/noty.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/popover/popover.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/pretty-photo/prettyphoto.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/progressbar/progressbar.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/range-slider/rangeslider.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/slidebars/slidebars.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/slider-ui/slider.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/summernote-wysiwyg/summernote-wysiwyg.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/tabs-ui/tabs.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/theme-switcher/themeswitcher.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/timepicker/timepicker.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/tocify/tocify.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/tooltip/tooltip.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/touchspin/touchspin.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/uniform/uniform.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/wizard/wizard.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/widgets/xeditable/xeditable.css">

<!-- SNIPPETS -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/chat.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/files-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/login-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/notification-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/progress-box.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/todo.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/user-profile.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/snippets/mobile-navigation.css">



<!-- Admin theme -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/themes/admin/layout.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/themes/admin/color-schemes/default.css">

<!-- Components theme -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/themes/components/default.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/themes/components/border-radius.css">

<!-- Admin responsive -->

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/responsive-elements.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/static/assets/helpers/admin-responsive.css">

<!-- JS Core -->

<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/js-core/jquery-core.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/js-core/jquery-ui-core.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/js-core/jquery-ui-widget.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/js-core/jquery-ui-mouse.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/js-core/jquery-ui-position.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/js-core/modernizr.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/static/assets/js-core/jquery-cookie.js"></script>





<script type="text/javascript">
	$(window).load(function() {
		setTimeout(function() {
			$('#loading').fadeOut(400, "linear");
		}, 300);
	});
</script>



</head>


<body>
	<div id="sb-site">
		<div id="page-wrapper">
			<div id="page-header" class="bg-gradient-9">
				<div id="mobile-navigation">
					<button id="nav-toggle" class="collapsed" data-toggle="collapse"
						data-target="#page-sidebar">
						<span></span>
					</button>
					<a href="index.html" class="logo-content-small" title="MonarchUI"></a>
				</div>
				<div id="header-logo" class="logo-bg">
					<a href="index.html" class="logo-content-big" title="Homepthay UI">
						Homeopathy <i>UI</i> <span>The perfect solution for
							Homeopath</span>
					</a> <a href="index.html" class="logo-content-small"
						title="Homepthay UI"> Homeopathy <i>UI</i> <span>The
							perfect solution for Homeopath</span>
					</a> <a id="close-sidebar" href="#" title="Close sidebar"
						style="display: none"> <i class="glyph-icon icon-angle-left"></i>
					</a>
				</div>
				<div id="header-nav-left">
					<div class="user-account-btn dropdown">
						<a href="#" title="My Account" class="user-profile clearfix"
							data-toggle="dropdown"> <img width="28"
							src="${pageContext.request.contextPath}/static/assets/image-resources/gravatar.jpg"
							alt="Profile image"> <span>Dr. B K Kundu</span> <i
							class="glyph-icon icon-angle-down"></i>
						</a>
						<div class="dropdown-menu float-left">
							<div class="box-sm">
								<div class="login-box clearfix">
									<div class="user-img">
										<a href="#" title="" class="change-img">Change photo</a> <img
											src="${pageContext.request.contextPath}/static/assets/image-resources/gravatar.jpg"
											alt="">
									</div>
									<div class="user-info">
										<span> Dr B K Kundu <i>BHMS Homeopath </i>
										</span> <a href="#" title="Edit profile">Edit profile</a> <a href="#"
											title="View notifications" style="display: none">View
											notifications</a>
									</div>
								</div>
								<div class="divider"></div>
								<ul class="reset-ul mrg5B" style="display: none">
									<li><a href="#"> <i
											class="glyph-icon float-right icon-caret-right"></i> View
											login page example

									</a></li>
									<li><a href="#"> <i
											class="glyph-icon float-right icon-caret-right"></i> View
											lockscreen example

									</a></li>
									<li><a href="#"> <i
											class="glyph-icon float-right icon-caret-right"></i> View
											account details

									</a></li>
								</ul>
								<sec:authorize access="hasRole('ROLE_USER')">
									<!-- For login user -->
									<c:url value="/j_spring_security_logout" var="logoutUrl" />
									<form action="${logoutUrl}" method="post" id="logoutForm">
										<input type="hidden" name="${_csrf.parameterName}"
											value="${_csrf.token}" />
									</form>
									<script>
										function formSubmit() {
											document.getElementById("logoutForm").submit();
										}
									</script>
									<div class="pad5A button-pane button-pane-alt text-center">
										<a href="javascript:formSubmit();"
											class="btn display-block font-normal btn-danger"> <i
											class="glyph-icon icon-power-off"></i> Logout
										</a>
									</div>
								</sec:authorize>
							</div>
						</div>
					</div>
				</div>
				<!-- #header-nav-left -->

				<div id="header-nav-right">
					<a href="#" class="hdr-btn" id="fullscreen-btn" title="Fullscreen">
						<i class="glyph-icon icon-move"></i>
					</a> <a href="#" class="hdr-btn sb-toggle-left" id="chatbox-btn"
						title="Chat sidebar" style="display: none"> <i
						class="glyph-icon icon-linecons-paper-plane"></i>
					</a>
				</div>
				<!-- #header-nav-right -->

			</div>
			<div id="page-sidebar">
				<div class="scroll-sidebar">
					<ul id="sidebar-menu">
						<li class="header"><span>Overview</span></li>
						<li><a href="welcome?${_csrf.parameterName}=${_csrf.token}"
							title="Admin Dashboard"> <i
								class="glyph-icon icon-linecons-tv"></i> <span>Admin
									dashboard</span>
						</a></li>
						<li class="divider"></li>
						<li class="header"><span>Components</span></li>
						<li><a href="#" title="Drug/Medicine"> <i
								class="glyph-icon icon-medkit"></i> <span>Drug/Medicine</span>
						</a>
							<div class="sidebar-submenu">
								<ul>
									<li><a
										href="addMedicine?${_csrf.parameterName}=${_csrf.token}"
										title="Add-Medicine"><span>Add
												Medicine</span></a></li>
									<li><a
										href="manageMedicine?${_csrf.parameterName}=${_csrf.token}"
										title="Modify-Delete-Search Medicine"><span>Search & Edit,Delete
												Medicine</span></a></li>			
								</ul>

							</div> <!-- .sidebar-submenu --></li>
						<li><a href="#" title="Drug/Medicine"> <i
								class="glyph-icon icon-medkit"></i> <span>Diseases</span>
						</a>
							<div class="sidebar-submenu">
								<ul>
									<li><a
										href="addDiseases?${_csrf.parameterName}=${_csrf.token}"
										title="Add-Diseases"><span>Add
												Diseases</span></a></li>
									<li><a
										href="manageDiseases?${_csrf.parameterName}=${_csrf.token}"
										title="Modify-Delete-Search Diseases"><span>Search & Edit,Delete
												Diseases</span></a></li>			
								</ul>

							</div> <!-- .sidebar-submenu --></li>	
						<li><a href="#" title="Drug/Medicine"> <i
								class="glyph-icon icon-medkit"></i> <span>Static Data</span>
						</a>
							<div class="sidebar-submenu">
								<ul>
									<li><a
										href="addStaticData?${_csrf.parameterName}=${_csrf.token}"
										title="Add-StaticData"><span>Add
												StaticData</span></a></li>
									<li><a
										href="manageStaticData?${_csrf.parameterName}=${_csrf.token}"
										title="Modify-Delete-Search StaticData"><span>Search & Edit,Delete
												StaticData</span></a></li>			
								</ul>

							</div> <!-- .sidebar-submenu --></li>	
						<li><a href="#" title="Patients"> <i
								class="glyph-icon icon-ambulance"></i> <span>Patients</span>
						</a>
							<div class="sidebar-submenu">
								<ul>
									<li><a
										href="addPatient?${_csrf.parameterName}=${_csrf.token}"
										title="Add Patients"><span>Add Patients</span></a></li>
									<li><a href="managePatient?${_csrf.parameterName}=${_csrf.token}"
										title="Search Patients"><span>Search Patients</span></a></li>
									<li><a href="buttons.html" title="Modify Patients"><span>Modify
												Patients</span></a></li>
									<li><a href="buttons.html" title="Remove Patients"><span>Remove
												Patients</span></a></li>
								</ul>

							</div> <!-- .sidebar-submenu --></li>
					</ul>
				</div>
			</div>

			<div id="page-content-wrapper">
				<div id="page-content">
					<div class="container">