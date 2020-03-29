
public class Item {
    private String item;
    private int quantity;
    private int unitPrice;

    public Item(String item, int quantity, int unitPrice) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return this.quantity * this.unitPrice;
    }
    
    public void increaseQuantity() {
        this.quantity++;
    }
    
    @Override
    public String toString() {
        return this.item + ": " + this.quantity; 
    }
}
