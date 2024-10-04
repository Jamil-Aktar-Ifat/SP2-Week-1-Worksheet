/**
 * Java provides three types of loops: while, for, and do (also called
 * do-while).
 * Theoretically, they are interchangeable — any program you write with one kind
 * of loop
 * could be rewritten using any of the other types of loops. As a practical
 * matter, though,
 * it is often the case that choosing the right kind of loop will make your code
 * easier to
 * produce, debug, and read.
 * It takes time and experience to learn to make the best loop choice, so this
 * exercise
 * gives you some of that experience. Rewrite the program from Question 23 using
 * a for
 * loop. Repeat the exercise again but this time use a do-while loop.
 * Which form of loop seems to work best and why?
 */

public class Problem_24 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println("Sum is here: " + sum);
        }
        System.out.println("Total: " + sum);
    }
}
