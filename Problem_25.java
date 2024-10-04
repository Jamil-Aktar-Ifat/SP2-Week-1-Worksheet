import java.util.Scanner;

/**
 * Write a program that uses a while loop. During each iteration of the loop,
 * prompt the user to enter a number –– positive, negative, or zero. Keep a
 * running
 * total of the numbers the user enters and also keep a count of the number of
 * entries the user makes.
 * The program should stop whenever the user enters "q" (or any other input that
 * cannot
 * be read as a number) to quit.
 * When the user has finished, print the grand total and the number of entries
 * the user typed.
 * Hint: The following instance methods of class Scanner can be very useful for
 * this question:
 * public boolean hasNextDouble() to check whether the user has entered a number
 * and public double nextDouble() to read a number.
 */

public class Problem_25 {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in); // Correctly initialize 

        int count = 0;
        double total = 0;

        // Start the loop
        while (true) {
            System.out.print("Enter a number or 'q' to quit: ");

            // Check if the input is a number
            if (UserInput.hasNextDouble()) { // Use UserInput here
                double input = UserInput.nextDouble(); // Read the number
                total += input; // Add to total
                count++; // Increment the count
            } else {
                // Check for the quit command
                String quit = UserInput.next(); // Read the next input as a string
                if (quit.equalsIgnoreCase("q")) {
                    break; // Exit the loop if 'q' is entered
                } else {
                    System.out.println("Invalid input, please enter a number or 'q' to quit.");
                }
            }
        }

        // Print the result after the loop ends
        System.out.println("The total sum is: " + total);
        System.out.println("Total number of entries: " + count);

        UserInput.close(); // It's a good practice to close the scanner
    }
}
