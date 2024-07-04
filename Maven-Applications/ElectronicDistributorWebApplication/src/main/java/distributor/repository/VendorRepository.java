package distributor.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import distributor.model.AddNewVendorModel;

public class VendorRepository extends GetConnections implements VendorRepositoryInterface {
	int result;
	boolean b;

	public boolean isAddVendor(AddNewVendorModel newvendormodel) {
		try {
			pstmt = conn.prepareStatement("insert into vendormaster values('0',?)");
			pstmt.setString(1, newvendormodel.getVendorName());
			result = pstmt.executeUpdate();

		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
		if (result > 0)
			return true;
		else
			return false;
	}

	public List<AddNewVendorModel> getAllVendorList() {
		AddNewVendorModel vendormodel;
		List<AddNewVendorModel> vendlist=new ArrayList();
		try {
		pstmt=conn.prepareStatement("select * from vendormaster");
		rs= pstmt.executeQuery();
		while(rs.next()) {
			vendormodel=new AddNewVendorModel();
			vendormodel.setVendorId(rs.getInt(1));
			vendormodel.setVendorName(rs.getString(2));
			vendlist.add(vendormodel);
		}
		return vendlist.size()>0?vendlist:null;
		
		}catch(Exception e) {
			System.out.println("error is "+e);
			return null;
		}

	}

	@Override
	public List<AddNewVendorModel> getAllVendorByName(String value) {
		AddNewVendorModel vendormodel;
		List<AddNewVendorModel> vendlist=new ArrayList();
		try {
		pstmt=conn.prepareStatement("select * from vendormaster where vendorname like '%"+value+"%'");
		rs= pstmt.executeQuery();
		while(rs.next()) {
			vendormodel=new AddNewVendorModel();
			vendormodel.setVendorId(rs.getInt(1));
			vendormodel.setVendorName(rs.getString(2));
			
			vendlist.add(vendormodel);
		}
		return vendlist.size()>0?vendlist:null;
		
		}catch(Exception e) {
			System.out.println("error is "+e);
			return null;
		}

	}
}
