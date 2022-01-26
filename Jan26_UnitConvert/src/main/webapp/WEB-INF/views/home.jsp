<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
Unit Convert!
	<form action="convert.do" method="GET">
		입력 : <input name = "input">
		
		<select name = "unitselect">
			<option value = "1">Cm=>Inch</option>
			<option value = "2">m^2=>평</option>
			<option value = "3">C=>F</option>
			<option value = "4">m/h=>km/h</option>
		</select>
		<p>
		<button><h4>제출</h4></button>
	</form>
</body>
</html>
