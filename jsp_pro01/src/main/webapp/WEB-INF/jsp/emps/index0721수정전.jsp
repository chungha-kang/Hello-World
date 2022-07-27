<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>직원</title>
	<%@ include file="../module/head.jsp" %>
</head>
<body>
	<%@ include file="../module/navigation.jsp" %>
	<section class="container">
		<div>
			<form action="./emps" method="get">
				<div class="input-form form-left">
					<button class="btn btn-outline" type="button" onclick="location.href='./emps/add'">추가</button>
				</div>
				<div class="input-form form-right">
					<input class="input-text" type="text" name="search" data-required="직원 이름를 입력하세요.">
					<button class="btn btn-outline" type="submit">조회</button>
					<select class="select-form" onchange="location.href='./emps?pgc=' + this.value">
						<option value="5" ${pageCount == 5 ? 'selected' : ''}>5 개</option>
						<option value="10" ${pageCount == 10 ? 'selected' : ''}>10 개</option>
						<option value="15" ${pageCount == 15 ? 'selected' : ''}>15 개</option>
						<option value="20" ${pageCount == 20 ? 'selected' : ''}>20 개</option>
					</select>
				</div>
			</form>
		</div>
		<table class="table wide vertical-hidden hover">
			<colgroup>
				<col class="col-120">
				<col class="col-240">
				<col class="col-240">
				<col class="col-240">
				<col class="col-240">
				<col class="col-120">
			</colgroup>
			<thead>
				<tr>
					<th>직원ID</th>
					<th>이름</th>
					<th>이메일</th>
					<th>직급</th>
					<th>부서</th>
					<th class="border-hidden-right"></th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${not empty datas}">
					<c:forEach items="${datas}" var="data">
						<tr>
							<td>${data.empId}</td>
							<td>${data.empName}</td>
							<td>${data.email}</td>
							<td>${data.jobName}</td>
							<td>${data.deptName}</td>
							<td class="border-hidden-right">
								<c:url var="modUrl" value="./emps/mod">
									<c:param name="id" value="${data.empId}" />
								</c:url>
								<button type="button" class="btn btn-icon" onclick="location.href='${modUrl}'">
									<span class="material-symbols-outlined">edit</span>
								</button>
								<c:url var="delUrl" value="./emps/del">
									<c:param name="id" value="${data.empId}" />
								</c:url>
								<button type="button" class="btn btn-icon" onclick="location.href='${delUrl}>'">
									<span class="material-symbols-outlined">delete</span>
								</button>
							</td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
		<c:choose>
			<c:when test="${not empty pageList}">
				<c:url var="pageUrl" value="./emps" />
				<%@ include file="../module/paging.jsp" %>
			</c:when>
			<c:otherwise>
				<div class="input-form wide form-left">
					<button class="btn btn-outline btn-ok" type="button" onclick="location.href='${pageContext.request.ContextPath}/emps'">전체보기</button>
				</div>
			</c:otherwise>
		</c:choose>
	</section>
</body>
</html>