import java.util.Scanner;

/**
 * The code below is a more efficient solution to the previous problem.
 * import java.util.*;
 * public class SmallestInt2 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter a value for x:");
 * int x = scan.nextInt();
 * Page 4
 * int smallest = x; // x is the smallest value so far
 * System.out.println("Enter a value for y:");
 * int y = scan.nextInt();
 * if (y < smallest) {
 * smallest = y; // Update smallest if necessary
 * }
 * System.out.println("Enter a value for z:");
 * int z = scan.nextInt();
 * if (z < smallest) {
 * smallest = z; // Update smallest if necessary
 * }
 * System.out.println("The smallest value was " + smallest);
 * }
 * }
 * Modify the code so that it prompts the user for four integers (w, x, y, and
 * z) and prints
 * the smallest value contained in those variables. How hard would it be to
 * modify the
 * version of the program you wrote in the previous question to solve the
 * four-variable
 * problem?
 */

public class Problem_12 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the value of w: ");
        int w = myScanner.nextInt();
        int smallest = w;

        System.out.print("Enter the value of x: ");
        int x = myScanner.nextInt();
        if (x < smallest) {
            smallest = x;
        }

        System.out.print("Enter the value of y: ");
        int y = myScanner.nextInt();
        if (y < smallest) {
            smallest = y;
        }

        System.out.print("Enter the value of z: ");
        int z = myScanner.nextInt();
        if (z < smallest) {
            smallest = z;
        }

        System.out.println("The smallest number is " + smallest);
    }
}
