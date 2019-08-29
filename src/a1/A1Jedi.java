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
		
		customers = scan.nextInt();
		
		// Goes through each customers
		for(int j = 0; j < customers; j++) {
					
			firstName = scan.next();
			lastName = scan.next();
			customerItems = scan.nextInt();
					
			// Goes through the items of customer
			for(int k = 0; k < customerItems; k++) {
				
				itemAmount = scan.nextInt();
				itemName = scan.next();
				
				for(int l = 0; l < differentItems; l++) {
					if(itemName.equals(itemNames[l])) {
						customerCounter[l] += 1;
						itemCounter[l] += itemAmount;
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
