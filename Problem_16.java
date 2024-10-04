import java.util.Scanner;

/**
 * Write a program that prompts the user to enter three strings. Compare the
 * String
 * objects lexicographically (similar to the order in a lexicon) and print the
 * middle-valued
 * string. To compare two String objects lexicographically, you can write
 * s1.compareTo(s2) and get an int value as a result.
 * • If the result is negative, then s1 is smaller.
 * • If the result is positive, then s2 is smaller.
 * • If the result is 0, then s1 and s2 are equal.
 * For example, if the three strings were "ab", "xy", and "pq", the program
 * would print
 * "pq".
 * Limit yourself to simple, nested if statements that don’t use the boolean
 * operators && or ||. Be sure to test your code by providing input data that
 * tests every path
 * through your code.
 * Make a list of values for str1, str2, and str3 that would thoroughly test the
 * code.
 * 
 */

public class Problem_16 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = myScanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = myScanner.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = myScanner.nextLine();

        String middleString;
        if (str1.compareTo(str2) < 0) {
            if (str2.compareTo(str3) < 0) {
                middleString = str2; // str1 < str2 < str3
            } else if (str1.compareTo(str3) < 0) {
                middleString = str3; // str1 < str3 < str2
            } else {
                middleString = str1; // str3 < str1 < str2
            }
        } else {
            if (str1.compareTo(str3) < 0) {
                middleString = str1; // str2 < str1 < str3
            } else if (str2.compareTo(str3) < 0) {
                middleString = str3; // str2 < str3 < str1
            } else {
                middleString = str2; // str3 < str2 < str1
            }
        }

        System.out.println("Middle String is: " + middleString);
    }

}
