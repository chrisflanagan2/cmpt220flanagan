package lab11;

public class SavingsAccount extends Account{
	public SavingsAccount(){}
	public SavingsAccount(int newId, double newBalance)
	{
	super(newId, newBalance);
	}

	// a savings account cannot be overdrawn
	public boolean withdraw(double transaction)
	{
	if(balance < transaction)
	return true;
	else
	return false;
	}
	}