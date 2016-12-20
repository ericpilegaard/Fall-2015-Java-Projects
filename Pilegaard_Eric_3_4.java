/**
 * 
 * @author Eric J. Pilegaard
 * 
 */



//Import Java Scanner
import java.util.Scanner;

public class Pilegaard_Eric_3_4 {
	
/**
 * 
 * This is the main function that will run at the start of the program
 * 
 */
		public static void main(String[] args){

			//Open Scanner
			Scanner keyboard = new Scanner(System.in);
			
			//Prompt enter Cost of Item
			System.out.println("Please enter the cost of your item.");
			System.out.println();
			
			//Get cost of item
			double itemCost = keyboard.nextDouble();
			System.out.println("The cost of your item is " + itemCost);
			System.out.println();
			
			//Prompt to enter years before purchase 
			System.out.println("Please enter the number of years");
			System.out.println("before you will purchase your item");
			System.out.println();
			
			//Get years before purchase
			double numberOfYears= keyboard.nextDouble();
			System.out.println();
			System.out.println("Your item will be purchased in");
			System.out.println(numberOfYears + " years.");
			System.out.println();
			
			//Prompt enter inflation rate
			System.out.println("Please enter the yearly inflation rate.");
			System.out.println();
			
			//Get inflation rate
			double inflationRate = keyboard.nextDouble();
			System.out.println();
			System.out.println("The yearly inflation rate is " + inflationRate);
			System.out.println();
			
			//Close Scanner in
			keyboard.close();
			
			
			//Make the inflation rate a percentage 
			inflationRate = inflationRate/100;
			
			//Calculating cost of item adjusted for inflation using for loop
			
			for (int i =1; i<=numberOfYears; i++)
			{
				itemCost= itemCost + (itemCost*inflationRate);
				
			}	
			
			
			//Print cost of item adjusted for inflation 
				System.out.println("The future cost of your item is " + itemCost);
				
				
			
		}
		}
