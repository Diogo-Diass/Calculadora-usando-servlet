<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultado</title>

<style>
	body{
		color:red;

		text-align: center;
		
	}
	body h1{
	margin:400px auto;
	border:5px solid black;	
	width:30%;	
	}

</style>

</head>
<body style="background-color:%{corescolhida};">
	${corescolhida}
	<h1>O RESULTADO É :  ${resultado}</h1>
</body>
</html>