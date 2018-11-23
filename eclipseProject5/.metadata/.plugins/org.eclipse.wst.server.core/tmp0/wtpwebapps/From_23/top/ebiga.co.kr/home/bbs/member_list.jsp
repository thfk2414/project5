<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="javax.sql.*"%>
<%@page import="javax.naming.*"%>
<%@page import="java.sql.*"%>
<%@page import="com.javalec.db.*"%>
<%@page import="com.javalec.command.*"%>
<%
	List memberlist = (List) request.getAttribute("memberlist");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member_list.jsp</title>
</head>
<body>
	<div align=center>

		<table border=1 width=300>
			<tr align=center>
				<td colspan=2>회원 목록</td>
			</tr>
			<%
				for (int i = 0; i < memberlist.size(); i++) {
					MemberBean member = (MemberBean) memberlist.get(i);
			%>
			<tr align=center>
				<td><a
					href="member_info.member?Member_ID=<%=member.getMEMBER_ID()%>">
						<%=member.getMEMBER_ID()%>
				</a></td>
				<td><a
					href="member_delete.member?Member_ID=<%=member.getMEMBER_ID()%>">삭제</a></td>
			</tr>
			<%
				}
			%>

			<tr align=center>
				<td colspan=2><a href="adminBoard.member">[게시판 이동]</a></td>
			</tr>
		</table>
	</div>
</body>
</html>