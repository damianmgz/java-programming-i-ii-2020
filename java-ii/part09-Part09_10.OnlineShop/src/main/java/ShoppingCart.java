import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> list;

    public ShoppingCart() {
        this.list = new HashMap<>();
    }
    
    public void add(String product, int price) {
        this.list.putIfAbsent(product, new Item(product, 0, price));
        this.list.get(product).increaseQuantity();
    }

    public int price() {
        int price = 0;
        for (Item item : this.list.values()) {
            price += item.price();
        }
        return price;
    }
    
    public void print() {
        for (Item item : this.list.values()) {
            System.out.println(item.toString());
        }
    }
}
