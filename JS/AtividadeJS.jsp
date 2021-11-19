<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Atividade </title>

<script type="text/javascript">

function InserirRegistro(){
	var nome = document.getElementById("inputNome").value;
	var cpf = document.getElementById("inputCPF").value;
	
	var tabela = document.getElementById("registros");
	// Recuperar a quantidade de linhas da tabela para dar funcionalidade no código
	
	var linhasTotais = tabela.rows.length;
	
	// Adiciona uma linha ao final da tabela
	
	var novaLinha = tabela.insertRow(linhasTotais);
	
	//Adiciona duas cédulas à linha criada
	
	var novaCelularNome = novaLinha.insertCell(0);
	var novaCelularCPF = novaLinha.insertCell(1);
	
	// Definir o conteúdo das cédulas criadas
	
	novaCelulaNome.innerHTML = nome;
	novaCelularCPF.innerHTML = cpf;
	
}

</script>

</head>
<body>
<h2>Atividade Programação WEB</h2>
	<script type="text/javascript">

	function mCPF(cpf){
	cpf=cpf.replace(/\D/g,"")
	cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
	cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
	cpf=cpf.replace(/(\d{3})(\d{1,2})$/,"$1-$2")
	return cpf
	}

	</script>
	
	Nome: <input id="inputNome" type="text"/><br/>
	CPF: <input id="inputCPF" type="text" onkeydown="javascript: fMasc( this, mCPF );"><br/>
	<input type="button" value="Inserir Registro" onclick="inserirRegistro()"><br/><br/>
	
<table border="1">
	<tr>
		<th>Nome</th>
		<th>CPF</th>
	</tr>
	
</table>

</body>
</html>
