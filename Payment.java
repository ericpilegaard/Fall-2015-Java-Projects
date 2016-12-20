//A base class Payment
public class Payment {

	//A variable for the storage of the amount of the payments
	private static double [] amountOfPayment = new double[0];
	
	
	//Mutator method to add the payment numbers and amounts to amountOfPayment
	public static void addamountOfPayment(double paymentAmount)
	{
		double [] newamountOfPayment = new double[amountOfPayment.length + 1];
		for(int i=0; i<amountOfPayment.length; i++){
			newamountOfPayment[i] = amountOfPayment[i];
			}
		newamountOfPayment[newamountOfPayment.length -1]= paymentAmount;
		amountOfPayment = newamountOfPayment;
	}
	
	//Accessor method for the number and amount of payments
	public static void getamountOfPayment()
	{
		for (int index = 0; index < amountOfPayment.length; index++)
			System.out.println("Payment " + (index +1) + " was " + amountOfPayment[index]);
	}
	
	//A method to output the amount of the payment
	public void paymentDetails()
	{
		System.out.println("You have been paid " + amountOfPayment);
	}	
}
