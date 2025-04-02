<%@page import="com.jsp.spring.student_db.entity.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Student> l = (List) request.getAttribute("list");
	%>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Age</th>
			<th>City</th>
			<th>Course</th>
			<th>PhoneNo</th>
		</tr>
		<%
		for (Student s : l) {
		%>
		<tr>
			<td><%=s.getsId()%></td>
			<td><%=s.getsName()%></td>
			<td><%=s.getsEmail()%></td>
			<td><%=s.getsAge()%></td>
			<td><%=s.getsCity()%></td>
			<td><%=s.getsCourse()%></td>
			<td><%=s.getsPhoneNo()%></td>
			
		</tr>

		<%
		}
		%>
	</table>


</body>
</html>