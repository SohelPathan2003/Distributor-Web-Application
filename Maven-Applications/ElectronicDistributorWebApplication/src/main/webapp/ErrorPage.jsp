<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"
	integrity="sha512-AA1Bzp5Q0K1KanKKmvN/4d3IRKVlv9PYgwFPvm32nPO6QS8yH1HO7LbgB1pgiOxPtfeg5zEn2ba64MUcqJx6CA=="
	crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    
    <script>
	function showme() {
		swal("oopps Errr Found!!!");
	}
</script>


<style>
input{

width:200px;
background-color:royalblue;
height:50px;
color:white;
border:none;
margin-top:60px;
}

body{
display:flex;
flex-direction:column;
justify-content:space-between;
align-items:center;
}

h1{

margin-top:100px
color:red;
}

</style>

</head>
<body onload="showme()">

<form action="Dashbord.jsp"  method="post">
    <h1 style="color:DarkCyan">Some Problem Is There!!!!!</h1></br></br>
    
    <input type="submit" value="<--- back to DashBord">
    </form>

</body>
</html>