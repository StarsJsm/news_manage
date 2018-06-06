window.onload=function(){
	var oUl=document.getElementById('nav');
	var oLi=oUl.getElementsByTagName('li');
	var oFirst=document.getElementById('first');
	var oSend=document.getElementById('send');
	var oThird=document.getElementById('third');
	//下拉
	var oDiv1=document.getElementById('posern');
	var oUl1=document.getElementById('list');
	
	function clear(){
		oFirst.style.display='none';
		oSend.style.display='none';
		oThird.style.display='none';
	}
	oLi[1].onclick=function(){
		clear();
		oFirst.style.display='table';
	}
	oLi[2].onclick=function(){
		clear();
		oSend.style.display='block';
	}
	oLi[3].onclick=function(){
		clear();
		oThird.style.display='block';
	}
	
	
	//下拉
	oDiv1.onmouseover = function(){
		oUl1.style.display='block';
	}
	oDiv1.onmouseout = function(){
		oUl1.style.display='none';
	}
	
	
	
}
