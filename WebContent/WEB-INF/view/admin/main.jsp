<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href=" <%=application.getContextPath()%>/resources/css/admin.css" />
<div id="admin_header">
  <header>
    <h1>Bitcamp Sample Project</h1>
    <h4>관리자 메인 페이지</h4>
  </header>
</div>
<div id="admin_main_wrapper">
<div id="admin_nav">
  <ul>
    <li><a class="active" id="member_mgmt_link">회원관리</a></li><br />
    <li><a>준비중</a></li><br />
    <li><a>준비중</a></li><br />
    <li><a>준비중</a></li>
  </ul>
</div>
<div id="admin_main_area">
<section>
    <h1>회원관리</h1>
    <table id="admin_main_table">
      <tr id="admin_main_table tr">
        <td id="admin_main_table td">
          테이블 생성
        </td>
        <td>
          준비중
        </td>
        <td>
          준비중
        </td>
      </tr>
      <tr>
        <td>
          준비중
        </td>
        <td>
          준비중
        </td>
        <td>테이블 생성
          <form id="create_table_form" action="${ctx}/admin/create_table.do">
            <select name="table_name" id="create_table">
              <option value="member">member</option>
              <option value="attend">attend</option> 
              <option value="bank">bank</option> 
            </select> <br />
            <button id="create_table_btn">생성</button>
          </form>
        </td>
      </tr>
    </table>    
</section>
</div>
</div>
<%@ include file="../common/footer.jsp"%>
</body>
<script>
document.querySelector('#create_table_btn').addEventListener('click', 
    function(){
      document.querySelector('#create_table_form').submit();
}, false)

</script>
</html>