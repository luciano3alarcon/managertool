<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SD SM Manager Tool</title>

<!-- Einbindung von CSS -->
<link rel="stylesheet" href="resources/css/estilo.css">

</head>
<body>
	<div class="login-page">
		<div class="form">
			<form class="login-form" action="/LoginMngToolServlet" method="POST"
				class="login-form">
				<input type="text" id="servicemanager" name="servicemanager"
					placeholder="Service Manager Name"> <br /> <input
					type="password" id="password" name="password"
					placeholder="password"><br />
				<button type="submit" value="Send login">Senden</button>
			</form>
		</div>
	</div>

</body>
</html>