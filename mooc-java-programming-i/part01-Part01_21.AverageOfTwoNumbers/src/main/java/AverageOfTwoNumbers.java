
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int valueFirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueSecond = Integer.valueOf(scanner.nextLine());
        
        double average = (double) (valueFirst+valueSecond)/2;
        
        System.out.println("The average is " + average);


    }
}
