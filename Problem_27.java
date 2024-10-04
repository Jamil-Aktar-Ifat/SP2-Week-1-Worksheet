import java.util.Scanner;

/**
 * One loop type might be better suited than another to a particular purpose.
 * The following usages are idiomatic:
 * for Known number of iterations
 * while Unknown number of iterations
 * do At least one iteration
 * Convert the following while loop to a do loop.
 * import java.util.Scanner;
 * public class PrintSum {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * int sum = 0;
 * int n = 1;
 * while (n != 0) {
 * System.out.print("Please enter a number, 0 to quit: ");
 * n = in.nextInt();
 * if (n != 0) {
 * sum = sum + n;
 * System.out.println("Sum = " + sum);
 * }
 * }
 * }
 * }
 */

public class Problem_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = 1;
        do {
            System.out.print("Please enter a number, 0 to quit: ");
            n = in.nextInt();
            if (n != 0) {
                sum = sum + n;
                System.out.println("Sum = " + sum);
            }
        } while (n != 0); // Condition is checked after the loop
    }
}
