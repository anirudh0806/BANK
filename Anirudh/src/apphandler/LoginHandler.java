package apphandler;

import businessobject.User;


public class LoginHandler {

	public User fetchUser(String username, String password, int userType) {
		return new User(username, userType);
	}
}
