/**
 * 
 */
function init(){
document.querySelector('#bitcamp_check_btn')
				.addEventListener('click',check,false);
	var arr =['burgerking', 'kakao', 'bitcamp', 'sktelecom', 'lotto'];
		EventListener
		for(var i=0; i<arr.length;i++){
			document.querySelector('#'+arr[i]).addEventListener('click',	function(e){
				location.href = "../"+this.id+"/main.jsp";
			}	,false);
		}
}
function check(){
	alert('클릭');
	location.href="result.jsp";
}
window.addEventListener("load",init,false)