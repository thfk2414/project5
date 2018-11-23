
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="com.javalec.db.*"%>
<%@page import="com.javalec.command.*"%>
<%
	MemberBean member = (MemberBean) request.getAttribute("member");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_info.jsp</title>
</head>
<body>
	<div align="center">
		<table border=1 width=300>
			<tr align=center>
				<td>아이디 :</td>
				<td><%=member.getMEMBER_ID()%></td>
			</tr>
			<tr align=center>
				<td>비밀번호 :</td>
				<td><%=member.getMEMBER_PW()%></td>
			</tr>
			<tr align=center>
				<td>이름 :</td>
				<td><%=member.getMEMBER_NAME()%></td>
			</tr>
			<tr align=center>
				<td colspan=2><a href="member_list.bo">리스트로 돌아가기</a></td>
			</tr>
		</table>
	</div>
</body>
</html>