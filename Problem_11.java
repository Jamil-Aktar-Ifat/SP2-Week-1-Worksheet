import java.util.Scanner;

/**
 * An alternate form for an if statement has multiple parts: a condition that
 * evaluates to
 * true or false, a statement that is executed if the condition is true, the
 * word else, and
 * finally a statement that is executed when the condition is false. Each
 * statement can be
 * a simple statement consisting of a single Java instruction, a “complex”
 * statement (such
 * as another if statement), or a compound (or block) statement (matching braces
 * {}
 * that surround one or more Java statements). We suggest using the brace
 * notation in
 * every case. Consider the code below that prompts the user to input a value
 * for x and
 * for y. It then prints the smallest value contained in the variables x and y.
 * import java.util.*;
 * public class SmallestInt {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter a value for x:");
 * int x = scan.nextInt();
 * System.out.println("Enter a value for y:");
 * int y = scan.nextInt();
 * if (x <= y) {
 * System.out.println("The smallest value was " + x);
 * } else {
 * System.out.println("The smallest value was " + y);
 * }
 * }
 * }
 * Modify the code above so that it prompts the user to enter a third value for
 * a variable z. Rewrite the logic so that the program prints out the smallest
 * value contained in
 * x, y, and z.
 */

public class Problem_11 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter first integer: ");
        int num1 = myScanner.nextInt();

        System.out.print("Please enter second integer: ");
        int num2 = myScanner.nextInt();

        System.out.print("Please enter third integer: ");
        int num3 = myScanner.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is smallest");

        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is smallest.");
        } else {
            System.out.println(num3 + " is the smallest.");
        }
    }

}
