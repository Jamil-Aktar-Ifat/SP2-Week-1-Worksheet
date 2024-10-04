/**
 * Convert this for loop to a while loop:
 * public static void main(String[] args) {
 * for (int i = 1; i <= 10; i++)
 * System.out.println(i + " squared equals " + i * i);
 * }
 */

public class Problem_29 {

    public static void main(String[] args) {
        int i = 1;
        int limit = 10;

        while (i <= limit) {
            System.out.println(i + " squared equals " + i * i);
            i++;
        }
    }
}
