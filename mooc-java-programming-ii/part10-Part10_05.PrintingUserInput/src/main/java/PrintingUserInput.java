
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> strings = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            strings.add(input);
        }
        
        strings.stream()
                .forEach(line -> System.out.println(line));
    }
}
