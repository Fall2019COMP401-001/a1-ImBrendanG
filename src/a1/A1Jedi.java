package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Declare variables
		int differentItems = 0;
		int customers = 0;
		String firstName = "";
		String lastName = "";
		int customerItems = 0;
		int itemAmount = 0;
		String itemName = "";
		
		
		// Reads amount of different items
		differentItems = scan.nextInt();
				
		// Sets array lengths for items and prices and customer counter
		String[] itemNames = new String[differentItems];
		double[] itemPrices = new double[differentItems];
		int[] itemCounter = new int[differentItems];
		int[] customerCounter = new int[differentItems];
		
		
		// Goes through item list and prices
		for(int i = 0; i < differentItems; i++) {
					
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
					
		}
		
		// Reads amount of customers
		customers = scan.nextInt();
		
		// Goes through each customers
		for(int j = 0; j < customers; j++) {
					
			firstName = scan.next();
			lastName = scan.next();
			customerItems = scan.nextInt();
			
			// Sets arrays to length of the amount of customers different items
			int[] customerItemAmount = new int[customerItems];
			String[] customerItemName = new String[customerItems];
			
			// Goes through the items of customer
			for(int k = 0; k < customerItems; k++) {
				
				itemAmount = scan.nextInt();
				itemName = scan.next();
				
				customerItemAmount[k] = itemAmount;
				customerItemName[k] = itemName;
				
				
				// Goes through
				for(int l = 0; l < differentItems; l++) {
					if(itemName.equals(itemNames[l])) {
						itemCounter[l] += itemAmount;
						
						// Finds the amount of customers who bought a specific item
						for(int m = 0; m<customerItemName.length; m++) {
							if(customerItemName.length > 1 & itemName.equals(customerItemName[m])) {
								// Does not increase the amount of customers who bought item if there are repeated items has one item
							}
							else {
								// Increases customers who bought a specific item
								customerCounter[l] += 1;
							} 
						}	
					}
				}
			}
		}
		
		// Prints how many customers bought an item and how many of that item were bought
		for(int i = 0; i < differentItems; i++) {
			
			if(customerCounter[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			}
			else {
				System.out.println(customerCounter[i] + " customers bought " + itemCounter[i] + " " + itemNames[i]);
			}	
		}
	}
}
