function init(){
	var goAdminLink = document.querySelector('#go_admin_link');
	var goJoinLink = document.querySelector('#go_join_link');
	var indexLoginBtn = document.querySelector('#index_login_btn');
	goAdminLink.addEventListener("click",goAdmin,false);
	goJoinLink.addEventListener("click",goJoin,false);
	indexLoginBtn.addEventListener("click",indexLogin,false);
}
function indexLogin(e){
	var loginId = document.querySelector('#index_input_id').value;
	var joinId = sessionStorage.getItem('id');
	if(!(loginId===joinId)){
		e.preventDefault();
		alert('입력하신'+loginId +'는 없습니다.');
	}
	alert('회원가입한 아이디' + id);
}
function goAdmin(){
	 if(confirm('관리자?')){
         alert('안녕하세요 관리자님');
         location.href = "admin/main.jsp";
  }else{
         alert('관리자만 접근 가능 합니다');
         location.href = "member/join_form.jsp";
  }
}
function goJoin(){
	 var join =  confirm('회원가입하시겠습니까');
     if(join){
            alert('회원가입창으로 이동합니다.');
            location.href = "member/join_form.jsp";
     }else{
            alert('로그인창에 머무릅니다.');
            location.href = "#";
     }
}
window.addEventListener("load",init,false);