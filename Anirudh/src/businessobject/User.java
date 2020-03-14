package businessobject;

public class User {

	public static final int CUSTOMER = 1;
	public static final int ADMIN = 2;
	public static final int TELLER = 3;
	
	private String username;
	private int userType;
	private int account;
	private double balance = 0.0;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public User(String username, int userType, int account) {
		this.username = username;
		this.userType = userType;
		this.account = account;
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
	
	public static String resolveUserType(int userType) {
		if(userType == ADMIN) return "ADMIN";
		if(userType == TELLER) return "TELLER";
		if(userType == CUSTOMER) return "CUSTOMER";
		return "";
	}
	
}
