//A CashPayment class that is a derived class of Payment
public class CashPayment extends Payment {

	double cashPayment;
	
	//A constructor to get the cash details
	public CashPayment(double cashPayment)
	{
		this.cashPayment= cashPayment;
	}
	
	//Redefining paymentDetails to state that the transaction was in cash
	public void paymentDetails()
	{
		System.out.println("A cash payment of " + cashPayment + " has been made.");
		addamountOfPayment(cashPayment);
	}	
}
