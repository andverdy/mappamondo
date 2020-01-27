<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mappamondo Web</title>
<style>
table, th, td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<h1>Città</h1>

	<table>
		<tr>
			<th>Lista delle Città - Numero Abitanti</th>
		</tr>
		<c:forEach items="${cityList}" var="listCity">
			<tr>
				<td>
					<p>&nbsp &nbsp ${listCity.name} - ${listCity.population} &nbsp
					</p>
				</td>
			</tr>
		</c:forEach>
		<a href="./ListCountryServlet">Torna alle nazioni</a>

	</table>

</body>
</html>