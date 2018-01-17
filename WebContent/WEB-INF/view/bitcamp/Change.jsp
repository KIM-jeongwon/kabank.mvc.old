<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/header.jsp"%>
<%@ include file="../common/nav.jsp"%>
<section>
<div class="changePass">
  <table style="margin: 0 auto; background-color: Gainsboro; border-radius: 10px">
    <tr>
      <td style="text-align: left; font-weight: bold; padding: 20px">
        <form id="changePass_form" action="${ctx}/member.do">
          현재 비밀번호 <br />
          <input id = "current_pass" name ="current_pass" value="${sessionScope.member.pass}"type="text" size="35px" /><br /><br />
          새 비밀번호 <br />
          <input id="change_pass "name= "change_pass" type="text" size="35px" /><br /><br />
          새 비밀번호 확인 <br />
          <input id = "confirm_pass"type="text" size="35px" /><br />
          <input type="hidden" name="cmd" value="change"/>
          <input type="hidden" name="dir" value="bitcamp"/>
          <input type="hidden" name="page" value="main"/>
          <input type="hidden" name="id" value="${sessionScope.member.id}"/>
        </form>
      </td>
    </tr>
    <tr>
      <td style="padding: 20px">
        <button id="changePass_confirm_btn" >확 인</button> 
        <button id="changePass_cancel_btn" >취 소</button>
      </td>
    </tr>
  </table>
</div>
</section>
<%@ include file="../common/footer.jsp"%>
</body>
<script>
document.querySelector('#changePass_confirm_btn').addEventListener('click', 
    function() {
	alert('클릭');
      document.querySelector('#changePass_form').submit();
      
}, false)
document.querySelector('#changePass_cancel_btn').addEventListener('click', 
    function() {
      
}, false)
</script>
</html>