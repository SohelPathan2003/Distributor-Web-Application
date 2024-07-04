<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>
<link href="https://getbootstrap.com/docs/5.3/assets/css/docs.css"
	rel="stylesheet">
<link rel="stylesheet" href="CSS/style.css">
<script type="text/javascript" src="JavaScript/JavaScript.js"></script>



</head>
<body>
	<div class="container-fluid mt-5">
		<div class=" row  ">
			<div class="col-3 ">
				<div class="nav flex-column nav-pills" id="v-pills-tab"
					role="tablist" aria-orientation="vertical">
					<button class="nav-link active" id="v-pills-home-tab"
						data-toggle="pill" data-target="#v-pills-home" type="button"
						role="tab" aria-controls="v-pills-home" aria-selected="true">Company
						Master</button>
					<button class="nav-link" id="v-pills-profile-tab"
						data-toggle="pill" data-target="#v-pills-profile" type="button"
						role="tab" aria-controls="v-pills-profile" aria-selected="false">Produt
						Master</button>
					<button class="nav-link" id="v-pills-messages-tab"
						data-toggle="pill" data-target="#v-pills-messages" type="button"
						role="tab" aria-controls="v-pills-messages" aria-selected="false">Employee</button>
					<button class="nav-link" id="v-pills-settings-tab"
						data-toggle="pill" data-target="#v-pills-settings" type="button"
						role="tab" aria-controls="v-pills-settings" aria-selected="false">Customer</button>
				</div>
			</div>
			<div class="col-9">
				<div class="tab-content" id="v-pills-tabContent">
					<div class="tab-pane fade show active mx-5" id="v-pills-home"
						role="tabpanel" aria-labelledby="v-pills-home-tab">

						<ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
							<li class="nav-item" role="presentation">
								<button class="nav-link active" id="pills-home-tab"
									data-toggle="pill" data-target="#pills-home" type="button"
									role="tab" aria-controls="pills-home" aria-selected="true">Add
									vendor</button>
							</li>
							<li class="nav-item" role="presentation">
								<button class="nav-link" id="pills-profile-tab"
									data-toggle="pill" data-target="#pills-profile" type="button"
									role="tab" aria-controls="pills-profile" aria-selected="false">View
									vendor</button>
							</li>
						</ul>
						<div class="tab-content" id="pills-tabContent">
							<div class="tab-pane fade show active pt-3" id="pills-home"
								role="tabpanel" aria-labelledby="pills-home-tab">
								<form action="AddNewvendor" method="POST">
									<input type="text" class="form-control" name="vendorname"
										id="exampleFormControlInput1" value=''
										placeholder="Enter vendor" onkeyup="isValidvendor(this.value)">
									<small id="small"></small> <input type="submit"
										class="form-control mt-4 text-white bg-primary" id="vendorbtn"
										value='Submit'>
								</form>
							</div>



							<div class="tab-pane fade" id="pills-profile"
								role="tabpanel" aria-labelledby="pills-profile-tab">
								<div class="searchcontent">
								<input type="text" value="" name="searchvendor" onkeyup="searchvendor(this.value)" placeholder="Search Vender">
								</div>
								
								  <%@ page import= "java.util.*"%>
                               <%@ page import="distributor.service.*" %>
                               <%@ page import="distributor.model.*" %>
                               <%
             
                                VendorServices getvendorlist=new VendorServices();
                                List <AddNewVendorModel>vendorlist=getvendorlist.getAllVendorList();
                                int count=0;
                                %>
                                <div id="vendortable">
								<table class="table">
									<thead class="thead-dark">
										<tr>
											<th scope="col">VendorID</th>
											<th scope="col">Vendor Name</th>
											<th scope="col">Delete</th>
											<th scope="col">Update</th>
										</tr>
									</thead>
									<tbody>
                                <% 
                                if(vendorlist.size()>0){
                            
									for(AddNewVendorModel model:vendorlist){
										count++;
									
									%>
										<tr>
										
											<th scope="row"><%=count%></th>
											<td><%=model.getVendorName() %></td>
											<td><a href=" ">Delete</a></td>
											<td><a href=" ">Update</a></td>
										</tr>
										<%
									}
										%>
									</tbody>
								</table>
            			<% 
                                }
            			%>
							</div>	
								
								
								
								</div>
						</div>
					</div>



					<div class="tab-pane fade" id="v-pills-profile" role="tabpanel"
						aria-labelledby="v-pills-profile-tab">Product Master</div>
					<div class="tab-pane fade" id="v-pills-messages" role="tabpanel"
						aria-labelledby="v-pills-messages-tab">employee</div>
					<div class="tab-pane fade" id="v-pills-settings" role="tabpanel"
						aria-labelledby="v-pills-settings-tab">customer</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>