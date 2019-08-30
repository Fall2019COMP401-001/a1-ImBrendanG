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
				
				// Goes through to find itemCounter and customerCounter
				for(int l = 0; l < differentItems; l++) {
					if(itemName.equals(itemNames[l])) {
						itemCounter[l] += itemAmount;
						customerCounter[l] += 1;
						
					}
					
				}
				
			}
			int[] repeats = new int[customerItemName.length];
			for(int x = 0; x < customerItemName.length; x++) {
				for(int y = x + 1; y < customerItemName.length; y++) {
					if(customerItemName[x].equals(customerItemName[y])) {
						repeats[x] += 1;
					}
				}
			}
			for(int x = 0; x < differentItems; x++) {
				for(int y = 0; y < customerItemName.length; y++) {
					if(customerItemName[y].equals(itemNames[x])) {
						customerCounter[x] = customerCounter[x] - repeats[y];
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
