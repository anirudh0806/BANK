package apphandler;

import businessobject.User;
import dao.UserDAO;
import dao.UserDAOImpl;


public class LoginHandler {

	private UserDAO dao = new UserDAOImpl();
	public User fetchUser(String username, String password, int userType) {
		
		return dao.fetchUser(username, password, userType);
	}
}
