
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = Integer.valueOf(scanner.nextLine());
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        int sum = firstNumber + secondNumber;
        double squareRoot = Math.sqrt(sum);
        
        System.out.println(squareRoot);

    }
}
