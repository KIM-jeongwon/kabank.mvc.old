<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
	<%@ include file = "../common/nav.jsp" %>
<head>
	<meta charset="UTF-8" />
	<h1>마이페이지</h1>
</head>
<body>
<article>
</article>
<form action="change_form" action="${ctx}/bitcamp.do">
<table id = "mypage_table">
<tr id ="mypage_table tr">
	<td rowspan="5"><img src="<%=application.getContextPath()%>/resources/img/images.jpg"
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
<tr>
	<td class="title">ACCOUNT</td>
	<td>1234-5678-1234</td>
	<td></td>
	<td></td>
</tr>
</table>
<button id = "change_pass">비번 변경</button>
<button id = "delete_btn">회원 탈퇴</button>
</form>
<script>

</script>
</body>
</html>