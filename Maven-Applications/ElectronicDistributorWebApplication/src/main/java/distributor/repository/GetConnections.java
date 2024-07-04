package distributor.repository;


import java.io.File;
import java.sql.*;
public class GetConnections {
	public static String path;
	DBConfig db=DBConfig.getInstance(path);
	protected PreparedStatement pstmt=db.getStatement();
	protected ResultSet rs=db.getResultSet();
	protected Connection conn=db.getConnection();
	
	
	
//	protected Connection conn;
//	protected PreparedStatement pstmt;
//	protected ResultSet rs;
//	
//	GetConnections(){
//		try {
//			 Class.forName("com.mysql.cj.jdbc.Driver");
//	conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electronicsdistributor","root","@Root512");
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
}
