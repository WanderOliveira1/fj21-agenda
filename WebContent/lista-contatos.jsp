<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="cabecalho.jsp"/>
	 <!--  cria o DAO -->
	 <jsp:useBean id="dao" class="br.com.caelum.dao.ContatoDao"/>
<table border ="1">
<!-- percorre contatos montando as linhas da tabela -->

<c:forEach var="contato" items="${dao.lista}" varStatus="id">
	<tr bgcolor ="#${id.count %2 == 0 ? 'aee88' : 'fffff'}">
		<td>${id.count}</td>
		<td>${contato.nome}</td>
		<td>
		<c:if test="${not empty contato.email}">
			<a href="mailto:{contato.email}">${contato.email}</a>
			</c:if>
				<c:if test="${ empty contato.email}">
			E-mail não informado
			</c:if>
		</td>
		<td>${contato.endereco}</td>
		<td>
		<fmt:formatDate value="${contato.dataNascimento.time}" pattern = "dd/MM/yyyy" />
		</tr>
		</c:forEach>
	</table>
	<c:import url="rodape.jsp"/>
</body>
</html>