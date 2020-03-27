
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int valueFirst = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int valueSecond = Integer.valueOf(scanner.nextLine());
        
        System.out.println(valueFirst + " * " + valueSecond + " = " + (valueFirst*valueSecond) );


    }
}
