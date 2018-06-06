window.onload= function(){
	var oDiv1=document.getElementById('posern');
	var oUl1=document.getElementById('list');
	
	oDiv1.onmouseover = function(){
		oUl1.style.display='block';
	}
	oDiv1.onmouseout = function(){
		oUl1.style.display='none';
	}
}
