
import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> list;
    private double capacity;

    public Box(double capacity) {
        this.list = new ArrayList<>();
        this.capacity = capacity;
    }

    public double weight() {
        double weight = 0.0;
        for (Packable item : this.list) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if (packable.weight() <= (this.capacity - this.weight())) {
            this.list.add(packable);
        }
    }

    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + this.weight() + " kg";
    }
}
