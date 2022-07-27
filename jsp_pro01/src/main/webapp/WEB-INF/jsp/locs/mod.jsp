<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="locs.model.LocsDTO" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>지역 수정</title>
</head>
<body>
	<h1>지역 수정</h1>
	<%
		if(request.getAttribute("errorMsg") != null) {			
	%>
		<script type="text/javascript">
			alert("<%=request.getAttribute("errorMsg") %>");
		</script>
	<%
		}	
	%>
	<% 
		LocsDTO data = (LocsDTO) request.getAttribute("data");
	%>
	<form action="./mod" method="post">
			<input type="hidden" name="locId" value="<%=data.getLocId() %>"  readonly>
		<div>
			<input type="text" name="stAddr" value="<%=data.getStAddr() %>" placeholder="도로명">
		</div>
		<div>
			<input type="text" name="postal" value="<%=data.getPostal() %>" placeholder="우편번호">
		</div>
		<div>
			<input type="text" name="city" value="<%=data.getCity() %>" placeholder="도시명">
		</div>
		<div>
			<input type="text" name="state" value="<%=data.getState() %>" placeholder="주 이름">
		</div>
		<div>
			<input type="text" name="ctyId" value="<%=data.getCtyId() %>" placeholder="시 이름">
		</div>
		<div>
			<button type="submit">저장</button>
		</div>
	</form>
</body>
</html>