//Jarrod KOlb
//csc-320-2 Critical thinking 4
//Dr. Mujere
//January 14th, 2024
//Psuedocode
//Start
//create scanner & double array
//Prompt user for input, store  in array
//Add input to total, check for min and max
//calc sum, max, min, ave, and int
//display outputs
//end


import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] numbers = new double[5];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Please enter a grade intill you are no longer able to: ");
			numbers  [i] = input.nextDouble();
			
		}
		 double total = 0;
		 double min = numbers [0];
		 double max = numbers [0];	
		 double average = 0;
		 
	for (int i = 0; i < numbers.length; i++) {	
		total += numbers [i];
		if (numbers [i] > max) {
			max = numbers [i];
		}
		if (numbers [i] < min) {
			min = numbers [i];
		}
	}
	average = total / numbers.length;
	
	System.out.println("Total: " + total );
	System.out.println("Avereage: " + average);
	System.out.println("Minumin: " + min);
	System.out.println("Maximun: " + max);
	System.out.println("Interest on total at 20 %: " + (total * 0.2));
	
	input.close();
	

	}

}
