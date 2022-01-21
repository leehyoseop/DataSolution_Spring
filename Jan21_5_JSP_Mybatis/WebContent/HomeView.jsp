<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
 <style>
      .whole {
        background-color: pink;
      }
     
</style>
<body>
	<table class = "whole" border = "1" width = "700" >
		<tr>
			<td colspan="3" align = "center"><h1>제목 ⎝㋡⎠</h1></td>
		</tr>
		<tr>
			<td colspan="3" align = "center" height = "400">내용이 출력될 페이지</td>
		</tr>
		<tr>
			<td colspan="3">
				<button><h4>수정</h4></button>
				<button><h4>삭제</h4></button>
			</td>
		</tr>
		<form action = "HomeController" method = "GET">
			<tr>
				<td>
					내용 <input name = "n" placeholder="Content">
				</td>
				<td>
					날짜 <input name = "d" placeholder="YYYYMMDD">
				</td>
				<td align = "center">
					&nbsp;<button><h1>검색</h1></button>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>