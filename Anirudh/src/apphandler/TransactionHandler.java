package apphandler;

import dao.BankDAO;
import dao.BankDAOImpl;


public class TransactionHandler {

	private BankDAO dao = new BankDAOImpl();
	
	public int createTransaction(int fromAct, int toAct, String ifscCode, double amount) {
		return dao.createTransaction(fromAct, toAct, ifscCode, amount);
	}
}
