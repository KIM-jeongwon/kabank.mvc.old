<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<!doctype html>
<html lang="en">
<body>
<div id ="wrapper">
<a id ="header" href="#">HOME</a>
<a id ="logout" href="#">로그아웃</a>
<%@ include file = "../common/nav.jsp" %>
<section>
		<article>
카카오뱅크 메인
		</article>
	</section>
	<table style = "border: 1px solid grey; width: 900px; height: 100px; margin-top:150px; margin-left:350px;">
	<tr style =  "border: 1px solid grey">
		<td style ="border: 1px solid grey;width: 300px; ">
		<button  style="width:100%; height:100%;">송금</button>
		</td>
		<td style ="border: 1px solid grey;width: 300px; ">
		<button style="width:100%; height:100%;">착불</button>
		</td>
		<td style ="border: 1px solid grey;width: 300px; ">
		<button  id = "create_bank" name = "create_bank" style="width:100%; height:100%;">계좌개설</button>
		</td>
	</tr>
	</table>
	<aside></aside>
	</div>
<%@ include file = "../common/footer.jsp" %>
</body>
<script>
document.querySelector('#create_bank').addEventListener('click',function(){
	alert('클릭');
	location.href="${ctx}/kakao.do?cmd=open_account&dir=member&page=mypage"
},false);
</script>
</html>