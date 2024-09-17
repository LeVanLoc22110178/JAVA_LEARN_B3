package leloc.com.service.Impl;

import leloc.com.DAO.IUserDAO;
import leloc.com.DAO.Impl.UserDAO;
import leloc.com.models.User;
import leloc.com.service.IUserService;

public class UserService implements IUserService{

	IUserDAO UserDAO = new UserDAO();
	@Override
	public boolean validate(User user) {
		return UserDAO.validate(user);
	}

	@Override
	public void registerUser(User user) {
		UserDAO.registerUser(user);
		
	}

	@Override
	public boolean checkUserExists(String username) {
		
		return UserDAO.checkUserExists(username);
	}

	@Override
	public void updatepass(String email, String password) {
		UserDAO.updatepass(email, password);
		
	}

	@Override
	public boolean checkemailExists(String email) {
		
		return UserDAO.checkemailExists(email);
	}

}
