<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<title>:: HomeoProd ::</title>
<style type="text/css">
input[type="checkbox"]:required:invalid+label {
	color: red;
}

input[type="checkbox"]:required:valid+label {
	color: green;
}
</style>
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
				<span>Homeopathy Doctor</span>Register <span class="msg">Register
					a new membership</span>
			</h1>
			<div class="col-md-12">
				<form id="sign_up" name="sign_up" class="col-xs-12" onsubmit="validatePassword();">
					<div class="input-group">
						<span class="input-group-addon"> <i
							class="zmdi zmdi-account"></i>
						</span>
						<div class="form-line">
							<input type="text" class="form-control" name="name"
								placeholder="Name Surname" required autofocus>
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="zmdi zmdi-email"></i>
						</span>
						<div class="form-line">
							<input type="email" class="form-control" name="username"
								placeholder="Email Address(Username)" required>
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="zmdi zmdi-lock"></i>
						</span>
						<div class="form-line">
							<input type="password" class="form-control" id="password"
								name="password" minlength="6" placeholder="Password" required onchange="chkPassword();">
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="zmdi zmdi-lock"></i>
						</span>
						<div class="form-line">
							<input type="password" class="form-control" id="confirm"
								minlength="6" placeholder="Confirm Password" required onchange="chkPassword();">
						</div>
					</div>
					<div class="form-group">
						<input type="checkbox" required id="terms" class="form-control">
						<label for="terms">I read and agree to the terms of usage.
						</label>
					</div>
					<div class="text-center">
						<input type="submit" class="btn btn-raised g-bg-cyan waves-effect"
							value="SIGN UP"	>
					</div>
					<div class="m-t-10 m-b--5 align-center">
						<a href="login">You already have a membership?</a>
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
			</div>
		</div>
	</div>
<!--
	<script
		src="${pageContext.request.contextPath}/static/assets/bundles/libscripts.bundle.js"></script>
	<!-- Lib Scripts Plugin Js -->
<!--	<script
		src="${pageContext.request.contextPath}/static/assets/bundles/vendorscripts.bundle.js"></script>
	<!-- Lib Scripts Plugin Js -->
<!--	<script
		src="${pageContext.request.contextPath}/static/assets/bundles/mainscripts.bundle.js"></script>
	<!-- Custom Js -->
	<script type="text/javascript">
		$(document).ready(function()
				{
				    $('#sign_up').submit(function(event){
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
		}
		;
		
		function chkPassword(){
			var password = document.getElementById("password");
			var confirm = document.getElementById("confirm");
			if (password.value != confirm.value) {
				confirm.setCustomValidity("Passwords Don't Match");
			} else {
				confirm.setCustomValidity('');
			}
		}
		
		function validatePassword() {
			var password = document.getElementById("password");
			var confirm = document.getElementById("confirm");
			if (password.value != confirm.value) {
				confirm.setCustomValidity("Passwords Don't Match");
			} else {
				confirm.setCustomValidity('');
				var serialized = $("#sign_up").serializeArray();
				var s = '';
				var data = {};
				for (s in serialized) {
					data[serialized[s]['name']] = serialized[s]['value']
				}
				var x = JSON.stringify(data);
	
				$.ajax({
					url : "http://localhost:8082/Homeo-RestWS/services/userservice/createUser",
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