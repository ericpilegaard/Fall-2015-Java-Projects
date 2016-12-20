/**
 * 
 * @author Pilegaard, Eric J.
 *
 */

//Public class corporate to manage all hot dog stands
public class Corporate {

	
	public static void main(String[] args){
	
		
		//Three hot dog stands.  
		HotDogStand mainStreet = new HotDogStand(1, 12);
		HotDogStand firstStreet= new HotDogStand(2, 6);
		HotDogStand parkAve= new HotDogStand(3, 0);
		
		
		
		
		//Total dogs sold by each stand
		System.out.println("The total amount of hot dogs sold");
		System.out.println("by stand 1 is " + mainStreet.totalSold());
		System.out.println();
		System.out.println("The total amount of hot dogs sold");
		System.out.println("by stand 2 is " + firstStreet.totalSold());
		System.out.println();
		System.out.println("The total amount of hot dogs sold");
		System.out.println("by stand 3 is " + parkAve.totalSold());
		System.out.println();
		
		
		
		//Total dogs sold by all stands
		System.out.println("The total amount of hot dogs sold by");
		System.out.println("all stands is " + mainStreet.totalDogsSold());
	}
	
}
