<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,minimum-scale=0,maximum-scale=10,user-scalable=yes">
<meta http-equiv="imagetoolbar" content="no">
<meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
<title>공지사항 1 페이지 | 이비가짬뽕</title>
<link rel="stylesheet"
	href="https://ebiga.co.kr/home/css/default.css?ver=161020">
<link rel="stylesheet"
	href="https://ebiga.co.kr/home/skin/board/basic/style.css?ver=161020">
<link rel="stylesheet" href="https://ebiga.co.kr/home/css/style.css">
<link rel="stylesheet"
	href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">

<!--[if lte IE 8]>
<script src="https://ebiga.co.kr/home/js/html5.js"></script>
<![endif]-->
<script>
	// 자바스크립트에서 사용하는 전역변수 선언
	var g5_url = "https://ebiga.co.kr/home";
	var g5_bbs_url = "https://ebiga.co.kr/home/bbs";
	var g5_is_member = "1";
	var g5_is_admin = "";
	var g5_is_mobile = "";
	var g5_bo_table = "notice02";
	var g5_sca = "";
	var g5_editor = "";
	var g5_cookie_domain = "";
</script>
<script src="https://ebiga.co.kr/home/js/jquery-1.8.3.min.js"></script>
<script src="https://ebiga.co.kr/home/js/jquery.menu.js?ver=161020"></script>
<script src="https://ebiga.co.kr/home/js/common.js?ver=161020"></script>
<script src="https://ebiga.co.kr/home/js/wrest.js?ver=161020"></script>
<script src="https://ebiga.co.kr/home/js/script.js"></script>
</head>
<body>
	<div id="hd_login_msg">
		알아님 로그인 중 <a href="https://ebiga.co.kr/home/bbs/logout.jsp">로그아웃</a>
	</div>
	<!-- 회원탈퇴 스크립트 시작 { -->
	<script type="text/javascript">
		function member_leave() { // 회원 탈퇴 tto
			if (confirm('회원에서 탈퇴 하시겠습니까?'))
				location.href = 'member_confirm_leave.jsp';
		}
	</script>
	<!-- }회원탈퇴 스크립트 끝 -->

	<!-- 상단 시작 { -->
	<div id="header">
		<div class="content">
			<div id="top_bar">
				<ul>
					<li><a href="login.jsp">로그인</a></li>
					<li><a href="register.jsp">회원가입</a></li>
					<li><a
						href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=video">이비가Family</a></li>
				</ul>
			</div>

			<h1 id="logo">
				<a href="../index.jsp"><img src="../image/logo.jpg" alt="이비가짬뽕"></a>
			</h1>
			<div id="m_family">
				<a href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=video"><i
					class="fa fa-user" aria-hidden="true"></i></a> <a
					href="https://ebiga.co.kr/home/bbs/logout.jsp" class="logout"><i
					class="fa fa-user-times" aria-hidden="true"></i></a>
			</div>
			<div id="nav_btn">
				<i class="fa fa-bars" aria-hidden="true"></i>
			</div>
			<ul id="nav">
				<li><a href="../sub01.jsp">이비가소개</a>
					<ul class="sub_menu">
						<li><a href="../sub01.jsp">인사말</a></li>
						<li><a href="../sub01_02.jsp">연혁</a></li>
						<li><a href="../sub01_03.jsp">기업소개</a></li>
						<li><a href="bbs/ebigaIn.jsp">이비가人</a></li>
					</ul></li>
				<li><a href="../sub06.jsp">브랜드스토리</a>
					<ul class="sub_menu">
						<li><a href="../sub06.jsp">이비가의비밀</a></li>
						<li><a href="../sub06_02.jsp">짬뽕스토리</a></li>
						<li><a href="../sub06_03.jsp">재료스토리</a></li>
						<li><a href="../sub06_04.jsp">BI</a></li>
					</ul></li>
				<li><a href="sub02.jsp">메뉴안내</a>
					<ul class="sub_menu">
						<li><a href="sub02.jsp">메뉴안내</a></li>
					</ul></li>
				<li><a href="search.jsp">매장안내</a>
					<ul class="sub_menu">
						<li><a href="search.jsp">매장안내</a></li>
						<li><a href="best.jsp">우수가맹점</a></li>
					</ul></li>
				<li><a href="../sub04.jsp">창업안내</a>
					<ul class="sub_menu">
						<li><a href="../sub04.jsp">브랜드경쟁력</a></li>
						<li><a href="../sub04_02.jsp">창업비용</a></li>
						<li><a href="../sub04_03.jsp">창업절차</a></li>
						<li><a href="story.jsp">성공스토리</a></li>
						<li><a href="gallery.jsp">매장갤러리</a></li>
						<li><a href="faq.jsp">FAQ</a></li>
					</ul></li>
				<li><a href="bbs/notice.jsp">이비가소식</a>
					<ul class="sub_menu">
						<li><a href="notice.jsp">오픈점 소식</a></li>
						<li><a href="notice02.jsp">공지사항</a></li>
						<li><a href="event.jsp">이벤트</a></li>
						<li><a href="tv.jsp">TV</a></li>
						<li><a href="media.jsp">언론</a></li>
						<li><a href="community.jsp">고객의소리</a></li>
					</ul></li>
			</ul>
		</div>
		<div id="nav_bg"></div>
	</div>

	<!-- } 상단 끝 -->
	</div>
	<div id="nav_bg"></div>
	</div>

	<!-- } 상단 끝 -->
	<!-- 컨텐츠 시작 { -->
	<div id="container">

		<div id="sub_top" class="bg05">
			<h2 class="title">이비가소식</h2>
			<span class="line"></span>
			<ul class="path">
				<li><a href="../index.jsp"><img src="../image/home_btn.png"
						alt="홈"></a></li>
				<li>이비가소식</li>
				<li>공지사항</li>
			</ul>
		</div>
		<!-- } #sub_top 끝 -->

		<div id="snb">
			<ul>

				<li><a href="notice.jsp">오픈점 소식</a></li>
				<li><a href="notice02.jsp">공지사항</a></li>
				<li><a href="event.jsp">이벤트</a></li>
				<li><a href="tv.jsp">TV</a></li>
				<li><a href="media.jsp">언론</a></li>
				<li><a href="community.jsp">고객의소리</a></li>
			</ul>
		</div>
		<!-- } #snb 끝 -->

		<div id="sub" class="bbs">

			<h2 id="container_title">
				공지사항<span class="sound_only"> 목록</span>
			</h2>

			<!-- 게시판 목록 시작 { -->
			<div id="bo_list" style="width: 100%">

				<!-- 게시판 카테고리 시작 { -->
				<!-- } 게시판 카테고리 끝 -->

				<!-- 게시판 페이지 정보 및 버튼 시작 { -->
				<div class="bo_fx">
					<div id="bo_list_total">
						<span>Total 6건</span> 1 페이지
					</div>

				</div>
				<!-- } 게시판 페이지 정보 및 버튼 끝 -->

				<form name="fboardlist" id="fboardlist"
					action="./board_list_update.jsp"
					onsubmit="return fboardlist_submit(this);" method="post">
					<input type="hidden" name="bo_table" value="notice02"> <input
						type="hidden" name="sfl" value=""> <input type="hidden"
						name="stx" value=""> <input type="hidden" name="spt"
						value=""> <input type="hidden" name="sca" value="">
					<input type="hidden" name="sst" value="wr_num, wr_reply"> <input
						type="hidden" name="sod" value=""> <input type="hidden"
						name="page" value="1"> <input type="hidden" name="sw"
						value="">

					<div class="tbl_head01 tbl_wrap">
						<table>
							<caption>공지사항 목록</caption>
							<thead>
								<tr>
									<th scope="col">번호</th>
									<th scope="col" class="td_subject">제목</th>
									<th scope="col" class="td_name">글쓴이</th>
									<th scope="col" class="td_date"><a
										href="/home/bbs/board.jsp?bo_table=notice02&amp;sop=and&amp;sst=wr_datetime&amp;sod=desc&amp;sfl=&amp;stx=&amp;sca=&amp;page=1">날짜</a></th>
									<th scope="col" class="td_view"><a
										href="/home/bbs/board.jsp?bo_table=notice02&amp;sop=and&amp;sst=wr_hit&amp;sod=desc&amp;sfl=&amp;stx=&amp;sca=&amp;page=1">조회</a></th>
								</tr>
							</thead>
							<tbody>
								<tr class="">
									<td class="td_num">6</td>
									<td class="td_subject"><a
										href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice02&amp;wr_id=7">
											2018 추석 휴무 안내 </a></td>
									<td class="td_name sv_use"><span class="sv_member">최고관리자</span></td>
									<td class="td_date">09-18</td>
									<td class="td_num  td_view">887</td>
								</tr>
								<tr class="">
									<td class="td_num">5</td>
									<td class="td_subject"><a
										href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice02&amp;wr_id=6">
											2018 설 휴무 안내 </a></td>
									<td class="td_name sv_use"><span class="sv_member">최고관리자</span></td>
									<td class="td_date">02-09</td>
									<td class="td_num  td_view">1600</td>
								</tr>
								<tr class="">
									<td class="td_num">4</td>
									<td class="td_subject"><a
										href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice02&amp;wr_id=5">
											이비가짬봉 유성본점-소머리국밥 유성점 채용정보 </a></td>
									<td class="td_name sv_use"><span class="sv_member">최고관리자</span></td>
									<td class="td_date">11-15</td>
									<td class="td_num  td_view">655</td>
								</tr>
								<tr class="">
									<td class="td_num">3</td>
									<td class="td_subject"><a
										href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice02&amp;wr_id=4">
											이비가짬뽕 추석 휴무 안내 </a></td>
									<td class="td_name sv_use"><span class="sv_member">최고관리자</span></td>
									<td class="td_date">09-27</td>
									<td class="td_num  td_view">866</td>
								</tr>
								<tr class="">
									<td class="td_num">2</td>
									<td class="td_subject"><a
										href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice02&amp;wr_id=2">
											이비가 볶음짬뽕 출시 </a></td>
									<td class="td_name sv_use"><span class="sv_member">최고관리자</span></td>
									<td class="td_date">06-13</td>
									<td class="td_num  td_view">577</td>
								</tr>
								<tr class="">
									<td class="td_num">1</td>
									<td class="td_subject"><a
										href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=notice02&amp;wr_id=1">
											이비가짬뽕 홈페이지가 리뉴얼오픈하였습니다. </a></td>
									<td class="td_name sv_use"><span class="sv_member">최고관리자</span></td>
									<td class="td_date">04-18</td>
									<td class="td_num  td_view">474</td>
								</tr>
							</tbody>
						</table>
					</div>

				</form>
			</div>


			<!-- 페이지 -->

			<!-- 게시판 검색 시작 { -->
			<fieldset id="bo_sch">
				<legend>게시물 검색</legend>

				<form name="fsearch" method="get">
					<input type="hidden" name="bo_table" value="notice02"> <input
						type="hidden" name="sca" value=""> <input type="hidden"
						name="sop" value="and"> <label for="sfl"
						class="sound_only">검색대상</label> <select name="sfl" id="sfl">
						<option value="wr_subject">제목</option>
						<option value="wr_content">내용</option>
						<option value="wr_subject||wr_content">제목+내용</option>
						<option value="mb_id,1">회원아이디</option>
						<option value="mb_id,0">회원아이디(코)</option>
						<option value="wr_name,1">글쓴이</option>
						<option value="wr_name,0">글쓴이(코)</option>
					</select> <label for="stx" class="sound_only">검색어<strong
						class="sound_only"> 필수</strong></label> <input type="text" name="stx"
						value="" required id="stx" class="frm_input required" size="15"
						maxlength="20"> <input type="submit" value="검색"
						class="btn_submit">
				</form>
			</fieldset>
			<!-- } 게시판 검색 끝 -->

			<!-- } 게시판 목록 끝 -->
		</div>
		<!-- } #sub 끝 -->


	</div>
	<!-- } 컨텐츠 끝 -->

	<div id="f_form">
		<style>
table {
	width: 100%;
	border-collapse: collapse;
	font-size: 13px;
}

.form_box .btn_submit {
	background: #b4b4b4;
	padding: 5px 10px;
	color: #fff;
	width: auto;
}

.form_box .title {
	font-size: 20px;
	color: #373737;
	letter-spacing: -1px;
}

.form_box .title b {
	color: #e50110;
	font-size: 18px;
	font-weight: 800;
}

.form_box .title b a {
	color: #e50110;
}

form .info {
	font-size: 12px;
	color: #888
}

form .row:after {
	content: "";
	display: block;
	clear: both;
}

form .row label {
	float: left;
	width: 30%;
	padding: 2px 0;
	text-align: left;
	font-size: 13px;
}

form .row p {
	float: left;
	width: 70%;
	padding: 2px 0;
}

form .row p input, form .row p textarea {
	border: 1px solid #c9c9c9;
	width: 100%;
	padding: 2px 0;
}

form .send {
	text-align: right;
}

form .agree {
	text-align: right;
	padding: 5px 0;
}

form .agree .btn {
	padding: 5px 10px;
	background: #333;
	color: #fff;
	cursor: pointer;
	margin-left: 5px;
}

form .agree .agree_content {
	display: none;
	position: fixed;
	left: 0;
	top: 0;
	width: 100%;
	height: 100%;
	background: rgba(0, 0, 0, 0.85);
	z-index: 99;
}

form .agree .agree_content p {
	position: absolute;
	left: 50%;
	top: 50%;
	max-width: 400px;
	max-height: 300px;
	margin-left: -180px;
	margin-top: -150px;
	overflow-y: scroll;
	background: #fff;
	padding: 20px;
	border: 1px solid #ddd;
	text-align: left;
	font-size: 13px;
	line-height: 22px;
}
</style>

		<script type="text/javascript">
			$(function() {
				$('form .agree .btn').click(function() {
					$('form .agree .agree_content').show();
					$('form .agree .agree_content').click(function() {
						$('form .agree .agree_content').hide();
					})
				})
			})
		</script>

		<div class="form_box">
			<h2 class="title">
				<span>창업문의</span> <img
					src=".,/image/m_phone_icon.png" alt="전화번호">
				<b><a href="tel:1588-3964">1588-3964</a></b>
			</h2>
			<form name="contactform" method="post" action="formmail_send.jsp">
				<div class="left">
					<div class="row">
						<label for="first_name">이름</label>
						<p>
							<input name="first_name" type="text" class="ipt" maxlength="50"
								required>
						</p>
					</div>
					<div class="row">
						<label for="telephone">연락처</label>
						<p>
							<input name="telephone" type="text" class="ipt" maxlength="30"
								required>
						</p>
					</div>
					<div class="row">
						<label for="email">희망개설지역</label>
						<p>
							<input name="email" type="text" class="ipt" maxlength="80"
								required>
						</p>
					</div>
				</div>
				<div class="left">
					<div class="row">
						<label for="comments">기타문의내용</label>
						<p>
							<textarea name="comments" rows="4" required></textarea>
						</p>
					</div>
					<div class="row agree">
						<input type="radio" name="chk_info" value="CSS" checked="checked">개인정보
						수집 및 이용에 동의 (필수) <span class="btn">약관보기</span>
						<div class="agree_content">
							<p class="text">
								<b>[개인정보 수집 목적]</b><br> ㈜이비가푸드(이하 “회사”라 합니다.)는 다음과 같은 이유로
								필요한 최소한의 개인정보를 수집·이용합니다.<br> -창업문의, 전화상담, 대면상담, 자료 제공.
								㈜이비가푸드는 창업문의시 아래와 같은 개인정보를 수집하고 있습니다.<br> 개인정보 항목 : 창업희망지역,
								휴대전화번호, 이름, 신청 경로, 투자 예상 금액<br> 수집방법 : 홈페이지, 전화/팩스, 상담카드
								작성, 제휴사로부터 제공<br> 보유목적 : 소비자에게 창업 상담 및 가맹점 개설 관련 정보제공 등<br>
								보유근거 : 정보주체의 동의<br> 보유기간 : 정보를 제공받은 날로부터 3년<br> -단 귀하가
								별도로 개인정보의 정정, 처리정지 또는 삭제를 요구할 경우, 회사는 내부절차에 다라 귀하의 요구를 즉시 수용할
								것입니다.<br> -작성일로부터 3년 [개인정보 수집 동의 거부의 권리] 귀하께서는 본 개인정보 수집
								동의를 거부하실 권리가 있습니다. 다만 개인정보의 수집 동의를 거부하실 경우 창업상담, 사업설명회 자료 및 참가신청
								서비스의 이용이 제한됩니다.<br> <br> <b>[홍보 및 정보제공 용도로의 이용]</b><br>
								위의 개인정보를 회사의 창업 관련 자료 및 정보의 전달 등에 사용하는 것에 대하여 동의합니다.
							</p>
						</div>
					</div>
					<div class="row  send">
						<span class="info">※ 해당문의는 ebigafood@naver.com 으로 전송됩니다.</span> <input
							type="submit" value="보내기" class="btn_submit">
					</div>
				</div>
			</form>
		</div>
	</div>

	<!-- 회원탈퇴 스크립트 시작 { -->
	<script type="text/javascript">
		function member_leave() { // 회원 탈퇴 tto
			if (confirm('회원에서 탈퇴 하시겠습니까?'))
				location.href = 'member_confirm_leave.jsp';
		}
	</script>
	<!-- }회원탈퇴 스크립트 끝 -->


	<!-- 하단 시작 { -->
	<div id="footer">
		<div id="bottom">
			<ul class="sns">
				<li><a href="../index.jsp"><img src="../image/f_home.png"
						alt="홈"></a></li>
				<li><a href="https://ko-kr.facebook.com/ebigafood"
					target="_blank"><img src="../image/f_facebook.png" alt="페이스북"></a></li>
				<li><a href="https://www.youtube.com/watch?v=rTqbX2j9ebQ&t=8s"
					target="_blank"><img src="../image/f_youtube.png" alt="유투브"></a></li>
			</ul>
			<ul class="link">
				<li><a href="privacy.jsp">개인정보처리방침</a></li>
				<li><a href="#">이용약관</a></li>
				<li><a href="#">이메일무단수집거부</a></li>
				<li><a href="search.jsp">오시는길</a></li>
				<li><a href="faq.jsp">창업문의</a></li>
			</ul>
			<p class="address">
				(주)이비가푸드 대전광역시 서구 계룡로 199 이비가빌딩 5층<br> 대표. 권순창 l 사업자등록번호.
				314-86-23662 l 고객센터. <a href="tel:042-716-0088">042.716.0088</a><br>
				<br> Copyright(C) 2017 EBIGA ALL RIGHTS RESERVED.
			</p>

			<a href="#header" class="scroll_top"><i
				class="fa fa-arrow-circle-up" aria-hidden="true"></i></a>
		</div>

	</div>
	<!-- } 하단 끝 -->



	<!-- ie6,7에서 사이드뷰가 게시판 목록에서 아래 사이드뷰에 가려지는 현상 수정 -->
	<!--[if lte IE 7]>
<script>
$(function() {
    var $sv_use = $(".sv_use");
    var count = $sv_use.length;

    $sv_use.each(function() {
        $(this).css("z-index", count);
        $(this).css("position", "relative");
        count = count - 1;
    });
});
</script>
<![endif]-->

</body>
</html>

<!-- 사용스킨 : basic -->
