<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<!doctype html>
<html lang="en">
<head >
<link rel="stylesheet" href="../../css/common.css" />
<link rel="stylesheet" href="../../css/admin.css" />

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
	<td > 테이블 생성</td>
	<td > 테이블 생성 </td>
</tr>
<tr >
	<td >테이블 생성</td>
	<td >테이블 생성</td>
	<td > 테이블 생성</td>
</tr>	
</table>
</section>
</div>
<%@ include file = "../common/footer.jsp" %>
<script src ="../../js/admin/main.js"></script>
</body>
</html>