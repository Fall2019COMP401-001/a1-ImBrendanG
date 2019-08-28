package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Declare Variables
		int customers = 0;
		String firstName = "";
		String lastName = "";
		int items = 0;
		int amount = 0;
		String itemName = "";
		double price = 0.0;
		double total = 0.0;
		String twoDeci = "";
		
		
		// Read amount of customers
		customers = scan.nextInt();
		
		// Goes through each customer
		for(int i = 0; i < customers; i++) {
			firstName = scan.next();
			lastName = scan.next();
			items = scan.nextInt();
			
			// Goes through each item
			for(int j = 0; j < items; j++) {
				amount = scan.nextInt();
				itemName = scan.next();
				price = scan.nextDouble();
				total = amount*price + total;
				
			}
			
			// Formats total
			twoDeci = String.format("%.2f", total);
			
			// Prints total for customer
			System.out.println(firstName.substring(0,1) + ". " + lastName + ": " + twoDeci);
			
			// Resets Total
			total = 0;
		}
	}
}
