<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
		//alert("WA!");
		//AJAX(비동기식으로) JavaScript를 이용해서 XML을 파싱하겠다
		$("#btn").click(function() {
			//비동기식으로 AJAX 다운받아오기
		});
		/*
		$.ajax({
			url : "fruit.get", //url속성에 value값 넣기
			success : function(a) {//요청 성공하면 function 동작

				//DOM 객체 하나 불러질때 마다 나오는 콜백 함수
				$(a).find("fruit").each(function(i, f) {
					//alert(f(0).f_name);
					//alert(f);
					let f_name = $(f).find("f_name").text();
					let f_price = $(f).find("f_price").text();
					let td1 = $("<td></td>").text(f_name);
					let td2 = $("<td></td>").text(f_price);
					let tr = $("<tr></tr>").append(td1, td2);
					$("table").append(tr);
					//alert(f_name + "] " + f_price);
				});
			}
		});
		*/
		$("button").click(function() {
			let iVal = $("input").val();
			$.ajax({
				url : "searchfruit.get?f_price="+iVal, //url속성에 value값 넣기
				success : function(a) {//요청 성공하면 function 동작
	
					//DOM 객체 하나 불러질때 마다 나오는 콜백 함수
					$(a).find("fruit").each(function(i, f) {
						//alert(f(0).f_name);
						//alert(f);
						let f_name = $(f).find("f_name").text();
						let f_price = $(f).find("f_price").text();
						let td1 = $("<td></td>").text(f_name);
						let td2 = $("<td></td>").text(f_price);
						let tr = $("<tr></tr>").append(td1, td2);
						$("table").append(tr);
						//alert(f_name + "] " + f_price);
					});
				}
			});
		});
	});
</script>
</head>
<body>
	<input>
	<button>Fruit</button>
	<table id=fruitTbl border="1">
		<hr>

	</table>
	<button id="btn">버튼</button>
</body>
</html>