<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" ><h1>Success Page</h1></div>
<script type="text/javascript">
	function addnew() {
		alert("in addnew()");
		document.my.action = "add";
		document.my.submit();
	}

	function del() {
		alert("in del()");
		document.my.action = "delete";
		document.my.submit();
	}

	function edit() {
		alert("in edit()");
		document.my.action = "edit";
		document.my.submit();
	}
	
	function exit() {
		alert("in exit()");
		document.my.action = "logout";
		document.my.submit();
	}
</script>
</head>
<body>
<div align="center">
	<table border="2" style="color: pitch">
		<thead>Student Info
		</thead>
		<tr>
			<th>rid</th>
			<th>Id</th>
			<th>Name</th>
			<th>Address</th>
			<th>UserName</th>
			<th>Password</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<tr>
			<form name="my">
				<c:forEach items="${data}" var="s">
					<tr>
						<td><input type="radio" name="id" value="${s.id }">
						<td><c:out value="${s.id }"></c:out></td>
						<td><c:out value="${s.name }"></c:out></td>
						<td><c:out value="${s.address }"></c:out></td>
						<td><c:out value="${s.username }"></c:out></td>
						<td><c:out value="${s.password }"></c:out></td>
						<td><input type="submit" value="Delete" onclick="del()"></td>
						<td><input type="submit" value="Edit" onclick="edit()"></td>
					</tr>

				</c:forEach>
		</tr>
	</table>
	<br>
	<td><input type="submit" value="Add" onclick="addnew()"></td>
	</div>
	</form>
</body>
</html>