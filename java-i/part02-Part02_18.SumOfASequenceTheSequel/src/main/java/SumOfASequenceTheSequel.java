
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int numberTwo = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int count = number;
        
        while (count <= numberTwo) {
            sum += count;
            count++;       
        }
        
        /*for (int i= number; i <= numberTwo; i++) {
            sum += i;
        }
        */
        
        System.out.println("The sum is " + sum);
    }

}

