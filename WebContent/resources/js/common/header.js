/**

 */
	function header(){
			alert('버거킹화면으로 이동');
			location.href = "../burgerking/main.jsp";
	}
	function logout(){
			alert('로그인화면으로 이동합니다.');
			location.href = "../index.jsp";
	}
	function clickMe(){
		document.querySelector('#header').onclick = header;
		document.querySelector('#logout').onclick = logout;
}
window.onload= clickMe;
