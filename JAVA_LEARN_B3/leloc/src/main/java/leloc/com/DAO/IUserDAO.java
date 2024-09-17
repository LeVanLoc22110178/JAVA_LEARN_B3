package leloc.com.DAO;

import leloc.com.models.User;

public interface IUserDAO {

	boolean validate(User user);
	void registerUser(User user);
	boolean checkUserExists(String username);
	void updatepass(String email, String password);
	boolean checkemailExists(String email);
	
	
}
