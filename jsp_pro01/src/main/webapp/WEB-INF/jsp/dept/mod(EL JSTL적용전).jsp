<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.sharehouse.home.DeptDTO" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>부서 수정</title>
	<%@ include file="../module/head.jsp" %>
	
</head>
<body>
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
		DeptDTO data = (DeptDTO) request.getAttribute("data");
	%>
	<section class="container">
		<form class="small-form" action="./mod" method="post">
			<input type="hidden" name="deptId" value="<%=data.getDeptId() %>"  readonly>
			<div class="input-form wide">
				<label class="input-label">부서명</label>
				<input class="input-text" type="text" name="deptName" value="<%=data.getDeptName() %>" placeholder="부서 이름">
			</div>
			<div class="input-form wide">
				<label class="input-label">관리자ID</label>
				<input class="input-text" type="text" name="mngId" value="<%=data.getMngId() %>" placeholder="관리자 ID">
			</div>
			<div class="input-form wide">
				<label class="input-label">지역ID</label>
				<input class="input-text" type="text" name="locId" value="<%=data.getLocId() %>" placeholder="지역 ID">
			</div>
			<div class="input-form form-right">
				<button class="btn btn-outline btn-ok" type="submit">저장</button>
				<button class="btn btn-outline btn-cancel" type="button">취소</button>
			</div>
		</form>	
	</section>
</body>
</html>