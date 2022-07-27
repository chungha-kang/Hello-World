<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>게시판 등록</title>
	<link rel="stylesheet" type="text/css" href="/static/bs5/css/bootstrap.min.css">
	<script type="text/javascript" src="/static/bs5/js/bootstrap.min.js"></script>
</head>
<body>
	<header></header>
	<section class="container">
		<div class="mt-3">
			<form action="" method="post">
				<div class="mb-3">
					<input class="form-control" id="id_title" name="title" placeholder="제목을 입력하세요.">
				</div>
				<div class="mb-3">
					<textarea class="form-control" id="id_content" name="content" 
						rows="5" placeholder="내용을 입력하세요."></textarea>
				</div>
				<div class="text-end">
					<button class="btn btn-primary" type="button" data-bs-toggle="modal" data-bs-target="#errorModal">저장</button>
				</div>
			</form>
		</div>
		<div class="modal fade" id="errorModal" tabindex="-1" aria-labelledby="errorModalLabel">
			<div class="modal-dialog">
				<div class="modal-header">
					<h5 class="modal-title" id="errorModalLabel">Modal title</h5>
					<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
				<div class="modal-body">
					제목은 공란이 올 수 없습니다. 반드시 제목을 입력하세요.
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-danger" data-bs-dismiss="modal">확인</button>
				</div>
			</div>
		</div>
	</section>
	<footer></footer> 
</body>
</html>