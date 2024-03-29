<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.sharehouse.home.DeptDTO" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>부서 조회 결과</title>
	<%@ include file="../module/head.jsp" %>
</head>
<body>
	<%@ include file="../module/navigation.jsp" %>
	<section class="container">
		<div>
			<form action="./depts" method="get">
				<div class="input-form form-left">
					<button class="btn btn-outline" type="button" onclick="location.href='./depts/add'">추가</button>
				</div>
				<div class="input-form form-right">
					<input class="input-text" type="text" name="search" data-required="부서코드를 입력하세요.">
					<button class="btn btn-outline" type="submit">조회</button>
					<!-- div class="required-box show">부서코드를 입력하세요.</div -->
				</div>
			</form>
		</div>
		<table class="table wide vertical-hidden hover">
			<colgroup>
				<col class="col-60">
				<col class="col-auto">
				<col class="col-60">
				<col class="col-60">
				<col class="col-120">
			</colgroup>
			<thead>
				<tr>
					<th>DeptId</th>
					<th>DeptName</th>
					<th>MngId</th>
					<th>LocId</th>
					<th class="border-hidden-right"></th>
				</tr>
			</thead>
			<tbody>
				
		<%
				if(request.getAttribute("deptDatas") != null) {
					List<DeptDTO> datas = (List<DeptDTO>) request.getAttribute("deptDatas");
					for(DeptDTO data: datas) {
		%>
						<tr>
							<td><%=data.getDeptId() %></td>
							<td><%=data.getDeptName() %></td>
							<td><%=data.getMngId() %></td>
							<td><a href="./locs?search=<%=data.getLocId() %>"><%=data.getLocId() %></a></td>
							<td class="border-hidden-right">
								<button type="button" class="btn btn-icon" onclick="location.href='./depts/mod?id=<%=data.getDeptId() %>'">
									<span class="material-symbols-outlined">edit</span>
								</button>
								<button type="button" class="btn btn-icon" onclick="location.href='./depts/del?id=<%=data.getDeptId() %>'">
									<span class="material-symbols-outlined">delete</span>
								</button>
							</td>
						</tr>
		<%
					}
				}
		%>
			</tbody>
		</table>
		<% if(request.getAttribute("pageList") != null) { %>
			<%@ include file="../module/paging.jsp" %>
		<% } else { %>
			<div class="input-form wide form-left">
				<button class="btn btn-outline btn-ok" type="button" onclick="location.href='<%=request.getContextPath() %>/depts'">전체보기</button>
			</div>
		<% } %>
	</section>
</body>
</html>