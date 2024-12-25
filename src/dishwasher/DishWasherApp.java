package dishwasher;

import java.util.Scanner;

public class DishWasherApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dishwasher Cycle Information");
		DishWasherUnit dishWasher = new DishWasherUnit();
		
		System.out.print("Enter the wash cycle (1 - 5): ");
		int cycleValue = input.nextInt();
		dishWasher.setCycle(cycleValue);
		
		System.out.print("Extended dry? (enter on or off): ");
		String extendedDry = input.next();
		dishWasher.setExtendedDry(extendedDry.equalsIgnoreCase("on"));
		
		System.out.println(dishWasher.toString());
		input.close();
		
		// TODO 5:Output your name 
		System.out.print("this program is made by Mustapha CHEKHAR " );
	}

}



