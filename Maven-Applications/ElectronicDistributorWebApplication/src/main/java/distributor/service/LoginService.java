package distributor.service;

import distributor.model.LoginValidateModel;
import distributor.repository.LoginUserValidateInterfaceRepository;
import distributor.repository.LoginUserValidateRepository;

public class LoginService implements LoginServiceInterface {
	LoginUserValidateInterfaceRepository logicvalidaterepository=new LoginUserValidateRepository();
	
	public LoginValidateModel isValidUser(LoginValidateModel loginvalidatemodel) {
		  return logicvalidaterepository.isValidUser(loginvalidatemodel);
	}

}
