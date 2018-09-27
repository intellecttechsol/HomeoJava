<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
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
<style>
.errorlogin {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msglogin {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}
</style>
</head>
<body class="login-page authentication ls-closed"
	onload='document.loginForm.username.focus();'>

	<div class="container">
		<div class="card">
			<h1 class="title">
				<span>Homeopathy Care Product</span>Login <span class="msg">Sign
					in to start your session</span>
			</h1>
			<div class="col-md-12">

				<c:if test="${not empty error}">
					<div class="errorlogin">${error}</div>
				</c:if>
				<c:if test="${not empty msg}">
					<div class="msglogin">${msg}</div>
				</c:if>

				<form name='loginForm' action="<c:url value='/auth/login_check' />"
					method='POST'>

					<div class="input-group">
						<span class="input-group-addon"> <i
							class="zmdi zmdi-account"></i>
						</span>
						<div class="form-line">
							<input type="text" class="form-control" name="username"
								placeholder="Username" required autofocus>
						</div>
					</div>
					<div class="input-group">
						<span class="input-group-addon"> <i class="zmdi zmdi-lock"></i>
						</span>
						<div class="form-line">
							<input type="password" class="form-control" name="password"
								placeholder="Password" required>
						</div>
					</div>
					<div>
						<div class="text-center">
							<input name="submit" type="submit" value="SIGN IN"
								class="btn btn-raised waves-effect g-bg-cyan" /> <a
								href="sign-up" class="btn btn-raised waves-effect">SIGN
								UP</a>
						</div>
						<div class="text-center">
							<a href="forgot-password">Forgot Password?</a>
						</div>
					</div>
					<input type="hidden" name="${_csrf.parameterName}"
						value="${_csrf.token}" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>