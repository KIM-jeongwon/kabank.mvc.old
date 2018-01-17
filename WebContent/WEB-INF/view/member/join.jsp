<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<head>
</head>
		<header  id="join_header">
					<h1>회원 가입 </h1>
		</header>
<body>
		<section>
	<article>
	<form id="join_form" name = "add" action="${ctx}/member.do">
<table id ="join_table">
 <tr >
 	<td>아이디 </td>
 	<td id="join_table_can">
 	 <input id= "join_table_can" name= "id" type="text"  placeholder ="아이디 입력" />	
 	 <input type="submit" id="join_confirm" value = "중복확인" />
 	 </td>
 	<tr >
 	<td>암호</td>
 	<td id="join_table_can">
 	<input id = "join_table_can" name= "pass" type="text" placeholder ="암호 입력"  /></td>
 	</tr>
 	<tr >
 	<td>암호확인</td>
 	<td id="join_table_can">
 	<input  id= "join_table_can" name= "pass" type="text" placeholder ="암호확인"  /></td>
 	</tr>
 	<tr >
 	<td>이름</td>
 	<td id="join_table_can">
 	 	<input type="text" name= "name" id="join_table_can" placeholder = "이름 입력"/></td>
 	</tr>	
 	<tr>
 	<td>가입일</td>
 	<td id="join_table_can"><input type="date" /></td>
 	</tr>
 	<tr >
 	<td>주민번호</td>
 	<td id="join_table_can">
 	<input type="text" name= "ssn" id= "join_table_can" placeholder ="주민등록번호 입력"/></td>
 	</tr>
 	<tr>
 	<td>주소</td>
 	<td id="join_table_can">
 	 	<input type="text" name= "addr" id="join_table_can" placeholder ="주소 입력"/></td>
	</tr>
 	<tr>
 	<td>이메일</td>
 	<td id="join_table_can">
 	 	<input type="email" name= "email" id="join_table_can" placeholder ="E-mail 입력"/>
 	 	<select name="email_select" class="box" id="email_select" onChange="checkemailaddy();">
         <option value="" selected>선택하세요</option>
        <option value="naver.com">naver.com</option>
        <option value="hotmail.com">hotmail.com</option>
        <option value="hanmail.com">hanmail.com</option>
        <option value="yahoo.co.kr">yahoo.co.kr</option>
</select>
 	 	</td>
 	</tr>
 	<tr>
 	<td>전화번호</td>
 	<td id="join_table_can">
 
 	<input id = "first" pattern="[0-9]{4}" type="tel" name= "phone1" placeholder ="앞자리 번호"/> -
 	<input id = "second" pattern="[0-9]{4}" type="tel" name= "phone2" placeholder ="뒷자리 번호"/></td>
 </tr>
	<tr>
		<td colspan="2" >
		    <button id="join_confirm_btn"> 확인 </button> 
		</td>
	</tr>
 			</table>
   			 <input type="hidden" name="cmd" value="add" />
 		</form>
	</article>
</section>
<%@ include file = "../common/footer.jsp"%>
<script>
	var joinConfirmBtn = document.querySelector('#join_confirm_btn').addEventListener('click',function (){
		alert('클릭');
		document.querySelector('join_form').submit();
},false);

</script>
</body>
</html>