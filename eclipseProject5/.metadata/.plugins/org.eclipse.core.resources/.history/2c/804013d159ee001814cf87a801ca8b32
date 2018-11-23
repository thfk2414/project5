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
<title>FAQ 1 페이지 | 이비가짬뽕</title>
<link rel="stylesheet"
	href="https://ebiga.co.kr/home/css/default.css?ver=161020">
<link rel="stylesheet"
	href="https://ebiga.co.kr/home/skin/board/faq/css/fd_style.css?ver=161020">
<link rel="stylesheet"
	href="https://ebiga.co.kr/home/skin/board/faq/style.css?ver=161020">
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
	var g5_bo_table = "faq";
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
					<li><a href="https://ebiga.co.kr/home/bbs/logout.jsp">로그아웃</a></li>
					<li><a href="javascript:member_leave();">회원탈퇴</a></li>
					<li><a
						href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=video">이비가Family</a></li>
				</ul>
			</div>

			<h1 id="logo">
				<a href="https://ebiga.co.kr/home"><img
					src="https://ebiga.co.kr/home/image/logo.jpg" alt="이비가짬뽕"></a>
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
	<!-- 컨텐츠 시작 { -->
	<div id="container">

		<div id="sub_top" class="bg04">
			<h2 class="title">창업안내</h2>
			<span class="line"></span>
			<ul class="path">
				<li><a href="https://ebiga.co.kr/home"><img
						src="https://ebiga.co.kr/home/image/home_btn.png" alt="홈"></a></li>
				<li>창업안내</li>
				<li>FAQ</li>
			</ul>
		</div>
		<!-- } #sub_top 끝 -->

		<div id="snb">
			<ul>
				<li><a href="../sub04.jsp">브랜드경쟁력</a></li>
				<li><a href="../sub04_02.jsp">창업비용</a></li>
				<li><a href="../sub04_03.jsp">창업절차</a></li>
				<li><a href="story.jsp">성공스토리</a></li>
				<li><a href="gallery.jsp">매장갤러리</a></li>
				<li><a href="faq.jsp">FAQ</a></li>
			</ul>
		</div>
		<!-- } #snb 끝 -->

		<div id="sub" class="bbs">



			<!-- 게시판 목록 시작 { -->
			<div id="bo_list" style="width: 100%">

				<!-- 게시판 카테고리 시작 { -->
				<!-- } 게시판 카테고리 끝 -->

				<!-- 게시판 페이지 정보 및 버튼 시작 { -->
				<div class="bo_fx"></div>
				<!-- } 게시판 페이지 정보 및 버튼 끝 -->

				<form name="fboardlist" id="fboardlist"
					action="./board_list_update.jsp"
					onsubmit="return fboardlist_submit(this);" method="post">
					<input type="hidden" name="bo_table" value="faq"> <input
						type="hidden" name="sfl" value=""> <input type="hidden"
						name="stx" value=""> <input type="hidden" name="spt"
						value=""> <input type="hidden" name="sca" value="">
					<input type="hidden" name="page" value="1"> <input
						type="hidden" name="sw" value="">

					<style>
.over:hover {
	text-decoration: underline
}
</style>
					<div class="list-title">
						<ul>
							<li class="fd_chk"></li>
							<li class="fd_num"></li>
							<li class="fd_title"></li>
						</ul>
					</div>
					<div class="tbl_head01 tbl_wrap">
						<ul id="fd_accordion" class="accordion">
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">가맹점 창업을 위해서 어떠한 교육이 실시되나요?</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>가맹점 창업을 위해서 어떠한 교육이 실시되나요?</h4> -->
									<span><매뉴얼을 기반으로 한 효율적이고 전문적인 교육을 실시> 1. 제품 및 매장
										관리 - 레시피 교육 - POS 운영 및 수발주, 재고 관리 - 효율적인 손익 관리 - 위생관리, 매장 실습

										2. 고객 및 서비스 관리 - 고객 분석 - 효율적인 인력 관리 - 고객 응대 요령 및 서비스 - 클레임 처리
										및 대응 - 서비스 역량 강화</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">가맹상담을 신청하고 싶은데, 어떻게 해야 하나요?</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>가맹상담을 신청하고 싶은데, 어떻게 해야 하나요?</h4> -->
									<span>1. 대표번호 : 1588-3964 2. 홈페이지접수 : 홈페이지내에 희망지역과
										성명,전화번호를 남겨주시면 됩니다</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">기존 인테리어를 활용할 수 있나요?</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>기존 인테리어를 활용할 수 있나요?</h4> -->
									<span>- 인테리어는 본사에서 시공 가능하며 감리로도 가능합니다. 다만, 현장에서 판단했을 때
										활용 가능한 것은 사용할 수 있습니다. 감리 시공비 평당 40만원. 더 자세한 사항은 인테리어 담당자와 상의후
										최대한 활용할수 있습니다.</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">교육기간 후에 보충교육도 가능한가요?</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>교육기간 후에 보충교육도 가능한가요?</h4> -->
									<span>본사에서 교육이 미흡하다고 판단이 되면 보충교육도 가능합니다 단 추가교육시에는 교육비용이
										발생 될수 있습니다.</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">주방장은 따로 필요한가요?</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>주방장은 따로 필요한가요?</h4> -->
									<span>본사에서 진행하는 교육만 이수 하시면 누구나 가능하기 때문에 주방장은 필요 없습니다</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">가맹점 자체적으로 메뉴 추가할수 있나요??</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>가맹점 자체적으로 메뉴 추가할수 있나요??</h4> -->
									<span>메뉴는 본사와 협의된 상품만을 취급하는 것을 원칙으로 합니다</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">교육기간은 얼마나 되나요??</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>교육기간은 얼마나 되나요??</h4> -->
									<span>- 교육은 2주간 진행되며, 이론과 메뉴 실습을 병행합니다. 3명 이상이 반드시 입소하여야
										하며 추가 인원에 대한 교육비는 받지 않습니다. - 숙식을 모두 제공하며 교육비는 500만원(부가세별도)입니다.
										- 본사에서 교육을 받아야 합니다, 다만 상황에 따라 현장 실습은 사시는 곳에서 가까운 가맹점에서 받을 수
										있으나 반드시 본사와 협의을 거쳐야 합니다. - 추가 교육비는 별도입니다.</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">본사에서 점포 입지 선정을 도와주시나요? 또한 개설장소의 제한이
										있나요?</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>본사에서 점포 입지 선정을 도와주시나요? 또한 개설장소의 제한이 있나요?</h4> -->
									<span>1. 입지선정- 점주가 직접 하는 것을 원칙으로 하고 있으며 최종결정은 본사와 협의하여
										진행합니다. 시장,상권,점포분석 입지,배후지역 분석하여 점주와 협의하에 점포결정합니다 2. 개설장소의 제한-
										기존 점포에서 직선거리로 1KM이내에는 다른 점포를 내주지 않습니다. 현재 운영 중인 지역의 상권을 침해하지
										않는 범위에서 가능하고 대전지역은 현재 마감된 상태이이므로 주변지역으로 가능합니다.</span>
								</div></li>
							<li><span class="fd_num">Q</span>
								<h3>
									<span class="over">가맹점 구인은 어떻게 하며, 점포 직원 수는 얼마나 필요한가요?</span>
								</h3>

								<div class="panel loading" style="position: relative">


									<div class="faq_a">A</div>
									<!-- <h4>가맹점 구인은 어떻게 하며, 점포 직원 수는 얼마나 필요한가요?</h4> -->
									<span>1. 가맹점 구인 - 자체적으로 채용 하셔야 합니다 2. 점포상황과 평수에 따라 인원
										구성은 달라 집니다.</span>
								</div></li>
						</ul>
					</div>


				</form>
			</div>


			<!-- 페이지 -->

			<!-- 게시판 검색 시작 { -->
			<fieldset id="bo_sch">
				<legend>게시물 검색</legend>

				<form name="fsearch" method="get">
					<input type="hidden" name="bo_table" value="faq"> <input
						type="hidden" name="sca" value=""> <input type="hidden"
						name="sop" value="and"> <label for="sfl"
						class="sound_only">검색대상</label> <select name="sfl" id="sfl"
						style="padding: 2px">
						<option value="wr_subject||wr_content">내용</option>
					</select> <label for="stx" class="sound_only">검색어<strong
						class="sound_only"> 필수</strong></label> <input type="text" name="stx"
						value="" required id="stx" class="frm_input required" size="40"
						maxlength="40"> <input type="submit" value="검색"
						class="btn_submit">
				</form>
			</fieldset>
			<!-- } 게시판 검색 끝 -->

			<script type="text/javascript"
				src="https://ebiga.co.kr/home/skin/board/faq/js/jquery.accordion.2.0.js"
				charset="utf-8"></script>
			<script type="text/javascript">
				$('#fd_accordion').accordion({
					canToggle : true
				});
				$(".loading").removeClass("loading");
			</script>

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
				<span>창업문의</span> <img src="../image/m_phone_icon.png" alt="전화번호">
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

<!-- 사용스킨 : faq -->
