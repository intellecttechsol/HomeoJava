<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html class="chrome">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>:: HomeoProd ::</title>
<!-- Favicon-->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet" type="text/css">
<link rel="icon"
	href="${pageContext.request.contextPath}/static/assets/images/favicon.ico"
	type="image/x-icon">
<!-- Custom Css -->
<link
	href="${pageContext.request.contextPath}/static/assets/css/main.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/static/assets/css/login.css"
	rel="stylesheet">
<!-- Swift Themes. You can choose a theme from css/themes instead of get all themes -->
<link
	href="${pageContext.request.contextPath}/static/assets/css/themes/all-themes.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/static/assets/js-core/jquery-core.js"></script>

</head>
<body class="login-page authentication ls-closed">

	<div class="container">
		<div class="card">
			<h1 class="title">
				<span>Homeopathy Doctor</span>Forgot Password?
				<div class="msg">Enter your e-mail address below to reset your
					password.</div>
			</h1>
			<div class="col-md-12">
				<form id="sign_in" name="sign_in" class="col-xs-12"
					onsubmit="validateForgotPassword();">
					<div class="input-group">
						<span class="input-group-addon"> <i class="zmdi zmdi-email"></i>
						</span>
						<div class="form-line">
							<input type="email" class="form-control" name="username"
								placeholder="Username/Email" required autofocus>
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="zmdi zmdi-lock"></i>
						</span>
						<div class="form-line">
							<input type="password" class="form-control" name="password"
								id="password" minlength="6" placeholder="New Password" required onchange="chkPassword();">
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="zmdi zmdi-lock"></i>
						</span>
						<div class="form-line">
							<input type="password" class="form-control"
								id="confirm" minlength="6" placeholder="Confirm Password"
								required onchange="chkPassword();">
						</div>
					</div>
					<div class="row">
						<div class="col-xs-12 text-center">
							<input type="submit"
								class="btn btn-raised waves-effect g-bg-cyan"
								value="RESET MY PASSWORD">
						</div>
						<div class="col-xs-12 text-center">
							<a href="login">Sign In!</a>
						</div>
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
			</div>
		</div>
	</div>

	<script
		src="${pageContext.request.contextPath}/static/assets/bundles/libscripts.bundle.js"></script>
	<!-- Lib Scripts Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/static/assets/bundles/vendorscripts.bundle.js"></script>
	<!-- Lib Scripts Plugin Js -->
	<script
		src="${pageContext.request.contextPath}/static/assets/bundles/mainscripts.bundle.js"></script>
	<!-- Custom Js -->
	<script type="text/javascript">
		
		
		$(document).ready(function() {
			$('#sign_in').submit(function(event) {
				event.preventDefault();
			});
		});
	
		$("<style type='text/css'>#boxMX{display:none;background: #333;padding: 10px;border: 2px solid #ddd;float: left;font-size: 1.2em;position: fixed;top: 10%; left: 50%;z-index: 99999;box-shadow: 0px 0px 20px #999; -moz-box-shadow: 0px 0px 20px #999; -webkit-box-shadow: 0px 0px 20px #999; border-radius:6px 6px 6px 6px; -moz-border-radius: 6px; -webkit-border-radius: 6px; font:13px Arial, Helvetica, sans-serif; padding:6px 6px 4px;width:300px; color: white;}</style>").appendTo("head");
	
		function alertMX(t) {
			$("body").append($("<div id='boxMX'><p class='msgMX'></p></div>"));
			$('.msgMX').text(t); var popMargTop = ($('#boxMX').height() + 24) / 2,
				popMargLeft = ($('#boxMX').width() + 24) / 2;
			$('#boxMX').css({
				'margin-top' : -popMargTop,
				'margin-left' : -popMargLeft
			}).fadeIn(600);
			$("#boxMX").click(function() {
				$(this).remove();
			});
		};
	
		function chkPassword(){
			var password = document.getElementById("password");
			var confirm = document.getElementById("confirm");
			if (password.value != confirm.value) {
				confirm.setCustomValidity("Passwords Don't Match");
			} else {
				confirm.setCustomValidity('');
			}
		}
		
		function validateForgotPassword() {
			var password = document.getElementById("password");
			var confirm = document.getElementById("confirm");
			if (password.value != confirm.value) {
				confirm.setCustomValidity("Passwords Don't Match");
			} else {
				confirm.setCustomValidity('');
				var serialized = $("#sign_in").serializeArray();
				var s = '';
				var data = {};
				for (s in serialized) {
					data[serialized[s]['name']] = serialized[s]['value']
				}
				var x = JSON.stringify(data);
	
				$.ajax({
					url : "http://localhost:8082/Homeo-RestWS/services/userservice/resetPassword",
					method : "POST",
					data : x,
					contentType : "application/json",
					success : function(result, status, jqXHR) {
						alertMX(result);
					},
					error (jqXHR, textStatus, errorThrown) {
						alertMX(errorThrown);
					}
				});
	
			}
			return true;
		}
	</script>

</body>
</html>