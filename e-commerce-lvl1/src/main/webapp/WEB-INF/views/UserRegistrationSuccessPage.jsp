<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Successful</title>
</head>
<body>
	<script>
		alert("Congratulations ${userRegistrationDetails.firstname}, you are registered successfully!");
		function myFunction() {
			  timeout = setTimeout(alertFunc, 3000);
			}

		function alertFunc() {
			window.location.href="/e-commerce/userLogin"
		}
		
		myFunction();
	</script>
</body>
</html>