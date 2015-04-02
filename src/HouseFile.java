/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chamodh
 */
public class HouseFile {
    
    private static BufferedReader inputFile;
	private static PrintWriter outputFile;
	private static boolean inputFileOpen = false;
	private static boolean outputFileOpen = false;
	private static String inputString =""; 
	
	public static void checkAvailability()
	{
		try {
			File sourcer = new File("houses.dat"); 
			if(!sourcer.exists())
			sourcer.createNewFile();
			
	        } catch (Exception e) {
	        	System.out.println("Error "+e);
	                              }			
	}
	
// Resets file for reading

	public static void reset()
	{
		try {
			
			if (inputFileOpen) inputFile.close();
			if (outputFileOpen) outputFile.close();
			inputFile = new BufferedReader(new FileReader("houses.dat"));
			inputFileOpen = true;
			inputString = inputFile.readLine();
			
			} catch (IOException e) {
				System.out.println("Error "+e); 
		}
	
	}
	
// Resets file for writing

	public static void rewrite()
	{
		try {
			
			if (inputFileOpen) inputFile.close();
			if (outputFileOpen) outputFile.close();
			outputFile = new PrintWriter(new FileWriter("houses.dat"));
			outputFileOpen = true;
			
			} catch (Exception e) {
				System.out.println("Error "+e); 
		}

	}
	
	
// Returns true if the file is open to read and there are more houses.

	public static boolean moreHouses()
	{
		if (!inputFileOpen || (inputString == null))
			return false;
			else return true;
	}
	
// Gets and returns the house information from ListHouse file.

	public static ListHouse getNextHouse() 
	{
		int lotNumber = 0;
		String lastName = "lname";
		String firstName = "fname";
		int listedPrice = 0;
		int squareFeet = 0;
		int noOfBedRooms =0;
		
		try {		
			
			lotNumber = Integer.parseInt(inputFile.readLine());
			lastName = inputString;
			firstName = inputFile.readLine();
			listedPrice = Integer.parseInt(inputFile.readLine());
			squareFeet = Integer.parseInt(inputFile.readLine());
			noOfBedRooms = Integer.parseInt(inputFile.readLine());
			inputString = inputFile.readLine();			
			} catch (IOException e) {
				System.out.println("Error "+e); 
		}	
		
		ListHouse house = new ListHouse(lotNumber, lastName, firstName, listedPrice,
		squareFeet, noOfBedRooms);
		return house;

	}

// Puts house information to House info file.

	public static void putToFile(ListHouse house)
	{
		try {
			
			outputFile.println(house.lotNumber());
			outputFile.println(house.lastName());
			outputFile.println(house.firstName());
			outputFile.println(house.listedPrice());
			outputFile.println(house.squareFeet());
			outputFile.println(house.noOfBedRooms());
			} catch (Exception e) {
				System.out.println("Error "+e); 
		}

	}

// Closes house info files

	public static void close()
	{
		
		try {
			
			if (inputFileOpen) inputFile.close();
			if (outputFileOpen) outputFile.close();
			inputFileOpen = false;
			outputFileOpen = false;
			
			} catch (IOException e) {
				System.out.println("Error "+e); 
		}

	}
    
}
