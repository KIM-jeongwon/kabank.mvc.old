/**
 * 
 */
function footer(){
	var foot = confirm('비트캠프로 이동합니다.');
		location.href="http://bitcamp.co.kr/index.php?main_page=home";
	}
	function clickMe(){
		document.querySelector('#footer').onclick = footer;
	}
	window.onload= clickMe;
	