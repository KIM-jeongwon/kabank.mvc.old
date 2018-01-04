function init(){
	document.querySelector('#go_create_link')	.addEventListener("click",createTable,false);

}

function createTable(){
	location.href = "member_list.jsp"
}
window.addEventListener("load",init,false);

