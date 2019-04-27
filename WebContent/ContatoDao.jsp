<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.*,
		br.com.caelum.dao.*,
		br.com.caelum.modelo.*" %>
<%ContatoDao dao = new ContatoDao();
List<Contato> contatos = dao.getLista();

for (Contato contato : contatos){
%>
	<li><%=contato.getNome()%>, <%=contato.getEmail()%>;
	<%=contato.getEndereco()%></li>
	<%
	}
	%>
	
</body>
</html>