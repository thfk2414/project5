/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-11-23 03:31:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.top.ebiga_co_kr.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!-- <script>alert(\"ebiga.co.kr\");</script> -->\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width,initial-scale=1.0,minimum-scale=0,maximum-scale=10,user-scalable=yes\">\r\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=10,chrome=1\">\r\n");
      out.write("<title>이비가짬뽕</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://ebiga.co.kr/home/css/default.css?ver=161020\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://ebiga.co.kr/home/skin/latest/webzine/style3.css?ver=161020\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://ebiga.co.kr/home/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://fontawesome.io/assets/font-awesome/css/font-awesome.css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"//maxcdn.bootstrapcdn.com/font-awesome/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!--[if lte IE 8]>\r\n");
      out.write("<script src=\"https://ebiga.co.kr/home/js/html5.js\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("<script>\r\n");
      out.write("\t// 자바스크립트에서 사용하는 전역변수 선언\r\n");
      out.write("\tvar g5_url = \"https://ebiga.co.kr/home\";\r\n");
      out.write("\tvar g5_bbs_url = \"https://ebiga.co.kr/home/bbs\";\r\n");
      out.write("\tvar g5_is_member = \"\";\r\n");
      out.write("\tvar g5_is_admin = \"\";\r\n");
      out.write("\tvar g5_is_mobile = \"\";\r\n");
      out.write("\tvar g5_bo_table = \"\";\r\n");
      out.write("\tvar g5_sca = \"\";\r\n");
      out.write("\tvar g5_editor = \"\";\r\n");
      out.write("\tvar g5_cookie_domain = \"\";\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"https://ebiga.co.kr/home/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script src=\"https://ebiga.co.kr/home/js/jquery.menu.js?ver=161020\"></script>\r\n");
      out.write("<script src=\"https://ebiga.co.kr/home/js/common.js?ver=161020\"></script>\r\n");
      out.write("<script src=\"https://ebiga.co.kr/home/js/wrest.js?ver=161020\"></script>\r\n");
      out.write("<script src=\"https://ebiga.co.kr/home/js/script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 회원탈퇴 스크립트 시작 { -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction member_leave() { // 회원 탈퇴 tto\r\n");
      out.write("\t\t\tif (confirm('회원에서 탈퇴 하시겠습니까?'))\r\n");
      out.write("\t\t\t\tlocation.href = 'bbs/member_confirm_leave.jsp';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- }회원탈퇴 스크립트 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- 상단 시작 { -->\r\n");
      out.write("\t<div id=\"header\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div id=\"top_bar\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t");

						if (session.getAttribute("idSession") != null) {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"logout.member\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"bbs/register_form.jsp\">내정보보기</a></li>\r\n");
      out.write("\t\t\t\t\t");

						} else {
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"login_form.member\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"agreement.member\">회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=video\">이비가Family</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h1 id=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"index.jsp\"><img src=\"image/logo.jpg\" alt=\"이비가짬뽕\"></a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<div id=\"m_family\">\r\n");
      out.write("\t\t\t\t<a href=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=video\"><i\r\n");
      out.write("\t\t\t\t\tclass=\"fa fa-user\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"nav_btn\">\r\n");
      out.write("\t\t\t\t<i class=\"fa fa-bars\" aria-hidden=\"true\"></i>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t\t<li><a href=\"sub01.jsp\">이비가소개</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub01.jsp\">인사말</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub01_02.jsp\">연혁</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub01_03.jsp\">기업소개</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/ebigaIn.jsp\">이비가人</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"sub06.jsp\">브랜드스토리</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub06.jsp\">이비가의비밀</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub06_02.jsp\">짬뽕스토리</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub06_03.jsp\">재료스토리</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub06_04.jsp\">BI</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"sub02.jsp\">메뉴안내</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub02.jsp\">메뉴안내</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"bbs/search.jsp\">매장안내</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/search.jsp\">매장안내</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/best.jsp\">우수가맹점</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"sub04.jsp\">창업안내</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub04.jsp\">브랜드경쟁력</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub04_02.jsp\">창업비용</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"sub04_03.jsp\">창업절차</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/story.jsp\">성공스토리</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/gallery.jsp\">매장갤러리</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/faq.jsp\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"bbs/notice.jsp\">이비가소식</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"sub_menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/notice.jsp\">오픈점 소식</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/notice02.jsp\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/event.jsp\">이벤트</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/tv.jsp\">TV</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/media.jsp\">언론</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"bbs/community.jsp\">고객의소리</a></li>\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"nav_bg\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- } 상단 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- 팝업레이어 시작 { -->\r\n");
      out.write("\t<div id=\"hd_pop\">\r\n");
      out.write("\t\t<h2>팝업레이어 알림</h2>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(function() {\r\n");
      out.write("\t\t\t$(\".hd_pops_reject\").click(function() {\r\n");
      out.write("\t\t\t\tvar id = $(this).attr('class').split(' ');\r\n");
      out.write("\t\t\t\tvar ck_name = id[1];\r\n");
      out.write("\t\t\t\tvar exp_time = parseInt(id[2]);\r\n");
      out.write("\t\t\t\t$(\"#\" + id[1]).css(\"display\", \"none\");\r\n");
      out.write("\t\t\t\tset_cookie(ck_name, 1, exp_time, g5_cookie_domain);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('.hd_pops_close').click(function() {\r\n");
      out.write("\t\t\t\tvar idb = $(this).attr('class').split(' ');\r\n");
      out.write("\t\t\t\t$('#' + idb[1]).css('display', 'none');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(\"#hd\").css(\"z-index\", 1000);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- } 팝업레이어 끝 -->\r\n");
      out.write("\t<!-- index 시작 { -->\r\n");
      out.write("\t<div id=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"m_slider\">\r\n");
      out.write("\t\t\t<ul class=\"content  pc\">\r\n");
      out.write("\t\t\t\t<li><img src=\"image/m_slider01.jpg\" alt=\"슬라이드1\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/m_slider02.jpg\" alt=\"슬라이드2\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/m_slider04.jpg\" alt=\"슬라이드4\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/m_slider03.jpg\" alt=\"슬라이드3\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/m_slider05.jpg\" alt=\"슬라이드5\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/m_slider01.jpg\" alt=\"슬라이드1\"></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"content  mobile\">\r\n");
      out.write("\t\t\t\t<li><img src=\"image/mobile_slider01.jpg\" alt=\"슬라이드1\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/mobile_slider02.jpg\" alt=\"슬라이드2\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/mobile_slider04.jpg\" alt=\"슬라이드4\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/mobile_slider03.jpg\" alt=\"슬라이드3\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/mobile_slider05.jpg\" alt=\"슬라이드5\"></li>\r\n");
      out.write("\t\t\t\t<li><img src=\"image/mobile_slider01.jpg\" alt=\"슬라이드1\"></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t<li class=\"btn01  btn06 on\" data-n=\"1\">●\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t<li class=\"btn02\" data-n=\"2\">●\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t<li class=\"btn03\" data-n=\"3\">●\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t<li class=\"btn04\" data-n=\"4\">●\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t<li class=\"btn05\" data-n=\"5\">●\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- } #m_slider 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"m_banner\">\r\n");
      out.write("\t\t<div class=\"video\">\r\n");
      out.write("\t\t\t<iframe width=\"100%\" height=\"300\"\r\n");
      out.write("\t\t\t\tsrc=\"https://www.youtube.com/embed/Oiv1hp82qEo?amp;autoplay=0\"\r\n");
      out.write("\t\t\t\tframeborder=\"0\" allowfullscreen></iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"m_form\">\r\n");
      out.write("\t\t\t<style>\r\n");
      out.write("table {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tborder-collapse: collapse;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_box .btn_submit {\r\n");
      out.write("\tbackground: #b4b4b4;\r\n");
      out.write("\tpadding: 5px 10px;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\twidth: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_box .title {\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tcolor: #373737;\r\n");
      out.write("\tletter-spacing: -1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_box .title b {\r\n");
      out.write("\tcolor: #e50110;\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("\tfont-weight: 800;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_box .title b a {\r\n");
      out.write("\tcolor: #e50110;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .info {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #888\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .row:after {\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tclear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .row label {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 30%;\r\n");
      out.write("\tpadding: 2px 0;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .row p {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\twidth: 70%;\r\n");
      out.write("\tpadding: 2px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .row p input, form .row p textarea {\r\n");
      out.write("\tborder: 1px solid #c9c9c9;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tpadding: 2px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .send {\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .agree {\r\n");
      out.write("\ttext-align: right;\r\n");
      out.write("\tpadding: 5px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .agree .btn {\r\n");
      out.write("\tpadding: 5px 10px;\r\n");
      out.write("\tbackground: #333;\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tmargin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .agree .agree_content {\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\ttop: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tbackground: rgba(0, 0, 0, 0.85);\r\n");
      out.write("\tz-index: 99;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form .agree .agree_content p {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tmax-width: 400px;\r\n");
      out.write("\tmax-height: 300px;\r\n");
      out.write("\tmargin-left: -180px;\r\n");
      out.write("\tmargin-top: -150px;\r\n");
      out.write("\toverflow-y: scroll;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tpadding: 20px;\r\n");
      out.write("\tborder: 1px solid #ddd;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("\tfont-size: 13px;\r\n");
      out.write("\tline-height: 22px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t$(function() {\r\n");
      out.write("\t\t\t\t\t$('form .agree .btn').click(function() {\r\n");
      out.write("\t\t\t\t\t\t$('form .agree .agree_content').show();\r\n");
      out.write("\t\t\t\t\t\t$('form .agree .agree_content').click(function() {\r\n");
      out.write("\t\t\t\t\t\t\t$('form .agree .agree_content').hide();\r\n");
      out.write("\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form_box\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title\">\r\n");
      out.write("\t\t\t\t\t<span>창업문의</span> <img src=\"image/m_phone_icon.png\" alt=\"전화번호\">\r\n");
      out.write("\t\t\t\t\t<b><a href=\"tel:1588-3964\">1588-3964</a></b>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t<form name=\"contactform\" method=\"post\" action=\"formmail_send.jsp\">\r\n");
      out.write("\t\t\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"first_name\">이름</label>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"first_name\" type=\"text\" class=\"ipt\" maxlength=\"50\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"telephone\">연락처</label>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"telephone\" type=\"text\" class=\"ipt\" maxlength=\"30\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\">희망개설지역</label>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input name=\"email\" type=\"text\" class=\"ipt\" maxlength=\"80\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\trequired>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"left\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"comments\">기타문의내용</label>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea name=\"comments\" rows=\"4\" required></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row agree\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"chk_info\" value=\"CSS\" checked=\"checked\">개인정보\r\n");
      out.write("\t\t\t\t\t\t\t수집 및 이용에 동의 (필수) <span class=\"btn\">약관보기</span>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"agree_content\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"text\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b>[개인정보 수집 목적]</b><br> ㈜이비가푸드(이하 “회사”라 합니다.)는 다음과 같은 이유로\r\n");
      out.write("\t\t\t\t\t\t\t\t\t필요한 최소한의 개인정보를 수집·이용합니다.<br> -창업문의, 전화상담, 대면상담, 자료 제공.\r\n");
      out.write("\t\t\t\t\t\t\t\t\t㈜이비가푸드는 창업문의시 아래와 같은 개인정보를 수집하고 있습니다.<br> 개인정보 항목 :\r\n");
      out.write("\t\t\t\t\t\t\t\t\t창업희망지역, 휴대전화번호, 이름, 신청 경로, 투자 예상 금액<br> 수집방법 : 홈페이지,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t전화/팩스, 상담카드 작성, 제휴사로부터 제공<br> 보유목적 : 소비자에게 창업 상담 및 가맹점 개설\r\n");
      out.write("\t\t\t\t\t\t\t\t\t관련 정보제공 등<br> 보유근거 : 정보주체의 동의<br> 보유기간 : 정보를 제공받은\r\n");
      out.write("\t\t\t\t\t\t\t\t\t날로부터 3년<br> -단 귀하가 별도로 개인정보의 정정, 처리정지 또는 삭제를 요구할 경우, 회사는\r\n");
      out.write("\t\t\t\t\t\t\t\t\t내부절차에 다라 귀하의 요구를 즉시 수용할 것입니다.<br> -작성일로부터 3년 [개인정보 수집 동의\r\n");
      out.write("\t\t\t\t\t\t\t\t\t거부의 권리] 귀하께서는 본 개인정보 수집 동의를 거부하실 권리가 있습니다. 다만 개인정보의 수집 동의를 거부하실\r\n");
      out.write("\t\t\t\t\t\t\t\t\t경우 창업상담, 사업설명회 자료 및 참가신청 서비스의 이용이 제한됩니다.<br> <br> <b>[홍보\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t및 정보제공 용도로의 이용]</b><br> 위의 개인정보를 회사의 창업 관련 자료 및 정보의 전달 등에\r\n");
      out.write("\t\t\t\t\t\t\t\t\t사용하는 것에 대하여 동의합니다.\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row  send\">\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"info\">※ 해당문의는 ebigafood@naver.com 으로 전송됩니다.</span> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"submit\" value=\"보내기\" class=\"btn_submit\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- } #m_banner 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"m_latest_bg\">\r\n");
      out.write("\t\t<div id=\"m_latest\">\r\n");
      out.write("\t\t\t<div class=\"notice\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title\">\r\n");
      out.write("\t\t\t\t\t오픈점 소식 <a href=\"bbs/open.jsp\" class=\"more_btn\">+</a>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t<!-- 오픈점 소식 최신글 시작 { -->\r\n");
      out.write("\t\t\t\t<div class=\"section_list\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice&amp;wr_id=140\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"roll sports\"></span><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://ebiga.co.kr/home/data/file/notice/thumb-1893614546_gtYhqSRN_e2de34e7a2d1b21ad353634020e50f769a7c11c4_170x100.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"하남본점\" width=\"170\" height=\"100\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"tit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice&amp;wr_id=140\">하남본점</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice&amp;wr_id=140\">▶\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t하남본점 11월 5일 오픈 !! ◀ 경기도 하남시 미사강변한강로 230. 2층 이비가짬뽕 하남본점이\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t오픈하였습니다. 근처에 미사리까페촌과 미사리 경정공원 등 가족 및 연인들의 나들이 하기 좋은 곳입니다. 위치는\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t하남 …</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- } 오픈점 소식 최신글 끝 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"media\">\r\n");
      out.write("\t\t\t\t<h2 class=\"title\">\r\n");
      out.write("\t\t\t\t\t언론보도 <a\r\n");
      out.write("\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=media\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"more_btn\">+</a>\r\n");
      out.write("\t\t\t\t</h2>\r\n");
      out.write("\t\t\t\t<!-- 언론 최신글 시작 { -->\r\n");
      out.write("\t\t\t\t<div class=\"section_list\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=media&amp;wr_id=73\"><span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"roll sports\"></span><img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://ebiga.co.kr/home/data/file/media/thumb-1893614546_MLVqSpmv_0b5dbacfc62c5e243345e0a362445d0dd3caf6c2_170x100.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"짬뽕맛집 이비가짬뽕 '겨울나기 김장대봉사' 참여\" width=\"170\" height=\"100\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"inner\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"tit\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=media&amp;wr_id=73\">짬뽕맛집\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t이비가짬뽕 '겨울나기 김장대봉사' 참여</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"desc\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=media&amp;wr_id=73\">대전시에서\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t주최한 '겨울나기 김장대봉사'에 짬뽕 전문 브랜드인 이비가짬뽕을 운영하고 있는 ㈜이비가푸드 임직원들과 이비가짬뽕\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t가맹점 대표들이 함께 참여했다.㈜이비가푸드는 상생경영의 일환으로 지역사회와 함께하는 다양한 봉사활동에 참여하고…</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- } 언론 최신글 끝 -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- } #m_latest 끝 -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- } #m_latest_bg 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"m_award\">\r\n");
      out.write("\t\t﻿\r\n");
      out.write("\t\t<link rel=\"stylesheet\"\r\n");
      out.write("\t\t\thref=\"https://ebiga.co.kr/home/skin/latest/gallery/style.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"n_gallery_wrap\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"n_thumb\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<!-- <a href=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=award&amp;wr_id=12\"> -->\r\n");
      out.write("\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"datafile/award/thumb-1025970348_2gDfoew9_f29a1d534a453b7998ede749919e9281b0eea6eb_115x115.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"115\" height=\"115\" alt=\"프랜차이즈수준평가\" title=\"\" /> <!-- </a> -->\r\n");
      out.write("\t\t\t\t\t<!-- <p><a href=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=award&amp;wr_id=12\">프랜차이즈수준평가</a></p> -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<!-- <a href=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=award&amp;wr_id=11\"> -->\r\n");
      out.write("\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"datafile/award/thumb-1025970348_zenqMsWj_51025f531b86dc589d57e14a080fb753681d7e23_115x115.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"115\" height=\"115\" alt=\"우수프랜차이즈\" title=\"\" /> <!-- </a> --> <!-- <p><a href=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=award&amp;wr_id=11\">우수프랜차이즈</a></p> -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<!-- <a href=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=award&amp;wr_id=10\"> -->\r\n");
      out.write("\t\t\t\t\t<img\r\n");
      out.write("\t\t\t\t\tsrc=\"datafile/award/thumb-1025970348_Ux8BI9Oo_aec3d2e711a4c1dd88f7553a00bf6fafc0ffc97c_115x115.png\"\r\n");
      out.write("\t\t\t\t\twidth=\"115\" height=\"115\" alt=\"한국프랜차이즈대상2017\" title=\"\" /> <!-- </a> -->\r\n");
      out.write("\t\t\t\t\t<!-- <p><a href=\"https://ebiga.co.kr/home/bbs/board.jsp?bo_table=award&amp;wr_id=10\">한국프랜차이즈대상2017</a></p> -->\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- } index 끝 -->\r\n");
      out.write("\r\n");
      out.write("\t<!-- 회원탈퇴 스크립트 시작 { -->\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction member_leave() { // 회원 탈퇴 tto\r\n");
      out.write("\t\t\tif (confirm('회원에서 탈퇴 하시겠습니까?'))\r\n");
      out.write("\t\t\t\tlocation.href = 'bbs/member_confirm_leave.jsp';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- }회원탈퇴 스크립트 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- 하단 시작 { -->\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t<div id=\"bottom\">\r\n");
      out.write("\t\t\t<ul class=\"sns\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\"><img src=\"image/f_home.png\" alt=\"홈\"></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"https://ko-kr.facebook.com/ebigafood\"\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"><img src=\"image/f_facebook.png\" alt=\"페이스북\"></a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"https://www.youtube.com/watch?v=rTqbX2j9ebQ&t=8s\"\r\n");
      out.write("\t\t\t\t\ttarget=\"_blank\"><img src=\"image/f_youtube.png\" alt=\"유투브\"></a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<ul class=\"link\">\r\n");
      out.write("\t\t\t\t<li><a href=\"bbs/privacy.jsp\">개인정보처리방침</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">이용약관</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">이메일무단수집거부</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"bbs/search.jsp\">오시는길</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"bbs/faq.jsp\">창업문의</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p class=\"address\">\r\n");
      out.write("\t\t\t\t(주)이비가푸드 대전광역시 서구 계룡로 199 이비가빌딩 5층<br> 대표. 권순창 l 사업자등록번호.\r\n");
      out.write("\t\t\t\t314-86-23662 l 고객센터. <a href=\"tel:042-716-0088\">042.716.0088</a><br>\r\n");
      out.write("\t\t\t\t<br> Copyright(C) 2017 EBIGA ALL RIGHTS RESERVED.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<a href=\"#header\" class=\"scroll_top\"><i\r\n");
      out.write("\t\t\t\tclass=\"fa fa-arrow-circle-up\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- } 하단 끝 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- ie6,7에서 사이드뷰가 게시판 목록에서 아래 사이드뷰에 가려지는 현상 수정 -->\r\n");
      out.write("\t<!--[if lte IE 7]>\r\n");
      out.write("<script>\r\n");
      out.write("$(function() {\r\n");
      out.write("    var $sv_use = $(\".sv_use\");\r\n");
      out.write("    var count = $sv_use.length;\r\n");
      out.write("\r\n");
      out.write("    $sv_use.each(function() {\r\n");
      out.write("        $(this).css(\"z-index\", count);\r\n");
      out.write("        $(this).css(\"position\", \"relative\");\r\n");
      out.write("        count = count - 1;\r\n");
      out.write("    });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
