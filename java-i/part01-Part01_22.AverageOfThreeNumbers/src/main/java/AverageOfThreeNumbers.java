
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int valueFirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueSecond = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int valueThird = Integer.valueOf(scanner.nextLine());
        
        double average = (double) (valueFirst+valueSecond+valueThird)/3;
        
        System.out.println("The average is " + average);
    }
}
