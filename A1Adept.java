package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Declare variables
		int differentItems = 0;
		int customers = 0;
		String firstName = "";
		String lastName = "";
		int customerItems = 0;
		double total = 0.0;
		int itemAmount = 0;
		String itemName = "";
		double mini = 0.0;
		int minVal = 0;
		double maxi = 0.0;
		int maxVal = 0;
		double sum = 0.0;
		double average = 0.0;
		
		// Reads amount of different items
		differentItems = scan.nextInt();
		
		// Sets array lengths for items and prices
		String[] itemNames = new String[differentItems];
		double[] itemPrices = new double[differentItems];
		
		for(int i = 0; i < differentItems; i++) {
			
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
			
		}
		
		// Reads amount of customers
		customers = scan.nextInt();
		
		// Sets array lengths for customer totals and names
		double[] customerTotals = new double[customers];
		String[] customerNames = new String[customers];
		
		// Goes through each customers
		for(int j = 0; j < customers; j++) {
			
			firstName = scan.next();
			lastName = scan.next();
			customerItems = scan.nextInt();
			
			// Goes through the items of customer
			for(int k = 0; k < customerItems; k++) {
				
				itemAmount = scan.nextInt();
				itemName = scan.next();
				
				// Finds total for customer
				for(int x = 0; x < itemNames.length; x++) {
					
					if (itemName.equals(itemNames[x])) {
						total += itemPrices[x] * itemAmount;
					}
				
				
				}	
			}
			
			// Stores customer total
			customerNames[j] = firstName + " " + lastName;
			customerTotals[j] = total;
			
			// Resets total
			total = 0;
		}
		
		// Sets minimum to a some customer total
		mini = customerTotals[0];
		
		for (int l = 0; l < customerNames.length; l++) {
			
			// Finds min and max values and position
			if(customerTotals[l] > maxi) {
				
				maxVal = l;
				maxi = customerTotals[l];
				
			}
			else if (customerTotals[l] < mini) {
				
				minVal = l;
				mini = customerTotals[l];
				
			}
			
			// Finds average
			sum += customerTotals[l];
			average = sum / customerNames.length;
			
		}
		
		
		// Output
		System.out.println("Biggest: " + customerNames[maxVal] + " (" + String.format("%.2f", maxi) + ")");
		System.out.println("Smallest: " + customerNames[minVal] + " (" + String.format("%.2f", mini) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
		
	}
}
