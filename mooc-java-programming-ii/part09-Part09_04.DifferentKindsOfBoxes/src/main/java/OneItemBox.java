
import java.util.ArrayList;


public class OneItemBox extends Box{
    private ArrayList<Item> list;
    private int capacity;
    
    public OneItemBox() {
        this.list = new ArrayList<>();
        this.capacity = 1;
    }
    
    @Override
    public void add(Item item) {
        if (this.list.size() == 0) {
            this.list.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item comparedItem) {
        for (Item item : this.list) {
            if (item.equals(comparedItem)) {
                return true;
            }
        }
        return false;
    }
}
