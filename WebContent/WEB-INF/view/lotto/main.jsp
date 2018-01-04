<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><html lang="en">
	<!doctype html>
<html lang="en">
	<%@ include file = "../common/head.jsp" %>
	<body>
	<div id ="wrapper">
<a id ="header" href="#">HOME</a>
<a id ="logout" href="#">로그아웃</a>
<script src ="../../js/burgerking/burgerking.js"></script>
	<%@ include file = "../common/nav.jsp" %>
<section>
<article>
<form action="result.jsp">
	구매 금액 : <input type="text" placeholder="게임당 1000원/최대 5게임"/>
	<input type= "submit" value = "전송" />
</form>
</article>
	</section>
	<aside></aside>
	</div>
<%@ include file = "../common/footer.jsp" %>
	</body>
	</html>