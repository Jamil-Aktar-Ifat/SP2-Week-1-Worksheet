import java.util.Scanner;

/**
 * In the code below, the if statement evaluates the condition x < 10 and
 * assigns the
 * variable color either the value "red" or "blue". The condition is first
 * examined and
 * the corresponding alternative is taken. The strategy in this code is to wait
 * until we
 * know exactly which alternative to take before assigning a colour.
 * String colour;
 * if (x < 10)
 * colour = "red";
 * else
 * colour = "blue";
 * Often an alternate strategy (let’s call it “act first, decide later”) can be
 * used to simplify the logic. If the actions in the true and false statements
 * are reversible, we can go
 * ahead and execute the false (or true) statement and then code an if statement
 * that
 * determines whether that action was correct. If the action was incorrect we
 * can reverse
 * it. We solve the problem posed above using this alternative strategy:
 * String colour = "blue";
 * if (x < 10)
 * colour = "red";
 * We “act first” by assuming blue is the right colour to assign to the variable
 * colour. We
 * correct it if that was wrong. The logic is simpler and involves coding one
 * less alternative in the if statement.
 * Rewrite the code above again, but this time start by setting the colour
 * variable to
 * "red". How does that change the condition?
 */
public class Problem_13 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int z = myScanner.nextInt();

        String colour = "red";
        if (z < 10) {
            colour = "blue";
        }
        System.out.println("The color is " + colour);
    }
}
