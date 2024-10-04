/**
 * There is a famous story about a primary school teacher who wanted to occupy
 * his
 * students’ time by making the children compute the sum of 1 + 2 + 3 + ... +
 * 100 by
 * hand. As the story goes, the teacher was astounded when one of the children
 * immediately produced the correct answer: 5050. The student, a child prodigy,
 * was Carl Gauss,
 * who grew up to be one of the most famous mathematicians of the eighteenth
 * century.
 * Write a program that computes the above sum in a while loop and then prints
 * the
 * sum.
 */

public class Problem_23 {
    public static void main(String[] args) {
        int i = 1;
        int limit = 100;
        int count = 0;
        while (i <= limit) {
            count += i;
            System.out.println("Count is here: " + count);
            i++;
        }
    }
}
