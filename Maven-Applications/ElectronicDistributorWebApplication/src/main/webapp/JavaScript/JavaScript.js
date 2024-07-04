function isValidvendor(str) {
	let small = document.getElementById("small");
	let vendorbtn = document.getElementById("vendorbtn");
		var regexp = /^[a-zA-Z]+$/;
		let result = regexp.test(str);
		if(str.length==0){ 
			
			small.innerHTML = " ";
			vendorbtn.disabled = false;
		}else{ 
		if (result ==false) {
			small.innerHTML = "invalid username";
			vendorbtn.disabled = true;
			
		}
		else {
			small.innerHTML = " ";
			vendorbtn.disabled = false;
			
			
			
		}
		}
}


function searchvendor(str){
	let xttp=new XMLHttpRequest();
	
	xttp.onreadystatechange=function(){
		if(this.readyState==4 && this.status==200){
			document.getElementById("vendortable").innerHTML=this.responseText;
			
		}
	};
	
	xttp.open("GET","SearchVendorAjax.jsp?value="+str,true);
	xttp.send();
	
}