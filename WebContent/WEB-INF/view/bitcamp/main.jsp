<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!doctype html>
<html lang="en">
<%@ include file = "../common/head.jsp" %>
<link rel="stylesheet" href="../../css/bitcamp.css" />
<link rel="stylesheet" href="../../css/common.css" />
<body>
<div id ="wrapper">
<a id ="header" href="#">HOME</a>
<a id ="logout" href="#">로그아웃</a>
<%@ include file = "../common/nav.jsp" %>
<section>
<article>
	<h1>	비트 캠프 메인 </h1>
	
</article>
<form action="result.jsp">
<table id="bitcamp_table">
<tr>
	<th>요일</th>
	<th>월</th>
	<th>화</th>
	<th>수</th>
	<th>목</th>
	<th>금</th>
</tr>
<tr>
<td>출결현황</td>
<td><select name="" >
	<option value="absent" selected>결석</option>
	<option value="attend">출석</option>
	<option value="rate_attebd">지각</option>
	<option value="early_leave">조퇴</option>
</select></td>
<td><select name="" >
	<option value="" selected>결석</option>
	<option value="">출석</option>
	<option value="">지각</option>
	<option value="">조퇴</option>
</select></td>
<td><select name="" >
	<option value="" selected>결석</option>
	<option value="">출석</option>
	<option value="">지각</option>
	<option value="">조퇴</option>
</select></td>
<td><select name="" >
	<option value="" selected>결석</option>
	<option value="">출석</option>
	<option value="">지각</option>
	<option value="">조퇴</option>
</select></td>
<td><select name="" >
	<option value="" selected>결석</option>
	<option value="">출석</option>
	<option value="">지각</option>
	<option value="">조퇴</option>
</select></td>
</tr>

<tr>	
<td>출결상태</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
</tr>

</table>
<button id ="bitcamp_check_btn">추가</button>
</form>
</section>

</div>
<%@ include file = "../common/footer.jsp" %>
	</body>
	<script src="../../js/bitcamp/bitcamp.js"></script>
	</html>

