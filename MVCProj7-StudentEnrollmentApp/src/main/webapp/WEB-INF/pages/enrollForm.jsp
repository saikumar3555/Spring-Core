(9999999999999999999999999998777777777777777777777779)e language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
-
<head>
<meta charset="ISO-8859-1">
<title>Student EnrollForm</title>
</head>
<body>

	<h1>${enrollSuccessMsg}</h1>
	<form:form action="enrollStudent.htm" modelAttribute="student"
		method="post">
		<table>
			<tr>
				<td>Student ID</td>
				<td><form:input path="sid" /></td>
			</tr>

			<tr>
				<td>Student Name</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Mobile No</td>
				<td><form:input path="phno" /></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" label="Male" value="M" /></td>
				<td><form:radiobutton path="gender" label="Female" value="F" /></td>
			</tr>

			<tr>
				<td>Qualification</td>
				<td><form:select path="qualification" items="${qul}">
						<%-- <form:option value="">-select-</form:option>
						<form:option value="UG">Under Graduate</form:option>
						<form:option value="G">Graduate</form:option>
						<form:option value="PG">Post Graduate</form:option> --%>
					</form:select></td>
			</tr>

			<tr>
				<td>Courses</td>
				<td><form:select path="courses">
						<form:option value="java">Java</form:option>
						<form:option value="testing">Testing</form:option>
						<form:option value="python">Python</form:option>
						<form:option value="oracle">Oracle</form:option>
					</form:select></td>
			</tr>

			<tr>
				<td>Timings</td>
				<td><form:checkbox path="timings" value="morning" />Morning <form:checkbox
						path="timings" value="afternoon" />Afternoon <form:checkbox
						path="timings" value="evening" />Evening</td>
			</tr>

			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>


		</table>
	</form:form>


</body>
</html>