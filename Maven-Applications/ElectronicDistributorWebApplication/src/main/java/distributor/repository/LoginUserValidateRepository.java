package distributor.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import distributor.model.LoginValidateModel;

public class LoginUserValidateRepository extends GetConnections implements LoginUserValidateInterfaceRepository{
	
	int result=0;
	public LoginValidateModel isValidUser(LoginValidateModel loginvalidatemodel) {
		
		try {
		pstmt=conn.prepareStatement("select * from loginvalidation where username=? and password=?");
		pstmt.setString(1,loginvalidatemodel.getUsername());
		pstmt.setString(2,loginvalidatemodel.getPassword());
		rs=pstmt.executeQuery();
		
		if(rs.next())
		{
			loginvalidatemodel.setLogintype(rs.getString("usertype"));
			result=1;
		}
		
		}
		catch(SQLException sqlexception) {
			return null;
		}
		
		if(result==1)
			return loginvalidatemodel;
		else
			return null;
		
		
	}
	
	

}
