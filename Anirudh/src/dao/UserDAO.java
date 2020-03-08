package dao;

import businessobject.User;

public interface UserDAO {

	public User fetchUser(String username, String password, int userType);
}
