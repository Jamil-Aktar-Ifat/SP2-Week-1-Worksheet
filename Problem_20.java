/**
 * Loops provide a mechanism for repeating a block of code called the loop body.
 * Many
 * loops are controlled with a single variable, which we will refer to as the
 * loop control
 * variable or the loop index.
 * Consider the code below. What is the output the program produces? (Decide
 * this
 * without executing the code.)
 * 
 * A simple program that prints a loop control variable.
 * public class SimpleLoop {
 * public static void main(String[] args) {
 * int i = 0;
 * int limit = 6;
 * while (i < limit) {
 * System.out.println("i = " + i);
 * i++;
 * }
 * }
 * }
 */

public class Problem_20 {
    public static void main(String[] args) {
        int i = 0;
        int limit = 6;
        while (i < limit) {
            System.out.println("i = " + i);
            i++;
        }
    }
}
