<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SD SM Manager Tool</title>

<!-- Einbindung von CSS -->
<link rel="stylesheet" href="resources/css/estilo.css">

</head>
<body>

	<div class="login-page">
		<div class="form">
			<form class="login-form" action="LoginMngToolServlet" method="post " class="login-form" >
				<input type="text" id="login" name="login" placeholder="username"> <br />
				<input 	type="password" id="password" name="password" placeholder="passwort"><br />
				<button type="submit" value="Send login">Senden</button>
			</form>
		</div>
	</div>

</body>
</html>