<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apresenta a quantidade de acessos a esta página</title>
</head>
<body>
<% aula08.contador.novoAcesso(); %>

Quantidade de acessos a esta página:
<b><%= aula08.contador.getQuantidadeAcessos() %></b>

<br>O primeiro acesso foi dia:
<b><%= aula08.contador.getDataInicial() %></b>

<br>O último acesso foi dia:
<b><%= aula08.contador.getDateTime() %></b>
</body>
</html>
