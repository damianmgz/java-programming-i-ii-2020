
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                System.out.println("First: 0/100");
                System.out.println("Second: 0/100");
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                if (amount < 0) {
                    amount = 0;
                }
                
                if (amount > 100) {
                    amount = 100;
                }
                
                first += amount;
                
                if (first > 100) {
                    first = 100;
                }
            }
            
            if (command.equals("move")) {
                if (amount < 0) {
                    amount = 0;
                }
                
                if (amount > 100) {
                    amount = 100;
                }
                
                if (amount > first) {
                    amount = first;
                }
                
                second += amount;
                first -= amount;
                
                if (second > 100) {
                    second = 100;
                }
                
            }
            
            if (command.equals("remove")) {
                if (amount < 0) {
                    amount = 0;
                }
                
                if (amount > 100) {
                    amount = 100;
                }
                
                second -= amount;
                
                if (second < 0) {
                    second = 0;
                }
            }
            
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

        }
    }

}
