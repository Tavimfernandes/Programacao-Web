<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario</title>
</head>
<body>
<h1>Contato</h1>
<form action="/programacao/ServletNomeCompleto" method="get">
	Seu nome:<br>
	<input type="text" name="nome" /> <br>
	
	Seu sobrenome:<br>
	<input type="text" name="sobrenome" /><br>
	<input type="submit" value="Enviar" />
</form>
</body>
</html>