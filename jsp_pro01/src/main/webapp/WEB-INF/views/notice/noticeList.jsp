<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="java.util.ArrayList,notice.model.vo.Notice" %>
<% ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h1 align="center">1</h1>
	<div align="center">
		<button type="button" onclick="history.back();">이전 페이지</button>
		<button onclick="Location.href='<%= request.getContextPath() %>'">홈으로 돌아가기</button>	
	</div>
</body>
</html>