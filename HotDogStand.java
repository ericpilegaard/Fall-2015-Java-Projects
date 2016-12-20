/**
 * 
 * @author Pilegaard, Eric J.
 *
 */
//Public class for hot dog stand calculations

public class HotDogStand {

		//Hot dog stand variables
		private int standID;
		private int dogsSold;
		private static int totalDogsSold = 0;
		
		//Constructor for user to initialize hot do stand values
		public HotDogStand(int newstandID, int newdogsSold)
		{
			standID= newstandID;
			dogsSold = newdogsSold;
			totalDogsSold += newdogsSold;
		}

		
		//Method to increment hot dogs sold
		public void justSold()
		{
			dogsSold++;
			totalDogsSold++;
		}

		//Method to return dogs sold by a single hot dog stand
		public int totalSold()
		{
			return dogsSold;
		}

		
		//Method to return all hot dogs sold by all stands
		public static int totalDogsSold()
		{
			return totalDogsSold;
		}

}

