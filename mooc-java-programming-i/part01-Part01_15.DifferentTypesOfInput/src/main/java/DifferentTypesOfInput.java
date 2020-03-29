
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String valueString = scan.nextLine();        
        System.out.println("Give an integer:");
        int valueInteger = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double valueDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean valueBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + valueString);
        System.out.println("You gave the integer " + valueInteger);
        System.out.println("You gave the double " + valueDouble);
        System.out.println("You gave the boolean " + valueBoolean);

    }
}
