	import java.util.Scanner;

		public class ComputerGuessingGame {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int lowerBound = 0;
		        int upperBound = 100;
		        int guessCount = 0;

		        System.out.println("Think of a number between 0 and 100.");

		        while (true) {
		            int guess = (lowerBound + upperBound)/3;
		            guessCount++;

		            System.out.println("Is your number " + guess + "?");
		            System.out.println("Enter 'higher' if higher, 'lower' if lower, or 'yep' if correct:");
		            String response = scanner.next();

		            if (response.equalsIgnoreCase("higher")) {
		                lowerBound = guess + 1;
		            } else if (response.equalsIgnoreCase("lower")) {
		                upperBound = guess - 1;
		            } else if (response.equalsIgnoreCase("yep")) {
		                System.out.println("I guessed your number in " + guessCount + " tries!");
		                break;
		            } else {
		                System.out.println("Invalid input. Please enter 'higher', 'lower', or 'yep'.");
		            }
		        }

		        scanner.close();
		    }
		
	}


