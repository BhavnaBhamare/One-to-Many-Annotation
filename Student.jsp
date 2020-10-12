<%@page import="com.pojo.Depart"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BLManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
tr {
	border: thick;
	border-color: yellow;
	height: 3cm;

}

</style>
</head>
<body>
<%
		BLManager bl = new BLManager();
		List<Depart> dl = bl.serachlist();
		session.setAttribute("list", dl);
	%>
	<h1>Student Details</h1>
	<form action="StudentServlet" method="post">
		<table border="20" bordercolor="red" align="center" width="80%">
			<tr align="center">
				<th>Data</th>
				<th>Inputs</th>
			</tr>
			<tr>
				<td>First Name:-</td>
				<td><input type="text" name="sfname"></td>
			</tr>
			<tr>
				<td>Last Name:-</td>
				<td><input type="text" name="slname"></td>
			</tr>
			<tr>
				<td>Father Name:-</td>
				<td><input type="text" name="sfaname"></td>
			</tr>
			<tr>
				<td>Mother Name:-</td>
				<td><input type="text" name="smname"></td>
			</tr>
			<tr>
				<td>Email:-</td>
				<td><input type="text" name="semail"></td>
			</tr>
			<tr>
				<td>Phone:-</td>
				<td><input type="text" name="sphone"></td>
			</tr>
			<tr>
				<td>Address:-</td>
				<td><input type="text" name="saddress"></td>
			</tr>
			<tr>
				<td>Date of birth:-</td>
				<td><input type="text" name="sdateofbirth"></td>
			</tr>
			<tr>
				<td>Department Name</td>
				<td><select name="dname">
				<option>Select Department</option>
				<c:forEach items="${sessionScope.list}" var="dl">
				<option>${dl.dname}</option>
				</c:forEach>
				</select>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Depart"></td>
			</tr>
		</table>


	</form>
</body>
</html>