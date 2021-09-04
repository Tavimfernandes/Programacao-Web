<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CALCULADORA</title>
</head>
<body>
<h1>Calculadora</h1>
<form action= "/programacao/ServletCalculadora" method="get">
<label>Primeiro valor:</label>
<input type="text" name= "valorA"><br>
<label>Segundo valor:</label>
<input type="text" name= "valorB"><br> 
<select name= "opcao">
<option value = "+">(+)</option>
<option value = "-">(-)</option>
<option value = "">()</option>
<option value = "/">(/)</option>
</select>
<input type="submit" value= "Calcular">
</form>
</body>
</html>