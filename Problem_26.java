/**
 * Use nested for loops to produce the following output:
 * X
 * XX
 * XXX
 * XXXX
 * XXXXX
 * The outer loop can control the number of rows that will be printed. The inner
 * loop
 * can control the number of X’s that print on a single line. The trick is to
 * notice that
 * there is a relationship between the row number and the number of X’s in the
 * row. This
 * relationship allows you to use the outer loop control variable to control the
 * inner loop.
 */

public class Problem_26 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
