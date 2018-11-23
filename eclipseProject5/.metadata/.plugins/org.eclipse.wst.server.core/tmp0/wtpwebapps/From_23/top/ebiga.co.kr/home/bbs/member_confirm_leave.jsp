<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=0,maximum-scale=10,user-scalable=yes">
<meta http-equiv="imagetoolbar" content="no">
<meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
<title>회원 비밀번호 확인 | 이비가짬뽕</title>
<link rel="stylesheet" href="https://ebiga.co.kr/home/css/default.css?ver=161020">
<link rel="stylesheet" href="https://ebiga.co.kr/home/skin/member/basic/style.css?ver=161020">
<link rel="stylesheet" href="https://ebiga.co.kr/home/css/style.css">
<link rel="stylesheet" href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css">
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<!--[if lte IE 8]>
<script src="https://ebiga.co.kr/home/js/html5.js"></script>
<![endif]-->
<script>
// 자바스크립트에서 사용하는 전역변수 선언
var g5_url       = "https://ebiga.co.kr/home";
var g5_bbs_url   = "https://ebiga.co.kr/home/bbs";
var g5_is_member = "1";
var g5_is_admin  = "";
var g5_is_mobile = "";
var g5_bo_table  = "";
var g5_sca       = "";
var g5_editor    = "";
var g5_cookie_domain = "";
</script>
<script src="https://ebiga.co.kr/home/js/jquery-1.8.3.min.js"></script>
<script src="https://ebiga.co.kr/home/js/jquery.menu.js?ver=161020"></script>
<script src="https://ebiga.co.kr/home/js/common.js?ver=161020"></script>
<script src="https://ebiga.co.kr/home/js/wrest.js?ver=161020"></script>
<script src="https://ebiga.co.kr/home/js/script.js"></script>
</head>
<body>
<div id="hd_login_msg">이연님 로그인 중 <a href="https://ebiga.co.kr/home/bbs/logout.jsp">로그아웃</a></div>
<!-- 회원 비밀번호 확인 시작 { -->
<div id="mb_confirm" class="mbskin">
    <h1>회원 비밀번호 확인</h1>

    <p>
        <strong>비밀번호를 한번 더 입력해주세요.</strong>
                비밀번호를 입력하시면 회원탈퇴가 완료됩니다.
            </p>

    <form name="fmemberconfirm" action="member_leave.jsp" onsubmit="return fmemberconfirm_submit(this);" method="post">
    <input type="hidden" name="mb_id" value="2win22">
    <input type="hidden" name="w" value="u">

    <fieldset>
        회원아이디
        <span id="mb_confirm_id">2win22</span>

        <label for="confirm_mb_password">비밀번호<strong class="sound_only">필수</strong></label>
        <input type="password" name="mb_password" id="confirm_mb_password" required class="required frm_input" size="15" maxLength="20">
        <input type="submit" value="확인" id="btn_submit" class="btn_submit">
    </fieldset>

    </form>

    <div class="btn_confirm">
        <a href="../index.jsp">메인으로 돌아가기</a>
    </div>

</div>

<script>
function fmemberconfirm_submit(f)
{
    document.getElementById("btn_submit").disabled = true;

    return true;
}
</script>
<!-- } 회원 비밀번호 확인 끝 -->

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
