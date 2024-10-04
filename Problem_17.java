import java.util.Scanner;

public class Problem_17 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = myScanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = myScanner.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = myScanner.nextLine();

        String middleString;
        if (str1.compareTo(str2) < 0 && str2.compareTo(str3) > 0) {
            middleString = str2; // str1 < str2 < str3
            if (str1.compareTo(str3) < 0) {
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
