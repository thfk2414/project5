package com.javalec.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.board.action.*;
import net.board.db.BoardDAO;

public class MemberDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ActionForward forward = new ActionForward();

		HttpSession session = request.getSession();
		BoardDAO memberdao = new BoardDAO();

		boolean result = false;

		String Member_ID = (String) session.getAttribute("Member_ID");

		String delete = request.getParameter("Member_ID");
		result = memberdao.memberDelete(delete);

		if (result == false) {
			System.out.println("�쉶�썝 �궘�젣 �떎�뙣");
			return null;
		}
		forward.setRedirect(true);
		System.out.println("666666666666655555555333333333333333333322222");
		forward.setPath("./member_list.bo");
		return forward;
		
	}
}
