<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Successful</title>
</head>
<body>
	<div align="left">
		<p> Welcome ${username}, </p>
	</div>
	
	<div align="right">
		<a href="/e-commerce/userLogout">Logout</a>
	</div>
	
	<div align="center">
		<form method="post" action="shopping/saveShoppingList">
			<label for="iName">Item Name:</label><br>
			<input type="text" name="itemName" id="iName"><br>
			<label for="iType">Item Type:</label><br>
			<input type="text" name="itemType" id="iType"><br>
			<label for="iPrice">Item Price:</label><br>
			<input type="text" name="itemPrice" id="iPrice"><br><br>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>