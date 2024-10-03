
/**
 * The if statement is used to implement a decision. The simplest form of an if statement has two parts: a condition and a body. If the condition is true, the body of the
statement is executed. The body of the if statement consists of a statement block.
Consider the following code:
Page 3
if (n > 10) System.out.print("*****");
if (n > 7) System.out.print("****");
if (n > 4) System.out.print("***");
if (n > 1) System.out.print("**");
System.out.println("*");
How many * will be printed when the code is executed
(a) with n = 6?
(b) with n = 20?
(c) with n = 2?
(d) with n = –1?
 */

import java.util.Scanner;

public class Problem_10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int input = myScanner.nextInt();
        if (input > 10) {
            System.out.println("*****");
        } else if (input > 7) {
            System.out.println("****");
        } else if (input > 4) {
            System.out.println("***");
        } else if (input > 1) {
            System.out.println("**");
        } else {
            System.out.println("*");
        }
    }
}
