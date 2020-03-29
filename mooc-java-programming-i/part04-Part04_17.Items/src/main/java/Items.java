
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
             
        while(true) {
            System.out.print("Name: ");
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("");
                break;
            }
            items.add(new Item(input));
            
        }
      
        for (Item item:items) {
            System.out.println(item);
        }
    }
}
