package lab11;

public class CheckingAccount extends Account{
	private double overdraftLimit;

	public void SavingsAccount(){}
	public void SavingsAccount(int newId, double newBalance, double overdraftLimit)
	{

	setOverdraftLimit(overdraftLimit);
	}

	public void setOverdraftLimit(double o)
	{
	overdraftLimit = o;
	}
	public double getOverdraftLimit()
	{
	return overdraftLimit;
	}

	// a checking account can be overdrafted up to overdraft limit
	public boolean withdraw(double transaction)
	{
	if(balance +overdraftLimit < transaction)
	return false;
	else
	return super.withdraw(transaction);
	}

	public String toString()
	{
	return super.toString()+"\nOverdraft limit: "+overdraftLimit;
	}
}
