<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import= "java.util.*"%>
 <%@ page import="distributor.service.*" %>
<%@ page import="distributor.model.*" %>
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
</head>
<body>
   <%
String value=request.getParameter("value");
   VendorServices getvendorlist=new VendorServices();								 
     List <AddNewVendorModel>vendorlist=getvendorlist.SearchVendorByName(value);
                                int count=0;
                                %>

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
                                
                                if(vendorlist!=null){
									for(AddNewVendorModel model:vendorlist){
										System.out.println(model.getVendorName());
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
								
			

</body>
</html>