
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String fileRequired = scanner.nextLine();
        
        try ( Scanner reader = new Scanner(Paths.get(fileRequired))) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }

    }
}
