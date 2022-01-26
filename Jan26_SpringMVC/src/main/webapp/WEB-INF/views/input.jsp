<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel = "stylesheet" href = "resources/CSS/input.css">
<script type="text/javascript" src = "resources/JS/input.js"></script>
</head>
<body>
	<form action="calculate.do" method="POST">
		이름 : <input name = "n"><p>
		x : <input name = "x"><p>
		y : <input name = "y"><p>
		<button style="cursor: pointer;">제출</button>
	</form>
	<c:if test = "${r != null }">계산결과 : ${r }</c:if>
</body>
</html> 