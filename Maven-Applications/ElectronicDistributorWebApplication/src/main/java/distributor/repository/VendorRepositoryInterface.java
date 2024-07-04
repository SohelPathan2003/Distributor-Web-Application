package distributor.repository;

import java.util.List;

import distributor.model.AddNewVendorModel;

public interface VendorRepositoryInterface {

	public boolean isAddVendor(AddNewVendorModel newvendormodel);
	public List<AddNewVendorModel>getAllVendorList();
	public List<AddNewVendorModel> getAllVendorByName(String value);
}
