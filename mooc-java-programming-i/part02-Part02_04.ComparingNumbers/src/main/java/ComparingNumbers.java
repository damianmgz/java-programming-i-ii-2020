
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater than " + secondNumber +  ".");
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is smaller than " + secondNumber + ".");
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber + ".");
        }
        
        

    }
}
