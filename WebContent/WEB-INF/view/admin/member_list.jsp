<%@page import="javax.lang.model.element.Name"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<!doctype html>
<html lang="en">
<head >
<link rel="stylesheet" href="../../css/common.css" />
<link rel="stylesheet" href="../../css/member.css" />
	<meta charset="UTF-8" />
	<title >Document</title>
</head>
<body >
  <header id="member_header">
  		<h1 >관리자 메인 페이지</h1>
  </header>
  <table>
  <tr>
  <td id = "member_catecory"></td>
  </tr>
  </table>
	<aside id="member_aside">
	<p>회원관리</p>
	</aside>
<section id= "member_section">	 
 <table id ="member_table">
 <tr><th>
 <select>
 <option>ID</option>
 <option>성 별</option>
 <option>이 름</option>
 </select>
 </th>
 <th colspan="5"><input style= "width:800px" type="text" /></th>
 <th colspan="2"><button id = >검색</button></th>
 </tr>
 
 <tr id="member_table tr">
	<th >NO</th>
	<th>ID</th>
	<th>이 름</th>
	<th>생년월일</th>
	<th>성 별</th>
	<th>전화번호</th>
	<th>이메일</th>
	<th>주 소</th>
</tr>

<tr id ="member_button">
<th colspan = "8"><button id = "add_member_btn">추가</button></th>
</tr>
</table>
</section>
<%@ include file = "../common/footer.jsp" %>
<script src ="../../js/admin/member_list.js"></script>
</body>
</html>