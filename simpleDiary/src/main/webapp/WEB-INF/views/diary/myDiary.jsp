<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<style type="text/css">
	
		a {
			text-decoration: none;
			color: gray;
		}
		
		.wrapper {
			background-color: silver;
		}
		
		.wrapper p {
			font-size: 1em;
			width: 10%;
			margin: auto;
			align-items: center;
			
		}
		
		.title {
			width: 70%;
			margin: auto;
		}
		
		.content {
			width: 70%;
			margin: 10px auto;
		}
		
		div p {
			margin-bottom: 0px;
		}
		
		
		#title {
			width: 95%;
			margin-top: 5px;
		}
		
		#content {
			width: 95%;
			height: 500px;
			margin-top: 5px;
		}
		
		.buttonsWrap {
			width: 10%;
			margin: auto;
		}
		
	</style>

	<title>개인 다이어리</title>
</head>
<body>
	
	
	<div class="wrapper">
		<p><a href="diary">오늘의 일</a></p>
		<div class="title">
			<p>제목</p> 
			<input type="text" id="title" maxlength="30"/>
		</div>
		<div class="content">
			<p>내용</p> 
			<textarea id="content"></textarea>
		</div>
		<div class="buttonsWrap">
			<button onclick="save();">저장</button>
			<button>취소</button>
		</div>
	</div>
</body>
<script>
	
	$(document).ready(function(){
		
	});


	function save(){
		
		
	}
</script>
</html>