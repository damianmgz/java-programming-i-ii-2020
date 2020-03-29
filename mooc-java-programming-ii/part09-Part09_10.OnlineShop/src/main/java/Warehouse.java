
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        return this.prices.getOrDefault(product,-99);
    }
    
    public int stock(String product) {
        return this.stocks.getOrDefault(product,0);
    }
    
    public boolean take(String product) {
        if (this.stocks.containsKey(product)) {
            int stock = this.stocks.get(product);
            if (stock > 0) {
                stock--;
                this.stocks.replace(product, stock);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        return this.prices.keySet();
    }
}
