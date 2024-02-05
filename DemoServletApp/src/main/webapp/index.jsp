<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add 2 numbers in different ways..!</title>
</head>
<body>
	<form action="add">
		<input type="text" name="n1" placeholder="enter first number (service method)" /> 
		<input type="text" name="n2" placeholder="enter Second number(service method)" />
		<button>Submit</button>
	</form>
	
	<!-- for doPost() -->
	<form action="addpost" method="post">
		<input type="text" name="n1" placeholder="enter first number (dopost method)" /> 
		<input type="text" name="n2" placeholder="enter Second number (dopost method)" />
		<button>Submit</button>
	</form>
	</nbsp>
	<!-- for doGet()   -->
	<form action="addget" method="get">
		<input type="text" name="n1" placeholder="enter first number (doget method)" /> 
		<input type="text" name="n2" placeholder="enter Second number (doget method)" />
		<button>Submit</button>
	</form>
	
</body>
</html>