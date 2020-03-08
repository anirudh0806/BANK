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
	
	@Override
	public int createUser(String username, String password, String fullName,
			int age, String gender, String occupation, String dateOfBirth,
			String idProof, String fatherName, String motherName,
			String address, String typeOfAccount) {
		try {
			ResultSet set = DBUtil.executeSelect("SELECT user_id from login_tbl where user_id='"+username+"'");
			if(set.next()) {
				return USER_EXISTS;
			} else {
			int result = DBUtil.executeInsert("Insert into LOGIN_TBL(USER_ID, PASSWORD,CREATION_DATE, ROLE, FULLNAME ,AGE ,GENDER , OCCUPATION ,"
					+ "DATEOFBIRTH ,IDPROOF,FATHERNAME ,MOTHERNAME,ADDRESS,TYPEOFACCOUNT) VALUES('"+
					username + "','" + password + "',NOW(),'CUSTOMER','" +fullName + "'," +age + ",'" +gender + "','" +occupation + "','" +
					dateOfBirth + "','" + idProof + "','" +fatherName + "','" +motherName + "','" +address + "','"+typeOfAccount+"')" );
			
				return USER_CREATED;
			
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return USER_CREATION_FAILED;
	}

}
