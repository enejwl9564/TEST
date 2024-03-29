<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- BS5 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<!-- BSICON -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">

<style>
.container{width : 300px; margin:100px auto; text-align:center; position:relative;}
.container *{margin-bottom:10px;}
.container .msg{ position:absolute;left:0px;right:0px;top:-25px; margin:auto; font-size:0.5rem; color:gray; padding-left:15px;}
</style>


</head>
<body>
<section class="container">
	<div class="msg">
		<c:out value="${error}"></c:out><br>
		<c:out value="${logout}"></c:out><br>
	</div>
	<h1>LOGIN</h1>
	<form name="loginfrm" action=<c:url value="/login" />  method="post">
		<input type="text" name="username" placeholder="example@example.com" class="form-control" />
		<input type="password" name="password"  placeholder="Insert Password" class="form-control" />
		<div>
			<input type="checkbox" name="remember-me" class="form-check-input" id="chk">
			<label class="form-check-label" for="chk">자동로그인</label>
		</div>
		<button class="btn btn-primary w-100">로그인</button>
		
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
	</form>
</section>




</body>
</html>