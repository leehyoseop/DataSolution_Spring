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
	<form action="student.reg" method="GET">
		본명 : <input name="s_name">
		<p>
		별명 : <input name="s_nickname">
		<p>
			<button>등록</button>
	</form>
	${r }
	<p>
	<form action="student.sel">
		<c:forEach var="r" items="${result }">
			<tr>
				<td colspan="3" align="center" height="50">${r.s_no }&nbsp;&nbsp;${r.s_name }&nbsp;&nbsp;${r.s_nickname }
					<hr>
				</td>
			</tr>
		</c:forEach>
		<button>학생리스트 출력</button>
	</form>

	<hr>
	
	<form action="test.reg" method="GET">
		과목명 : <input name="subject">
		<select name="year">
			<option value="">년</option>
			<c:forEach var="i" begin="2020" end="2050">
				<option value="${i}">${i}</option>
			</c:forEach>
		</select> 
		<select name="month">
			<option value="">월</option>
			<c:forEach var="i" begin="1" end="12">
				<c:choose>
					<c:when test="${i lt 10 }">
						<option value="0${i}">${i}</option>
					</c:when>
					<c:otherwise>
						<option value="${i}">${i}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select> 
		<select name="day">
			<option value="">일</option>
			<c:forEach var="i" begin="1" end="31">
				<c:choose>
					<c:when test="${i lt 10 }">
						<option value="0${i}">${i}</option>
					</c:when>
					<c:otherwise>
						<option value="${i}">${i}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select>
		<button>등록</button>
	</form>
	${t }
	
	<p>
	<form action="test.sel">
		<c:forEach var="tr" items="${Testresult }">
			<tr>
				<td colspan="3" align="center" height="50">
				${tr.subject }&nbsp;&nbsp;${tr.year }년&nbsp;&nbsp;${tr.month }월&nbsp;&nbsp;${tr.day }일
					<hr>
				</td>
			</tr>
		</c:forEach>
		<button>시험리스트 출력</button>
	</form>
</body>
</html>