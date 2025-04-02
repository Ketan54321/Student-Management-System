<%@page import="com.jsp.spring.student_db.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input {
	width: 225px;
	height: 50px;
}
</style>
</head>
<body>
	<%
		Student s=(Student)request.getAttribute("student");
	%>
	<form action="update-student">
		<input type="number" value="<%=s.getsId() %>" name="sId" readonly="readonly"><br>
		<input type="text" value=<%=s.getsName() %>  name="sName"><br>
		<input type="text" value=<%=s.getsEmail() %>  name="sEmail"><br>
		<input type="number" value=<%=s.getsAge() %>  name="sAge"><br>
		<input type="text" value=<%=s.getsCourse() %>  name="sCourse"><br>
		<input type="text" value=<%=s.getsCity()%>  name="sCity"><br>
		<input type="tel" value=<%=s.getsPhoneNo() %>  name="sPhonNo"><br>
		<input type="submit" placeholder="UPDATE">
	</form>

</body>
</html>