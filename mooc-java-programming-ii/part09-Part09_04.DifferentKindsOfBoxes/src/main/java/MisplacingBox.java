
import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> list;

    public MisplacingBox() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.list.add(item);
    }

    @Override
    public boolean isInBox(Item comparedItem) {
        return false;
    }

}
