/**
 * 
 */
window.onload = execute;
function execute(){
	document.quertSelector('#burgerking').onclick = goBurgerKing;
	document.quertSelector('#kakao').onclick = goKakao;
	document.quertSelector('#bitcamp').onclick = goBitcamp;
	document.quertSelector('#sktelecom').onclick = goSktelecom;
	document.quertSelector('#lotto').onclick = goLotto;
}
function goBurgerKing(){
	location.href = "../burgerking/main.jsp";
}
function goKakao(){
	location.href = "../kakao/main.jsp";
}
function goBitcamp(){
	location.href = "../bitcamp/main.jsp";
}
function gosktelecom(){
	location.href = "../sktelecom/main.jsp";
}
function goLotto(){
	location.href = "../lotto/main.jsp";
}
