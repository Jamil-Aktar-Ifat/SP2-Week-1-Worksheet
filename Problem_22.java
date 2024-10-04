/**
 * Manipulating the loop control variable is a critical skill in learning to
 * write code with
 * loops. Modify the program in Question 20 so that it produces the following
 * output:
 * i = 6 i = 8 i = 10 i = 12 i = 14 i = 16 i = 18 ...
 * i = 98
 */

public class Problem_22 {
    public static void main(String[] args) {
        int i = 6;
        int limit = 98;

        while (i <= limit) {
            System.out.println("i = " + (i));
            i+=2;
        }
    }
}
