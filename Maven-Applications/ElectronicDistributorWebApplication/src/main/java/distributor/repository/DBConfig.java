package distributor.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
public class DBConfig {

	
	private Connection conn;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;
	private CallableStatement cstmt=null;
	public static DBConfig db=null;
	private DBConfig(String path) {
		try {
			
			Properties p=new Properties();
			FileReader fr=new FileReader("C:\\Users\\HP\\Desktop\\db.properties");
			
		
		
		p.load(fr);
		String driver=p.getProperty("driver");
		String url=p.getProperty("url");
		String password=p.getProperty("password");
		String username=p.getProperty("username");
		
		Class.forName(driver);
		conn=DriverManager.getConnection(url,username,password);
		}catch(Exception ex) {
			
			System.out.println("Error is " +ex);
			
		}
		
	}
	
	public static DBConfig getInstance(String path) {
		if(db==null) {
			db=new DBConfig(path);
		}
		return db;
	}
	
	protected Connection getConnection() {
		return conn;
	}
	protected PreparedStatement getStatement() {
		return pstmt;
	}
	protected CallableStatement getCallableStatment() {
		return cstmt;
	}
	protected ResultSet getResultSet() {
		return rs;
	}
}
