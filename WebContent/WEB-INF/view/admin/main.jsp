<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<!doctype html>
<html lang="en">
<head >
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/common.css" />
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/admin.css" />

	<meta charset="UTF-8" />
	<title >Document</title>
</head>
<body>
<div>
  <header id="admin_header">
  		<h1 >관리자 메인 페이지</h1>
  </header>
	<aside id="admin_aside">
	<p id="member_mgmt_link">회원관리</p>
	</aside>
<section id= "admin_section">
<a >회원관리</a>	 
 <table id ="admin_table">
 <tr id="admin_table tr">
	<td id="admin_table td">
	<button id="go_create_link" style = "width:100%; height:100%;">테이블생성</button>
	</td>
	<td >준비중</td>
	<td >준비중</td>
</tr>
<tr >
	<td >준비중</td>
	<td >준비중</td>
	<td >테이블 생성<br/>
		<form id = "table_form" action="<%=application.getContextPath()%>/admin/create_table.do">
		<select name="whatitis" id="">
			<option value="member">회원 테이블</option>
			<option value="attend">출석 테이블</option>
		</select>
		<input type="text" placeholder="생성할 테이블 명"/><br/>
		 <button id = "create_btn">생성</button>
		</form>
		</td>
</tr>	
</table>
</section>
</div>
<%@ include file = "../common/footer.jsp" %>
<script>
	/*  document.querySelector('#go_create_link').addEventListener("click",
			function (){
		alert("click");
		location href = "${pageContext.request.contextPath}/admin/member _list.do";
	} ,false);
	  */
var aa = document.querySelector('#create_btn').addEventListener("click",create,false);

	  function create(){
			alert("click");
			document.querySelector('#table_form').submit();
}

	 
</script>
</body>
</html>