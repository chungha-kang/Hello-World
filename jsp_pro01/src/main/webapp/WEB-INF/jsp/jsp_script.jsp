<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<%!
	public Random rd = new Random();
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP - Script</title>
</head>
<body>
	<!-- HTML 주석 -->
	<h1>JSP - Script</h1>
	<%-- 주석 --%>
	<%
		// 자바 주석
		for(int i =0; i < 6; i++) {
			int number = rd.nextInt(100);
//			out.println(number);
//	  	}
	%>
		<li><%=number %></li>
	<%
		}
	%>
	<div>
		<input type="text" value="<%=rd.nextInt(100) %>">
	</div>
</body>
</html>