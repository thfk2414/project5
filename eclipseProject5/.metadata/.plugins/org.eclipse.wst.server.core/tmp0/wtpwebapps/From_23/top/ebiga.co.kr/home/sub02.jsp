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
<title>이비가짬뽕</title>
<link rel="stylesheet"
	href="https://ebiga.co.kr/home/css/default.css?ver=161020">
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
	var g5_bo_table = "";
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
		<!-- 회원탈퇴 스크립트 시작 { -->
		<script type="text/javascript">
			function member_leave() { // 회원 탈퇴 tto
				if (confirm('회원에서 탈퇴 하시겠습니까?'))
					location.href = 'bbs/member_confirm_leave.jsp';
			}
		</script>
		<!-- }회원탈퇴 스크립트 끝 -->

		<!-- 상단 시작 { -->
		<div id="header">
			<div class="content">
				<div id="top_bar">
					<ul>
						<li><a href=bbs/login.jsp">로그인</a></li>
						<li><a href=bbs/register.jsp">회원가입</a></li>
						<li><a
							href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=video">이비가Family</a></li>
					</ul>
				</div>

				<h1 id="logo">
					<a href="index.jsp"><img src="image/logo.jpg" alt="이비가짬뽕"></a>
				</h1>
				<div id="m_family">
					<a href="https://ebiga.co.kr/home/bbs/board.jsp?bo_table=video"><i
						class="fa fa-user" aria-hidden="true"></i></a>
				</div>
				<div id="nav_btn">
					<i class="fa fa-bars" aria-hidden="true"></i>
				</div>
				<ul id="nav">
					<li><a href="sub01.jsp">이비가소개</a>
						<ul class="sub_menu">
							<li><a href="sub01.jsp">인사말</a></li>
							<li><a href="sub01_02.jsp">연혁</a></li>
							<li><a href="sub01_03.jsp">기업소개</a></li>
							<li><a href="bbs/ebigaIn.jsp">이비가人</a></li>
						</ul></li>
					<li><a href="sub06.jsp">브랜드스토리</a>
						<ul class="sub_menu">
							<li><a href="sub06.jsp">이비가의비밀</a></li>
							<li><a href="sub06_02.jsp">짬뽕스토리</a></li>
							<li><a href="sub06_03.jsp">재료스토리</a></li>
							<li><a href="sub06_04.jsp">BI</a></li>
						</ul></li>
					<li><a href="sub02.jsp">메뉴안내</a>
						<ul class="sub_menu">
							<li><a href="sub02.jsp">메뉴안내</a></li>
						</ul></li>
					<li><a href="bbs/search.jsp">매장안내</a>
						<ul class="sub_menu">
							<li><a href="bbs/search.jsp">매장안내</a></li>
							<li><a href="bbs/best.jsp">우수가맹점</a></li>
						</ul></li>
					<li><a href="sub04.jsp">창업안내</a>
						<ul class="sub_menu">
							<li><a href="sub04.jsp">브랜드경쟁력</a></li>
							<li><a href="sub04_02.jsp">창업비용</a></li>
							<li><a href="sub04_03.jsp">창업절차</a></li>
							<li><a href="bbs/story.jsp">성공스토리</a></li>
							<li><a href="bbs/gallery.jsp">매장갤러리</a></li>
							<li><a href="bbs/faq.jsp">FAQ</a></li>
						</ul></li>
					<li><a href="bbs/notice.jsp">이비가소식</a>
						<ul class="sub_menu">
							<li><a href="bbs/notice.jsp">오픈점 소식</a></li>
							<li><a href="bbs/notice02.jsp">공지사항</a></li>
							<li><a href="bbs/event.jsp">이벤트</a></li>
							<li><a href="bbs/tv.jsp">TV</a></li>
							<li><a href="bbs/media.jsp">언론</a></li>
							<li><a href="bbs/community.jsp">고객의소리</a></li>
						</ul></li>
				</ul>
			</div>
			<div id="nav_bg"></div>
		</div>

		<!-- } 상단 끝 -->

		<!-- 컨텐츠 시작 { -->
		<div id="container">

			<div id="sub_top" class="bg02">
				<h2 class="title">메뉴안내</h2>
				<span class="line"></span>
				<ul class="path">
					<li><a href="index.jsp"><img src="image/home_btn.png"
							alt="홈"></a></li>
					<li>메뉴안내</li>
				</ul>
			</div>
			<!-- } #sub_top 끝 -->

			<div id="snb">
				<ul>
					<li><a href="home/sub02.jsp" class="on">메뉴안내</a></li>
				</ul>
			</div>
			<!-- } #snb 끝 -->

			<div id="sub" class="food">

				<ul class="list">
					<li>
						<h2>
							<i class="fa fa-chevron-circle-down" aria-hidden="true"></i> 이비가
							볶음짬뽕
						</h2>
						<div>
							<img src="./image/food_img07.jpg" alt="볶음짬뽕" class="off"> <img
								src="./image/food_img07_ov.jpg" alt="볶음짬뽕" class="over">
							<p>
								<b>볶아서 더 맛있다!</b><br> 이비가짬뽕의 담백하고 개운한 맛은 고스란히 살아있으면서도 깔끔한
								불맛과 칼칼한 식감이 입에 찰싹 붙는 맛, 이비가 볶음짬뽕이 입맛 살려드립니다.
							</p>
						</div>
					</li>
					<li>
						<h2>
							<i class="fa fa-chevron-circle-down" aria-hidden="true"></i> 참새우
							짬뽕
						</h2>
						<div>
							<img src="./image/food_img02.jpg" alt="참새우짬뽕" class="off">
							<img src="./image/food_img02_ov.jpg" alt="참새우짬뽕" class="over">
							<p>
								<b>얼큰하고 개운한 국물 맛이 일품!</b><br> 깊고도 칼칼한 이비가짬뽕 국물에 맛과 영양의 전령사인
								바다새우 특유의 담백한 향이 더해져 한 층 더 고급스러운 맛과 향취가 입안가득 전해집니다.
							</p>
						</div>
					</li>
					<li>
						<h2>
							<i class="fa fa-chevron-circle-down" aria-hidden="true"></i> 매생이
							짬뽕
						</h2>
						<div>
							<img src="./image/food_img04.jpg" alt="매생이 짬뽕" class="off">
							<img src="./image/food_img04_ov.jpg" alt="매생이 짬뽕" class="over">
							<p>
								<b>부드럽고 진~한 국물!</b><br> 청정한 겨울 바다내음 가득한 국산 매생이와 이비가짬뽕의 주재료인
								굴이 어우러져 맛과 영양면에서 찰떡궁합을 자랑하며 최고의 식감과 풍미를 선사합니다.
							</p>
						</div>
					</li>
					<li>
						<h2>
							<i class="fa fa-chevron-circle-down" aria-hidden="true"></i> 이비가
							짬뽕
						</h2>
						<div>
							<img src="./image/food_img01.jpg" alt="이비가짬뽕" class="off">
							<img src="./image/food_img01_ov.jpg" alt="이비가짬뽕" class="over">
							<p>
								<b>얼큰하고 개운한 국물 맛이 일품!</b><br> 잘 말린 고춧가루 맛이 우러나는 이비가짬뽕의 대표
								메뉴입니다. 얼큰한 것을 좋아 하시는 분, 시원한 속풀이를 원하시는 분들에게 사랑받는 맛입니다.
							</p>
						</div>
					</li>
					<li>
						<h2>
							<i class="fa fa-chevron-circle-down" aria-hidden="true"></i> 순한
							짬뽕
						</h2>
						<div>
							<img src="./image/food_img03.jpg" alt="순한 짬뽕" class="off">
							<img src="./image/food_img03_ov.jpg" alt="순한 짬뽕" class="over">
							<p>
								<b>부드럽고 진~한 국물!</b><br> 빨간 고춧가루를 넣지 않은 특별한 짬뽕입니다. 사골 국물, 굴과
								바지락, 잘 볶은 야채가 어우러져 칼칼하면서 고소한 맛으로 부담없이 드실 수 있는 짬뽕입니다.
							</p>
						</div>
					</li>
					<li>
						<h2>
							<i class="fa fa-chevron-circle-down" aria-hidden="true"></i> 이비가
							짜장
						</h2>
						<div>
							<img src="./image/food_img05.jpg" alt="이비가 짜장" class="off">
							<img src="./image/food_img05_ov.jpg" alt="이비가 짜장" class="over">
							<p>
								<b>짜장과 한우의 특별한 만남!</b><br> 곱게 다진 한우와 야채가 듬뿍 들어간 영양 만점
								짜장입니다. 남녀노소 좋아 하는 맛으로, 짜장 소스에 밥까지 비벼 드시면 맛도 최고입니다.
							</p>
						</div>
					</li>
					<li>
						<h2>
							<i class="fa fa-chevron-circle-down" aria-hidden="true"></i> 이비가
							탕수육
						</h2>
						<div>
							<img src="./image/food_img06.jpg" alt="이비가 탕수육" class="off">
							<img src="./image/food_img06_ov.jpg" alt="이비가 탕수육" class="over">
							<p>
								<b>기다리는 시간도 즐겁다!</b><br> 질 좋은 국내산 생돼지 등심을 매일 매일 새로운 기름으로
								초벌튀김없이 1번만 튀겨 내어 겉은 하얗고 속살은 부드럽고 쫄깃한 이비가의 별미입니다. 짬뽕, 짜장과 함께 드셔도
								부담 없는 깔끔한 맛입니다.
							</p>
						</div>
					</li>
				</ul>

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
					<span>창업문의</span> <img src="image/m_phone_icon.png" alt="전화번호">
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
									㈜이비가푸드는 창업문의시 아래와 같은 개인정보를 수집하고 있습니다.<br> 개인정보 항목 :
									창업희망지역, 휴대전화번호, 이름, 신청 경로, 투자 예상 금액<br> 수집방법 : 홈페이지,
									전화/팩스, 상담카드 작성, 제휴사로부터 제공<br> 보유목적 : 소비자에게 창업 상담 및 가맹점 개설
									관련 정보제공 등<br> 보유근거 : 정보주체의 동의<br> 보유기간 : 정보를 제공받은
									날로부터 3년<br> -단 귀하가 별도로 개인정보의 정정, 처리정지 또는 삭제를 요구할 경우, 회사는
									내부절차에 다라 귀하의 요구를 즉시 수용할 것입니다.<br> -작성일로부터 3년 [개인정보 수집 동의
									거부의 권리] 귀하께서는 본 개인정보 수집 동의를 거부하실 권리가 있습니다. 다만 개인정보의 수집 동의를 거부하실
									경우 창업상담, 사업설명회 자료 및 참가신청 서비스의 이용이 제한됩니다.<br> <br> <b>[홍보
										및 정보제공 용도로의 이용]</b><br> 위의 개인정보를 회사의 창업 관련 자료 및 정보의 전달 등에
									사용하는 것에 대하여 동의합니다.
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
					location.href = 'bbs/member_confirm_leave.jsp';
			}
		</script>
		<!-- }회원탈퇴 스크립트 끝 -->


		<!-- 하단 시작 { -->
		<div id="footer">
			<div id="bottom">
				<ul class="sns">
					<li><a href="../index.jsp"><img src="image/f_home.png"
							alt="홈"></a></li>
					<li><a href="https://ko-kr.facebook.com/ebigafood"
						target="_blank"><img src="image/f_facebook.png" alt="페이스북"></a></li>
					<li><a href="https://www.youtube.com/watch?v=rTqbX2j9ebQ&t=8s"
						target="_blank"><img src="image/f_youtube.png" alt="유투브"></a></li>
				</ul>
				<ul class="link">
					<li><a href="bbs/privacy.jsp">개인정보처리방침</a></li>
					<li><a href="#">이용약관</a></li>
					<li><a href="#">이메일무단수집거부</a></li>
					<li><a href="bbs/search.jsp">오시는길</a></li>
					<li><a href="bbs/faq.jsp">창업문의</a></li>
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
