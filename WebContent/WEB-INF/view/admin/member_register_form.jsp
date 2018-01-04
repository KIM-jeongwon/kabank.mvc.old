<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>

 <head>
 <link rel="stylesheet" href="../../css/common.css" />
<link rel="stylesheet" href="../../css/admin.css" />
<link rel="stylesheet" href="../../css/member.css" />
<link rel="stylesheet" href="../../css/member_register_form.css" />
 </head>
 <body id="admin_body">
 	 <header id="admin_header">
  			<h1 >관리자 메인 페이지</h1>
  	</header>
		<aside id="admin_aside">
				<p>회원관리</p>
		</aside>
<section id= "admin_section">	 
<form id="member_register_form" action="member_register.jsp">
		회원 추가 페이지
 	<table id ="admin_table">
			<tr>
					<th>ID</th>	
					<td><input name="id" type="text" /></td>
				</tr>
				<tr>
					<th>이름</th>
					<td><input name= "name" type="text" /></td>
				</tr>
				<tr>
					<th>성 별</th>
					<td><input name = "ssn"  type="text" /></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input  name="phone"  type="text" /></td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input name="email"   type="text" /></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input  name="addr" id="member_input" type="text" /></td>
			</tr>
			<tr>
				<th colspan = "7"><button id ="member_register_btn" >추가</button></th>
			</tr>
		</table>
		</form>
	</section>
		<%@ include file = "../common/footer.jsp" %>
	<script src ="../../js/admin/member_register_form.js"></script>
</body>