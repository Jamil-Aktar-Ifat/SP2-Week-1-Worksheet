/**
 * Adding (incrementing) or subtracting (decrementing) the value one from an
 * integer
 * variable is a common, everyday operation. To increment an int variable x, we
 * could code
 * x = x + 1;
 * As an alternative, we could use the special operators ++ and -- to increment
 * and decrement a variable. Use the first approach to increment x in the
 * program below.
 * Print the value of x after incrementing. Use the ++ operator to
 * increment y in the program
 * below. Print the value of y after incrementing.
 * public class IncrementDemo {
 * public static void main(String[] args) {
 * int x = 10;
 * int y = -3;
 * // Put your code here
 * }
 * }
 */

public class IncrementDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = -3;
        x = x + 1;
        y++;

        System.out.println("After incrementing x: " + x);
        System.out.println("After incrementing y: " + y);

    }

}
