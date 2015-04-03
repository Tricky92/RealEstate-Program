/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anupa
 */
public class ListHouse implements Listable{
    
    // Declaring variables
    
    private int lotNumber;
    private String lastName;
    private String firstName;
    private int listedPrice;
    private int squareFeet;
    private int noOfBedRooms;
    
    //build a constructor to check if the both values are equal

    public ListHouse(int lotNumber, String lastName, String firstName, int price, int squareFeet, int bedRooms )
		{
		this.lotNumber = lotNumber;
                this.lastName = lastName;
		this.firstName = firstName;
		this.listedPrice = listedPrice;
		this.squareFeet = squareFeet;
		this.noOfBedRooms = noOfBedRooms;
		}
    
                public Listable copy()
		
		{
		ListHouse result = new ListHouse(lotNumber, lastName, firstName, listedPrice,
		squareFeet, noOfBedRooms);
		return result;
		}
                
                public String compareTo(Listable comp)
		{
			int result;
			ListHouse other = (ListHouse)comp;
		 	result = this.lotNumber - other.lotNumber;
		
		if (result >0) {
			
			return "Greater";
			
		} else if (result <0) {
			
			return "Less";
	
		} else {
			
			return "Equal";
			
		} 		 
		
		}
                
                
                public int lotNumber()
		{
		return lotNumber;
		}
                public String lastName()
		{
		return lastName;
		}
		public String firstName()
		{
		return firstName;
		}
		public int listedPrice()
		{
		return listedPrice;
		}
		public int squareFeet()
		{
		return squareFeet;
		}
		public int noOfBedRooms()
		{
		return noOfBedRooms;
		}
    
}
