<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>직원 추가</title>
	<%@ include file="../module/head.jsp" %>
</head>
<!--  script type="text/javascript">
	window.onload = function() {
		var form = document.forms[0];
		form.email.addEventListener("input", enableSaveButton);
		form.phone.addEventListener("input", enableSaveButton);
		
		prevImage.addEventListener("click", function(e) {
			btnImage.click();
		});
		
		btnImage.addEventListener("change", showPreview);
	}
	// ajaxUploadImage 가 아니라 showPreview 사용하는 이유
	// 직원 사진 프로필 업로드
	//		1. 로그인을 한 직원이 개정 정보 화면에서 업로드
	//		2. 업로드한 이미지는 /static/img/emp/직원ID.png 경로에 저장됨
	//		3. 직원ID는 로그인 세션에 저장된 정보를 사용하여 이미지 파일명을 변경하여 저장.
	//
	// 새로운 직원 등록
	//		1. 직원 등록 권한을 가지는 계정으로 직원 정보를 추가 할 때 프로필 이미지를 같이 업로드
	//		2. 업로드한 이미지는 /static/img/emp/직원ID.png 경로에 저장되어야 함.
	//		3. 새로 등록하는 직원의 ID 는 아직 모르는 상태이기 때문에 기존 Ajax 로 업로드를 해봤자
	//		   사용할 직원ID를 알수 없는 상태에 빠짐.
	
	// Ajax 로 할 수 있는 방법이 있기는 함.
	// Client					Server
	//	-------------------------------- > 이미지 저장 처리
	//	Ajax 로 이미지 업로드			  저장한 이미지에 임시 파일명 부여
	//									  임시로 부여한 파일명을 클라이언트에 전달
	//	<--------------------------------
	//			 Response (fileName-temp0001)
	
	// 전달 받은 fileName 속성의 temp0001 값을 저장 후
	// 사용자가 저장 버튼을 누를 때 같이 전송
	
	// ---------------------------------- > 저장 요청 메시지에서 임시로 저장한 이미지
	// 저장요청							   파일명을 발견하면 해당 이미지의 파일명을
	//									   추가 완료된 직원ID 로 변경
	// <----------------------------------
</script -->
<body>
	<%@ include file="../module/navigation.jsp" %>
	<section class="container">
		<c:url var="empsAddUrl" value="/emps/add" />
		<form class="large-form" action="${empsAddUrl}" method="post" enctype="multipart/form-data">
			<div class="img-form left">
				<c:url var="imgUrl" value="${imagePath}" />
				<input type="file" id="btnImage" name="uploadImage"
					onchange="showPreview(this, 'prevImage');" style="display: none;" >
				<img id="prevImage" class="img-360" 
					onclick="btnImage.click();" alt="여기에는 증명 사진이 배치됩니다." src="${imgUrl}">
			</div>
			<div class="input-form inline">
				<div class="input-form">
					<c:url var="ajaxDuplicateUrl" value="/ajax/duplicate" />
					<label class="input-label w-100">ID</label>
					<input class="input-text w-auto" type="text" name="empId" 
						onblur="duplicateCheck(this, '${ajaxDuplicateUrl}')" value="" data-required="ID는 필수입력입니다.">
					<label class="input-Label-error"></label>
				</div>
				<div class="input-form">
					<label class="input-label w-100">이름</label>
					<input class="input-text w-auto" type="text" name="empName" value="">
				</div>
			</div>
			<div class="input-form inline">
				<div class="input-form">
					<label class="input-label w-100">직급</label>
					<select class="select-form w-auto" name="jobId">
						<c:forEach items="${jobDatas}" var="job">
							<option value="${job.jobId}">${job.jobName}</option>
						</c:forEach>
					</select>
				</div>
				<div class="input-form">
					<label class="input-label w-100">부서</label>
					<select class="select-form w-auto" name="deptId">
						<c:forEach items="${deptDatas}" var="dept">
							<option value="${dept.deptId}">${dept.deptId} ${dept.deptName}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="input-form inline">
				<div class="input-form">
					<label class="input-label w-100">이메일</label>
					<input class="input-text w-auto" type="text" name="email" value="">
				</div>
			</div>
			<div class="input-form inline">
				<div class="input-form">
					<fmt:formatDate var="now" value="${dataDetail.hireDate}" pattern="YYYY-MM-dd" />
					<label class="input-label w-100">입사일</label>
					<input class="input-text w-auto" type="text" name="hireDate" value="" >
				</div>
				<div class="input-form">
					<label class="input-label w-100">전화번호</label>
					<input class="input-text w-auto" type="text" name="phone" value="">
				</div>
			</div>
			<div class="input-form inline">
				<div class="input-form">
					<label class="input-label w-100">급여액</label>
					<input class="input-text w-auto" type="number" name="salery" value="" >
				</div>
				<div class="input-form">
					<label class="input-label w-100">커미션</label>
					<input class="input-text w-auto" type="number" name="commission" value="">
				</div>
			</div>
			<div class="input-form form-right">
				<button class="btn btn-outline btn-ok" type="submit">저장</button>
			</div>
		</form>
	</section>
</body>
</html>