//Jarrod Kolb
//CSC-320-2 
//Colorado State University -Global
//Module 5 - Option #1
//Dr. Mujeye 
//Jan 21st, 2024
//Pseudocode
//Start
//Initialization of 2 Array Lists (dailyTemperature and daysOfWeek).
//Ask user to input day and temp (mon-sun).
//Ask user to check day, temp and weekly temp average.
//Output weekly average
//Ask to continue or end program
//stop


package modulefive;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> daysOfWeek = new ArrayList<>();
		ArrayList<Double> dailyTemperatures = new ArrayList<>();
		
		for (int  i=0; i<7; i++){
			System.out.print("Enter the day of the week (Mon-Sun): ");
			String day = scanner.nextLine();
			System.out.print(" Enter the daily temperature for "+ day + ": " );
			
			double temperature = scanner.nextDouble();
			
			scanner.nextLine();
			
			daysOfWeek.add(day);
			dailyTemperatures.add(temperature);
		}
		while (true) {
			System.out.print("Enter the day of the week (Mon - Sun) or 'week' for weekly average: ");
			String input = scanner.nextLine();
			
		 if (input.equalsIgnoreCase("week")) {
			 
			 Double weeklyAverage = calculateWeeklyAverage(dailyTemperatures);
			 System.out.println("Weekly Average Temperature: " + weeklyAverage);
			 
		 }else if (daysOfWeek.contains(input)) {
		 
		     int index = daysOfWeek.indexOf(input);
		     double temperature = dailyTemperatures.get(index);
		     System.out.println("Temperature for " + input + ": " + temperature);
		}else {
		    System.out.println("Invalid input, Try a valid day or 'week'. ");
		
		    System.out.print("Do you want to check another day or 'week' (yes/no)?");
		    String continueInput = scanner.nextLine();
		    if (!continueInput.equalsIgnoreCase("yes")) {
		    	break; 
	 }	
		    }   
		 	
		}
	}		
		
		private static double calculateWeeklyAverage(ArrayList<Double> temperatures){		
			double sum = 0;		
			for (double temperature : temperatures) {
				sum += temperature;
				
			}
			return sum / temperatures.size();
			
	
						 

}}
