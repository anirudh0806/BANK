package dao;

import businessobject.User;

public interface UserDAO {

	public static final int USER_EXISTS = 0;
	public static final int USER_CREATED = 1;
	public static final int USER_CREATION_FAILED = 2;
	
	public User fetchUser(String username, String password, int userType);
	
	public int createUser(String username, String password, String fullName,
			int age, String gender, String occupation, String dateOfBirth,
			String idProof, String fatherName, String motherName,
			String address, String typeOfAccount);
}
