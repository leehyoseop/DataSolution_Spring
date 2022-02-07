<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "resources/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
		/*$.ajax({
			url:"error.get", // 1.url자리에 요청 주소
			success: function(errorss) { // 2.다운 받아오는데 성공하면 콜백함수를 발동
				//alert(errorss);
				//3.javaScript 객체 -> 문자열 그대로 변환이 가능
				alert(JSON.stringify(errorss));
			}
		});*/
		
		//JSON으로 AJAX하기 간단한 ver.
		//$.getJSON("요청주소?파라미터=값&...", 값 받아오는데 성공하면 발동하는 콜백함수)
		/*$.getJSON("error.get, function(errorss) {
			//alert(JSON.stringify(errorss));
			$.each(errorss.error, function(i,e) {
				alert(e.e_where);
				let td1 = $("<td></td>").text(e.e_what);
				let td2 = $("<td></td>").text(e.e_where);
				let tr = $("<tr></tr>").append(td1,td2);
				$("table").append(tr);
			})
		})
		*/
		
		$("button").click(function() {
			let iVal = $("input").val();
			//alert(iVal);
			$.getJSON("someerror.get?e_what="+iVal, function(errors) {
				//alert(JSON.stringify(errors));
				$("table").empty();
				$.each(errors.error, function(i,e) {
					let td1 = $("<td></td>").text(e.e_what);
					let td2 = $("<td></td>").text(e.e_where);
					let tr = $("<tr></tr>").append(td1,td2);
					$("table").append(tr);
				});
			 });
		});
		
		$("input").keyup(function() {
			$("button").trigger("click");
		});
	});
</script>
</head>
<body>
	<input><button>button</button>
	<table border = "1">
	
	</table>
</body>
</html>