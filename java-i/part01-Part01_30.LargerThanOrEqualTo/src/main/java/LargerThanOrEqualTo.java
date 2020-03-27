
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int numberFirst = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int numberSecond = Integer.valueOf(scan.nextLine());

        if (numberFirst > numberSecond) {
            System.out.println("Greater number is: " + numberFirst);
        } else if (numberFirst < numberSecond) {
            System.out.println("Greater number is: " + numberSecond);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
