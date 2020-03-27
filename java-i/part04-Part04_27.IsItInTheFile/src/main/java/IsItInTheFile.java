
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.

        try ( Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }

        System.out.println("");

        int count = 0;
        for (String lines : list) {
            if (lines.contains(searchedFor)) {
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found!");
        }

    }
}
