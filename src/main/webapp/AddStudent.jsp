<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input{
width:225px;
height:50px;
}
</style>
</head>
<body>
	<form action="add-student" method="post">
		<input type="number" placeholder="Enter Student Id" name="sId"><br>
		<input type="text" placeholder="Enter Student Name" name="sName"><br>
		<input type="text" placeholder="Enter Student Email" name="sEmail"><br>
		<input type="number" placeholder="Enter Student Age" name="sAge"><br>
		<input type="text" placeholder="Enter Student Course" name="sCourse"><br>
		<input type="text" placeholder="Enter Student City" name="sCity"><br>
		<input type="tel" placeholder="Enter Student PhoneNo" name="sPhonNo"><br>
		<input type="submit" value="ADD">
	</form>

</body>
</html>