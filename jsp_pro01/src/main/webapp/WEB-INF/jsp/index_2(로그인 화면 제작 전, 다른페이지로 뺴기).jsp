<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome JSP/Servlet</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/default.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/navigation.css">
</head>
<body>
	<%@ include file="./module/navigation.jsp" %>
	<h1>Welcome JSP/Servlet</h1>
	<c:set var="data" value="Hello1" scope="page" />
	<c:set var="data" value="Hello2" scope="request" />
	<c:set var="data" value="Hello3" scope="session" />
	<c:set var="data" value="Hello4" scope="application" />
	${pageScope.data}<br>
	${requestScope.data}<br>
	${sessionScope.data}<br>
	${applicationScope.data}<br>
	
	<c:set var="arr">
		가, 나, 다, 라
	</c:set>
	${arr}<br>
	
	<c:remove var="data" scope="page" />
	<c:remove var="data" scope="request" />
	<c:remove var="data" scope="session" />
	<c:remove var="data" scope="application" />
	${pageScope.data}<br>
	${requestScope.data}<br>
	${sessionScope.data}<br>
	${applicationScope.data}<br>
	
	<hr>
	
	<c:url var="url" value="./depts">
		<c:param name="x" value="Hello" />
		<c:param name="y" value="Hello" />
	</c:url>
	${url}
	
	<br>
	<hr>
	<br>
	
	<h1>Welcome JSP/Servlet</h1>
	<fmt:formatNumber value="1000" /><br>
	<fmt:formatNumber value="0.1" type="percent" /><br>
	<fmt:formatNumber value="1000" type="currency" /><br>
	<fmt:formatNumber value="1000" type="currency" currencySymbol="$"/><br>
	
	<br>
	<hr>
	<br>
	
	<%
		Date date = new Date();
		request.setAttribute("date", date);
	%>
	<fmt:formatDate value="${date}" type="date" /><br>
	<fmt:formatDate value="${date}" type="date" dateStyle="full" /><br>
	<fmt:formatDate value="${date}" type="date" dateStyle="long" /><br>
	<fmt:formatDate value="${date}" type="date" dateStyle="medium" /><br>
	<fmt:formatDate value="${date}" type="date" dateStyle="short" /><br>
	<fmt:formatDate value="${date}" type="date" pattern="YYYY-MM-dd E EEEE" /><br>
	
	<br>
	<hr>
	<br>
	
	<fmt:formatDate value="${date}" type="time" /><br>
	<fmt:formatDate value="${date}" type="time" timeStyle="full" /><br>
	<fmt:formatDate value="${date}" type="time" timeStyle="long" /><br>
	<fmt:formatDate value="${date}" type="time" timeStyle="medium" /><br>
	<fmt:formatDate value="${date}" type="time" timeStyle="short" /><br>
	<fmt:formatDate value="${date}" type="time" pattern="a hh:mm:ss" /><br>
	<fmt:formatDate value="${date}" type="time" pattern="HH:mm:ss Z z zzzz" /><br>
	
	<br>
	<hr>
	<br>
	
	<fmt:formatDate value="${date}" type="both" /><br>
	<fmt:formatDate value="${date}" type="both" dateStyle="full" timeStyle="short" /><br>
	
	<br>
	<hr>
	<br>
	
	<c:choose>
		<c:when test="${param.x == 'a'}">
			파라미터 x의 값이 a 면 실행
		</c:when>
		<c:when test="${param.x == 'b'}">
			파라미터 x의 값이 b 면 실행
		</c:when>
		<c:when test="${param.x == 'c'}">
			파라미터 x의 값이 c 면 실행
		</c:when>
		<c:otherwise>
			모든 when 조건에 해당하지 않으면 실행됨
		</c:otherwise>
	</c:choose>
	
	<br>
	<hr>
	<br>
	
	<%
		List<String> lst = new ArrayList<String>();
		lst.add("a"); lst.add("b"); lst.add("c"); lst.add("d");
		request.setAttribute("lst", lst);
	%>
	<ul>
		<c:forEach begin="1" end="5" var="v">
			<li>${v}</li>
		</c:forEach>
	</ul>
	<br>
		<ul>
		<c:forEach items="${lst}" var="v">
			<li>${v}</li>
		</c:forEach>
	</ul>
	<br>
	<%
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "가"); map.put("b", "나"); map.put("c", "다");
		request.setAttribute("map", map);
	%>
	<ul>
		<c:forEach items="${map}" var="v">
			<li>${v}</li>
		</c:forEach>
	</ul>
</body>
</html>