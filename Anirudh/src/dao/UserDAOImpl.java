package dao;

import java.sql.ResultSet;

import businessobject.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public User fetchUser(String username, String password, int userType) {
		try {
			ResultSet set = DBUtil.executeSelect("SELECT user_id, password, role from login_tbl where user_id='"+username+"' and password='"+password+"' and role='"+User.resolveUserType(userType)+"'");
			if(set.next()) {
				return new User(username, userType);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return null;
	}

}
