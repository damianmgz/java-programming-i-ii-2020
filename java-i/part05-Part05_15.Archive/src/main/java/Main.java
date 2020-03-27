
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //set an ArrayList to act as an archive to store items
        ArrayList<Item> archive = new ArrayList<>();
        
        //start asking for user input
        while (true) {
            //store the item identifier, exits if empty string
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.equals("")) {
                break;
            }
            
            //store item name, exits if empty string
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            //create a new object from class Item, with the previous entered identifier and name
            Item item = new Item(id, name);
            
            //add this new object to the archive list if it is not already on the list
            if(!(archive.contains(item))) {
                archive.add(new Item(id, name));
            }            
            
        }
        
        //Check how many items are there on the archive list
        //System.out.println("Size = " + archive.size());
        
        //print all of the items on the archive, with the format identifier:name
        for (Item item:archive) {
            System.out.println(item.toString());
        }

    }
}
