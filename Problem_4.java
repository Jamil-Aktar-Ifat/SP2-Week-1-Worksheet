import java.util.Scanner;

/**
 * Write a program that prompts the user to enter two integers. Print the
 * smaller of the two numbers entered. You’ll need to use a Scanner and a Math
 * method.
 */

public class Problem_4 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int firstNum = myScanner.nextInt();

        System.out.print("Please enter another integer: ");
        int secondNum = myScanner.nextInt();

        System.out.println("The smaller number is: " + Math.min(firstNum, secondNum));
    }

}
