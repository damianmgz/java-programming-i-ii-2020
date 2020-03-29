
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String line = this.scanner.nextLine();
            
            if (line.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (line.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.dictionary.add(word, translation);
            } else if (line.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                if (this.dictionary.translate(word) != null) {
                    System.out.println(this.dictionary.translate(word));
                }
                System.out.println("Word " + word + " was not found");
            } else {
                System.out.println("Unknown command");
            }
        }

    }
}
