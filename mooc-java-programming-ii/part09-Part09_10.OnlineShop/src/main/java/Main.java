import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);
        
        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
