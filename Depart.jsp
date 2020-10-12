<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
tr {
	border: thick;
	border-color: purple;
	height: 3cm;
}
</style>
</head>
<body>
	<h1>Department Details</h1>
	<form action="DepartServlet" method="post">
		<table border="20" bordercolor="red" align="center" width="80%">
			<tr align="center">
				<th>Data</th>
				<th>Inputs</th>
			</tr>
			<tr>
				<td>Name:-</td>
				<td><input type="text" name="dname"></td>
			</tr>
			<tr>
				<td>Phone:-</td>
				<td><input type="text" name="dphone"></td>
			</tr>
			<tr>
				<td>Email:-</td>
				<td><input type="text" name="demail"></td>
			</tr>
			<tr align="center" >
				<td colspan="2"><input type="submit" value="Add Depart"></td>
			</tr>
		</table>
	</form>
</body>
</html>