<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<div align="center">
	<body>
		<%
			String id = (String) session.getAttribute("idSession");
			System.out.println(id + " 입장");

			if (id == null) {
				System.out.println("세션값 없음");
		%>
		<a href="loginForm.jsp">NORMAL</a>
		<%
			} else {
				System.out.println("세션값 있음");
		%>


		<%
			if (id.equals("admin")) {
		%>
		<h3>안녕하세요.관리자님</h3>
		<a href="adminBoard.member">게시판관리</a>
		<a href="member_list.member">회원목록</a>
		<%
			} else {
		%>
		안녕하세요.
		<%
			}
			}
		%>



	</body>
</div>
</html>