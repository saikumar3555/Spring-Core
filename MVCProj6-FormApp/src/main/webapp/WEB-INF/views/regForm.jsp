<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>${msg}</h1>
	<form:form action="userReg.htm" method="post" modelAttribute="user">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name"/></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>PhNo</td>
				<td><form:input path="phnumber" /></td>
			</tr>
			<tr>
			    <td><input type="reset" value="Reset"/></td>
			    <td><input type="submit" value="Submit"/></td>
			</tr>
		</table>

	</form:form>

</body>
</html>