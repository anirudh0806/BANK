package apphandler;

public interface TransactionListener {

	public void amountCredited(double amount, int fromAcct);
	
	public void amountDebited(double amount, int toAcct);
}
