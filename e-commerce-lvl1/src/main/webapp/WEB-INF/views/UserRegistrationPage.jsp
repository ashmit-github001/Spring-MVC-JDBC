<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<form method="POST" action="userRegistration">
		<label>First Name:</label><br>
		<input type="text" name="firstname" required><br>
		<label>Middle Name:</label><br>
		<input type="text" name="middlename"><br>
		<label>Last Name:</label><br>
		<input type="text" name="lastname"><br>
		<label>User Name:</label><br>
		<input type="text" name="username" required><br>
		<label>Email:</label><br>
		<input type="text" name="email" required><br>
		<label>Password:</label><br>
		<input type="password" name="password" required><br><br>
		<input type="submit" value ="Sign up"/>		
	</form>
</body>
</html>