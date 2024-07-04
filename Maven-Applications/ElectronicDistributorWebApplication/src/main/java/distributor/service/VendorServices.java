package distributor.service;

import java.util.List;

import distributor.model.AddNewVendorModel;
import distributor.repository.VendorRepository;
import distributor.repository.VendorRepositoryInterface;

public class VendorServices implements VendorServicesInterface {
	VendorRepositoryInterface vendorrepository=new VendorRepository();
	public boolean isAddVendor(AddNewVendorModel newvendormodel) {
		return vendorrepository.isAddVendor(newvendormodel);
	}
	@Override
	public List<AddNewVendorModel> getAllVendorList() {
		
		return vendorrepository.getAllVendorList();
	}
	@Override
	public List<AddNewVendorModel> SearchVendorByName(String name) {
		// TODO Auto-generated method stub
		return  vendorrepository.getAllVendorByName(name);
	}

}
