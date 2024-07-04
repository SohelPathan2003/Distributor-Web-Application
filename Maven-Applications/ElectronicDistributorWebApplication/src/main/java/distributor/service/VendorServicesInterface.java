package distributor.service;

import java.util.List;

import distributor.model.*;

public interface VendorServicesInterface {
       public boolean isAddVendor(AddNewVendorModel newvendormodel);
       
       public List<AddNewVendorModel> getAllVendorList();
       public List<AddNewVendorModel> SearchVendorByName(String name);
}
