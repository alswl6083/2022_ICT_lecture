$(document).ready(function(){
	//로그아웃 드롭다운
	var target = $(".dropdown-menu");
	$(".dropdown-toggle").click(function(event){ 
		event.stopPropagation(); 
		target.toggle();
	}); 
	$(document).click(function(){ //외부클릭시 닫힘
		target.hide(); 
	});
	
	
	
});



