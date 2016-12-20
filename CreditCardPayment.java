//A CriditCardPayment class that is a derived class of Payment
public class CreditCardPayment extends Payment {

	// Member variables for a credit card transaction 
	String cardHolderName;
	String cardExpirationDate;
	long cardNumber;
	double cardPayment;
	
	//Constructor to get the credit card variables
	public CreditCardPayment(String cardHolderName, String cardExpirationDate, long cardNumber, double cardPayment)
	{
		this.cardHolderName= cardHolderName;
		this.cardExpirationDate = cardExpirationDate;
		this.cardNumber = cardNumber;
		this.cardPayment = cardPayment;
	}
	
	//Redefining paymentDetails to include appropriate credit card information
	public void paymentDetails()
	{
		System.out.println("A credit card payment of " + cardPayment + " has been made.");
		System.out.println("Card holder name: " + cardHolderName);
		System.out.println("Card expiration date: " + cardExpirationDate);
		System.out.println("Card number: " + cardNumber);	
		addamountOfPayment(cardPayment);
	}	
}
