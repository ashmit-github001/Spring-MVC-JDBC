<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<form method="POST" action="userLogin">
		<label for="username">User Name:</label><br>
		<input type="text" name="username" placeholder="${userLoginDetails.username}"><br>
		<label for="password">Password:</label><br>
		<input type="password" name="password" placeholder="${userLoginDetails.password}"><br><br>
		<input type="submit" value="Sign in">
	</form>
</body>
</html>