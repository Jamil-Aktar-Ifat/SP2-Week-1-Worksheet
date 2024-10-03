/**
 * What is the output of the following program and why?
 * public class PercentagePrinter {
 * public static void main(String[] args) {
 * // double rate = 8.70;
 * //int percentage = (int) (100 * rate);
 * //System.out.println(percentage);
 * double rate = 8.70;
 * double multiplier = 100;
 * System.out.println(rate*multiplier);
 * }
 * }
 * Fix the program from the previous question so that it displays the correct
 * result. Remember that you can use Math.round to convert a floating-point
 * value to its closest integer.
 */
public class PercentagePrinter {
    public static void main(String[] args) {
        double rate = 8.70;

        double multiplier = 100;
        System.out.println(Math.round(rate * multiplier));
    }
}
