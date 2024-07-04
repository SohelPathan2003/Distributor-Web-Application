package distributor.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import distributor.model.AddNewVendorModel;
import distributor.service.VendorServices;

@WebServlet("/AddNewvendor")
public class AddNewVenderController extends HttpServlet {

	VendorServices vendorservice = new VendorServices();
	boolean b;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String vendorname = request.getParameter("vendorname");

		AddNewVendorModel newvendormodel = new AddNewVendorModel();
		newvendormodel.setVendorName(vendorname);
		b = vendorservice.isAddVendor(newvendormodel);
		RequestDispatcher res;
		if (b) {
			res = request.getRequestDispatcher("SuccessMessege.jsp");
			res.forward(request, response);
		} else {
			res = request.getRequestDispatcher("ErrorPage.jsp");
		    res.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
