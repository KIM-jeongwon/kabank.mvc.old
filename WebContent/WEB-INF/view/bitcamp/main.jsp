<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<link rel="stylesheet" href=" <%=application.getContextPath()%>/resources/css/bitcamp.css" />
<body>
<div id ="wrapper">
<a id ="header" href="#">HOME</a>
<a id ="logout" href="#">로그아웃</a>
<%@ include file = "../common/nav.jsp" %>
<section>
<article>
	<h1>	비트 캠프 메인 </h1>
	
</article>
<form action="change_form" action="${ctx}/bitcamp.do">
<article>
</article>
<table id = "mypage_table">
<tr id ="mypage_table tr">
	<td rowspan="4"><img src="<%=application.getContextPath()%>/resources/img/images.jpg"
							id = "img" alt="" />  </td>
	<td class="title">ID</td>
	<td>${sessionScope.member.id}</td>
	<td>PW</td>
	<td>${sessionScope.member.pass}</td>
</tr>
<tr>
	<td class="title">NAME</td>
	<td>${sessionScope.member.name}</td>
	<td>GENDER</td>
	<td>${sessionScope.member.ssn}</td>
</tr>
<tr>
	<td class="title">BIRTH</td>
	<td>${sessionScope.member.ssn}</td>
	<td>E-MAIL</td>
	<td>${sessionScope.member.email}</td>
</tr>
<tr>
	<td class="title">PHONE</td>
	<td>${sessionScope.member.phone}</td>
	<td>ADDRESS</td>
	<td>${sessionScope.member.addr}</td>
</tr>
</table>
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
</form>

</section>

</div>
<%@ include file = "../common/footer.jsp" %>
	</body>
	<script>

	</script>
	</html>

