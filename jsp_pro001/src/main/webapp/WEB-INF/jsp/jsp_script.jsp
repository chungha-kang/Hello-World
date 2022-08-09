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
	<title>JSP -Script</title>
</head>
<body>
	<!-- HTML 주석 -->
	<h1>JSP - Script</h1>
		<div>로또 번호 생성기<br>
			<%-- 주석 --%>
			<%
				// Java 주석
				for(int i = 0; i < 6; i++) {
					int number = rd.nextInt(100);
					out.println(number);
				}
			%>
		</div>
		<hr>
		<div>로또 번호 생성기2
			<ul>
			<%
				for(int i = 0; i < 6; i++) {
					int number = rd.nextInt(100);
			%>
					<li><%=number %></li>
			<%
				}
			%>
			</ul>
		</div>
		<hr>
		<div>
			<input type="text" value="<%=rd.nextInt(100) %>">
		</div>
</body>
</html>