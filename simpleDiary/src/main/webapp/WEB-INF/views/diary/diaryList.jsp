<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>

	.wrapper{
		background: silver;
		width: 90%;
		height: 700px;
		margin: auto;
	}


	table {
		background: white;
		width: 90%;
		margin: auto;
	}
	
	th {
		border-bottom: darkgray 1px solid;
		font-size: large;
	}
	
	
	td {
		text-align: center;
	}
	
	tr {	
		height: 40px;
	}
	
	.sTitle {
		margin: auto;
		text-align: center;
	}
	
	.logo {
		display: inline-block;
	}
	
	a {
		text-decoration: none;
	}
	
</style>

<title>다이어리 목록</title>
</head>
<body>

	
	<div class="wrapper">
		<div class="menu">
			<div class="logo"><a href="#">로고</a></div>
			<div class="logo">메인</div>
			<div class="logo">다이어리</div>
			<div class="logo">공지사항</div>
			<div class="logo">기타</div>
		</div>
		
		<div class="sTitle"><h2>다이어리 목록</h2></div>
	
		<table>
			<colgroup>
				<col style="width: 10%;" />
				<col style="width: 40%;" />
				<col style="width: 15%;" />
				<col style="width: 15%;" />
				<col style="width: 20%;" />
			</colgroup>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성일</th>
				<th>작성자</th>
				<th>수정일</th>
			</tr>
			 
			 
		<%-- 	
			<c:forEach items="" var="">
			<tr>
				<td>${dNo }</td>
				<td>${title }</td>
				<td>${regrDate }</td>
				<td>${modrDate }</td>
				<td>${regWriter }</td>	
			</tr>
			</c:forEach>
		--%>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>	
			</tr>
		
		</table>
	
	</div>
	
</body>
</html>