package com.javalec.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.command.*;

//@WebServlet("/Join")
public class MemberFrontController extends HttpServlet {

   protected void doProcess(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      String RequestURI = request.getRequestURI();
      String contextPath = request.getContextPath();
      String command = RequestURI.substring(contextPath.length());
      ActionForward forward = null;
      Action action = null;
      System.out.println(command);
      if (command.equals("/login.member")) { // ==========================================로그인 액션
         System.out.println("로그인aa");
         action = new MemberLoginAction();

         try {
            forward = action.execute(request, response);
         } catch (Exception e) {
            e.printStackTrace(); // end doProcess
         }
      } 
      else if (command.equals("/register.member")) { // 회원가입 액션
         System.out.println(request.getParameter("mb_id"));
         System.out.println("회원가입");
         action = new MemberJoinAction();
         try {
            forward = action.execute(request, response);
         } catch (Exception e) {
            e.printStackTrace(); // end doProcess
         }

      }else if (command.equals("/index.member")) { // 메인으로 이동
         System.out.println(command);
         System.out.println("index 입니다");
         forward = new ActionForward();
         forward.setRedirect(false);
         forward.setPath("./top/ebiga.co.kr/home/index.jsp");
      }
      else if (command.equals("/register.member")) { //이건 뭐야???????? 몰라 ,,? ㄱㄴ데 쓴다 메인 가게하는건데 
         System.out.println(command);
         System.out.println("index 입니다");
         forward = new ActionForward();
         forward.setRedirect(false);
         forward.setPath("./top/ebiga.co.kr/home/.jsp");
      }
      else if (command.equals("/agreement.member")) { // 메인
         System.out.println(command);
         System.out.println("약관동의 입니다");
         forward = new ActionForward();
         forward.setRedirect(false);
         forward.setPath("./top/ebiga.co.kr/home/bbs/register.jsp");
      }
      else if (command.equals("/join_form.member")) { // 회원가입 폼으로 이동
         System.out.println(command);
         System.out.println("ljjjjjjjjll 입니다");
         forward = new ActionForward();
         forward.setRedirect(false);
         forward.setPath("./top/ebiga.co.kr/home/bbs/register_form.jsp");
      }
      else if (command.equals("/login_form.member")) { // 로그인 폼으로 이동
         System.out.println(command);
         System.out.println("login_form 입니다");
         forward = new ActionForward();
         forward.setRedirect(false);
         forward.setPath("./top/ebiga.co.kr/home/bbs/login.jsp");
      }
      else if (command.equals("/member_delete.member")) { //삭제
          System.out.println(command);
          System.out.println("member_delete 입니다");
          forward = new ActionForward();
          forward.setRedirect(false);
          forward.setPath("./top/ebiga.co.kr/home/bbs/member_list.jsp");
       }
      else if (command.equals("/member_list.member")) { //회원목록
          System.out.println(command);
          System.out.println("login_form 입니다");
          forward = new ActionForward();
          forward.setRedirect(false);
          forward.setPath("./top/ebiga.co.kr/home/bbs/member_list.jsp");
       }
      else if (command.equals("/member_info.member")) { //회원정보
          System.out.println(command);
          System.out.println("login_form 입니다");
          forward = new ActionForward();
          forward.setRedirect(false);
          forward.setPath("./top/ebiga.co.kr/home/bbs/member_info.jsp");
       }
      else if (command.equals("/adminBoard.member")) { // admin 로그인 후 게시판관리 클릭시 페이지
          System.out.println(command);
          System.out.println("adminBoard 입니다");
          forward = new ActionForward();
          forward.setRedirect(false);
          forward.setPath("./top/ebiga.co.kr/home/bbs/adminBoard.jsp");
       }
      else if (command.equals("/adminMain.member")) { //admin 로그인 시 관리자모드
          System.out.println(command);
          System.out.println("adminMain으로 가고 싶지 않니?");
          System.out.println("adminMain 입니다");
          forward = new ActionForward();
          forward.setRedirect(false);
          forward.setPath("./top/ebiga.co.kr/home/bbs/adminMain.jsp");
       }
      
      else if (command.equals("/logout.member")) { // 로그아웃 액션
         action = new MemberLogoutAction();

         try {
            forward = action.execute(request, response);
         } catch (Exception e) {
            e.printStackTrace(); // end doProcess
         }
      } //여기까지 로그아웃
      if (forward.isRedirect()) {
         response.sendRedirect(forward.getPath());
      } else {
         RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
         dispatcher.forward(request, response);
      }
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      doProcess(request, response);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      doProcess(request, response);
   }
}