package distributor.repository;

import distributor.model.LoginValidateModel;

public interface LoginUserValidateInterfaceRepository {
	
	public LoginValidateModel isValidUser(LoginValidateModel loginvalidatemodel);
}
