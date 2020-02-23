<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="update">
Id:-<input type="hidden" name="id" value="${data.id }">
<br><br>
Name:-<input type="text" name="name" value="${data.name }">
<br><br>
Address:-<input type="text" name="address" value="${data.address}">
<br><br>
UserName:-<input type="text" name="username" value="${data.username }">
<br><br>
Password:-<input type="password" name="password" value="${data.password }">
<br><br>
Mobile No:-<input type="number" name="mobno" value="${data.mobno }">
<br><br>
<input type="submit" value="Update">
</form>

</div>

</body>
</html>