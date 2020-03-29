
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(" ");

            for (int i = 0; i < parts.length; i++) {
                System.out.println(parts[i]);
            
            }
        }

    }
}
