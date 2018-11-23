package net.board.action;

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
			System.out.println("�쉶�썝 紐⑸줉 �씫湲� �떎�뙣");
			return null;
		}
		System.out.println("11111111111111111111111111111111111111");
		request.setAttribute("memberlist", memberlist);
		forward.setRedirect(false);
		forward.setPath("member_list.jsp");
		return forward;

	}

}
