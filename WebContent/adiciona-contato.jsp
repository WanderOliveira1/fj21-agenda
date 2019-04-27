<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<form action="adicionaContato" method="POST">
		Nome: <input type="text" name="nome" />
		<br/>
		E-mail: <input	type="text" name="email" />
		<br/>
		Endereço: <input type="text"name="endereco" />
		<br/>
		Data Nascimento: <input id="#dataNascimento" type="text" name="dataNascimento"/>
		<script>
		$("#dataNascimento").datepicker();
		</script>
		<campoData id= "dataNascimento"/>
		<br/>
		
		 <input type="submit" value="Gravar" />
	</form>
</body>
</html>