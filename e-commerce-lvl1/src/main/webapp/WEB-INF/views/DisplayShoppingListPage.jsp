<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping List</title>
</head>
<body>
	<div align="left">
		<p> Welcome ${username}, </p>
	</div>
	
	<div align="right">
		<a href="/e-commerce/userLogout">Logout</a>
	</div>
	
	<div align="center">
		<p> Item saved successfully! </p>
		<p> Item Name: ${shoppingList.itemName}</p>
		<p> Item Type: ${shoppingList.itemType}</p>
		<p> Item Price: ${shoppingList.itemPrice}</p>
	</div>
</body>
</html>