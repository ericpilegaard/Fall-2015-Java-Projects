/*
 * @ Eric J. Pilegaard
 */

//PaymentTransactions class for main method
public class PaymentTransactions extends Payment{
	
	public static void main(String[] args){
		
		//Two credit card payment objects with different values
		CreditCardPayment first = new CreditCardPayment("Eric", "11/15/20", 1562358748954612L, 75.53);
		CreditCardPayment second = new CreditCardPayment("Trena", "5/4/18", 1458765289785258L, 2156.75);
		
		//Two cash payment objects with different values
		CashPayment jackson = new CashPayment(20.00);
		CashPayment lincoln = new CashPayment(5.00);
		
		//Printing Transactions and each transaction amount as stored in the database
		first.paymentDetails();	
		System.out.println();
		second.paymentDetails();
		System.out.println();
		jackson.paymentDetails();
		System.out.println();
		lincoln.paymentDetails();
		System.out.println();
		Payment.getamountOfPayment();
	}
}
