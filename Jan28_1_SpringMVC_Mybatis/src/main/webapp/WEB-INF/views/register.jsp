<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "food.reg" method = "POST" enctype="multipart/form-data">
		메뉴명 : <input name = "menu"><p>
		가격 : <input name = "price"><p>
		사진 : <input type = "file" name = "file_name"><p>
		<button>전송</button>
	</form>
	${r }
	
	<form action="food.sel" method = "POST" enctype="multipart/form-data">
		<c:forEach var="r" items="${result }">
			<tr>
				<td colspan="3" align="center" height="50">
				<img alt="" src="resources/img/${r.file_name }" width = "250px">
				${r.menu }&nbsp;&nbsp;${r.price }&nbsp;&nbsp;${r.file_name } 
					<hr>
				</td>
			</tr>
		</c:forEach>
		<button>음식 리스트 출력</button>
	</form>
</body>
</html>