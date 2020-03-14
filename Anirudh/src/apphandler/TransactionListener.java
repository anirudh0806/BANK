package apphandler;

public interface TransactionListener {

	public void transaction(double amount, int fromAcct, int toAcct);
	
}
