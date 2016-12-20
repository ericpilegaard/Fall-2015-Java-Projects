/*
 * 
 * @ Eric J. Pilegaard
 * 
 */

//Import necessary java files 

import java.util.*;
import java.io.*;

//Create a class to run the program in
public class firstClass {

//Set up the public static void
public static void main(String[] args)
{

//Create a new input stream
	
		Scanner inputStream=null;

//Run the input stream 
	try
	{
		inputStream= new Scanner(new File("C:\\Users\\Horner Family\\Documents\\data.txt"));
	}

//Catch errors
	catch(FileNotFoundException e)
	{
		System.out.println("File data.txt was not found");
		System.out.println("or could not be opened.");
		System.exit(0);
	}

	
//Determining array size
int arraySize=0;
while(inputStream.hasNextLine())
{
	arraySize++;
	inputStream.nextLine();
}

//Run the input stream
try
{
	inputStream= new Scanner(new File("C:\\Users\\Horner Family\\Documents\\data.txt"));
}

//Catching errors
catch(FileNotFoundException e)
{
	System.out.println("File data.txt was not found");
	System.out.println("or could not be opened.");
	System.exit(0);
}

//Importing the Strings from the file into an array
String [] container = new String[arraySize];
int count = 0;
while(inputStream.hasNextLine() && count<arraySize)
{
	container[count]=inputStream.nextLine();
	count++;
}

//Close the input stream
inputStream.close();



//Convert the strings to integers
int [] newContainer = new int[arraySize];
for(int i = 0; i<arraySize; i++)
{
	 newContainer[i] = Integer.parseInt(container[i]);
}

//Sorting the array
Arrays.sort(newContainer);

//Writing the largest and smallest numbers to the screen
System.out.println(newContainer[0]);
System.out.println(newContainer[newContainer.length-1]);

}
}
