package distributor.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import distributor.model.LoginValidateModel;
import distributor.repository.GetConnections;
import distributor.service.LoginService;
import distributor.service.LoginServiceInterface;

@WebServlet("/login")
public class LoginValidServletController extends HttpServlet{
	
	LoginServiceInterface loginservice=new LoginService();
	boolean b;
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String path=request.getServletContext().getRealPath("/")+"db.properties";
		
		GetConnections.path=path;
		
		
		
	
		LoginValidateModel loginvalidatemodel=new LoginValidateModel();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String usertype;
		loginvalidatemodel.setUsername(username);
		loginvalidatemodel.setPassword(password);
		loginvalidatemodel=loginservice.isValidUser(loginvalidatemodel);
	    if(loginvalidatemodel!=null){
	    	
	    	if(loginvalidatemodel.getLogintype().equals("super admin")){
		    	RequestDispatcher r=request.getRequestDispatcher("Dashbord.jsp");
		    	r.forward(request, response);
		    	
		    }
		    else if(loginvalidatemodel.getLogintype().equals("employee")){
		    	out.println("welcome in employee page");
		    }
	    	
	    }else {
	    	out.println("Username And Password Not Match.......");
	    }
	    
		
		
		
	}

}
