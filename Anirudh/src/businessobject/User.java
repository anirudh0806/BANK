package businessobject;

public class User {

	public static final int CUSTOMER = 1;
	public static final int ADMIN = 2;
	public static final int APPROVER = 3;
	
	private String username;
	private int userType;
	
	
	public User(String username, int userType) {
		this.username = username;
		this.userType = userType;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	
	
}
