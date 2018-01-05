<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
	<%@ include file = "../common/header.jsp" %>
<!doctype html>
<html lang="en">
<head>
	<link rel="shortcut icon" <%=application.getContextPath()%> href="../img/ee.ico" />
	<link rel="stylesheet"  href="<%=application.getContextPath()%>/resources/css/index.css" />
	<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/common.css" />
</head>
	<body>
		<div id="wrapper">
			<header id="index_header">
					<h1>BIT CAMP SAMPLE PROJECT</h1>
			</header>
				<section>
					<article>
<table id ="index_table">
		<tr>
			<td colspan="5">
				<form id="login_form" action="${pageContext.request.contextPath}/member/auth.do">
					<table >
						<tr id="index_Login_box">
							<td >
							<input  id="index_input_id" name="id" type="text" placeholder="ID 입력" />
							</td>
							<td rowspan="2">
							<input type="submit" id="index_login_btn" value=로그인 />
							</td>
						</tr>
						<tr id="index_Login_box">
							<td><input id="index_input_pass" name = "pass" type="text" placeholder="PASSWORD 입력" />
							</td>
						</tr>
					</table>
				</form>
				<a id="go_admin_link" href="#">관리자</a>
				<a id="go_join_link" href="#">회원가입</a>
				<a id="go_jdbc_link" href="#">JDBC test</a>
			</td>
		  </tr>
	   </table>
   </article>
</section>
</div>
<%@ include file = "../common/footer.jsp" %>
<script>
document.querySelector('#go_join_link').addEventListener("click",
		function goJoin(){
			location.href= "${pageContext.request.contextPath}/member/join.do"
},false);
var jdbcLink = document.querySelector('#go_jdbc_link').addEventListener("click",jdbc,false);

function jdbc(){
	alert('click');
	location.href="${pageContext.request.contextPath}/common/jdbc_test.do"
}
var indexLoginBtn = document.querySelector('#index_login_btn').addEventListener("click",login,false);

function login(){
	alert('click');
	document.querySelector('#login_form').submit();
}
var goAdmin = document.querySelector('#go_admin_link').addEventListener("click",admin,false);
function admin(){
	alert('click');
	location.href="${pageContext.request.contextPath}/admin/main.do"
}
</script>
</body>
</html>
