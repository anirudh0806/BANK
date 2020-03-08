package apphandler;

import businessobject.User;
import dao.UserDAO;
import dao.UserDAOImpl;


public class LoginHandler {

	private UserDAO dao = new UserDAOImpl();
	
	public User fetchUser(String username, String password, int userType) {
		return dao.fetchUser(username, password, userType);
	}
	
	public int createUser(String username, String password, String fullName,
			int age, String gender, String occupation, String dateOfBirth,
			String idProof, String fatherName, String motherName,
			String address, String typeOfAccount) {
		return dao.createUser(username, password, fullName,
				age, gender, occupation, dateOfBirth,
				idProof, fatherName, motherName,
				address, typeOfAccount);
	}
}
