package leloc.com.service;

import leloc.com.DAO.IUserDAO;
import leloc.com.models.User;

public interface IUserService {


	boolean validate(User user);
	void registerUser(User user);
	boolean checkUserExists(String username);
	void updatepass(String email, String password);
	boolean checkemailExists(String email);
	
	
	
}
