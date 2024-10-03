/**
 * What is the output of the following program and why?
 * public class AverageCalculator {
 * public static void main(String[] args) {
 * int age1 = 18;
 * int age2 = 35;
 * int age3 = 50;
 * int age4 = 44;
 * double averageAge = (age1 + age2 + age3 + age4) / 4;
 * System.out.println(averageAge);
 * }
 * }
 * Fix the program in the previous question so that it yields the correct
 * result.
 */

public class AverageCalculator {

   public static void main(String[] args) {
      int age1 = 18;
      int age2 = 35;
      int age3 = 50;
      int age4 = 44;
      double averageAge = ((age1 + age2 + age3 + age4) / 4.0); // we need to change 4 to 4.0 to specify the floating
                                                               // point number which ensure the result will be a
                                                               // floating point value
      System.out.println(averageAge);
   }
}