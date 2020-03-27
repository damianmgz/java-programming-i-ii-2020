
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
            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {
                continue;
            }

            if (parts[0].equals("add")) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            }

            if (parts[0].equals("move")) {
                if (amount <= first) {
                    first -= amount;
                    second += amount;
                } else {
                    second += first;
                    first = 0;
                }
                if (second > 100) {
                    second = 100;
                }
            }

            if (parts[0].equals("remove")) {
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
