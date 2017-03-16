window.onload=function(){
	console.log(document.body.clientHeight);
	parent.document.all("autoIframe").style.height=document.body.clientHeight+"px";
	//parent.document.all("autoIframe").style.width=document.body.scrollWidth;
};