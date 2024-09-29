<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<p> Welcome to www.shopping.com </p> <br>
  	<input type="submit" id="btn-sign-in" value="Sign in">
  	<input type="submit" id="btn-sign-up" value="Sign up">
	
	  <script type="text/javascript">
	  document.getElementById("btn-sign-in").onclick = () => location.href = "userLogin";
	  document.getElementById("btn-sign-up").onclick = () => location.href = "userRegistration";
	  </script>
</body>
</html>