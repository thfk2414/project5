package com.javalec.command;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.board.action.*;
import net.board.db.*;

public class MemberListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();
		BoardDAO memberdao = new BoardDAO();
		
		List memberlist = new ArrayList();


		memberlist = memberdao.getMemberList();
		
		if (memberlist == null) {
			System.out.println("회원목록 null");
			return null;
		}
		System.out.println("회원목록있음 뽑아라");
		request.setAttribute("memberlist", memberlist);
		forward.setRedirect(true);
		forward.setPath("./member_list.member");
		return forward;

	}

}
