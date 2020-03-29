
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> cargo;
    private int maxCargoWeight;

    public Hold(int maxCargoWeight) {
        this.cargo = new ArrayList<>();
        this.maxCargoWeight = maxCargoWeight;
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : this.cargo) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(this.totalWeight() + suitcase.totalWeight() > this.maxCargoWeight)) {
            this.cargo.add(suitcase);
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.cargo) {
            suitcase.printItems();  
        }
    }
    

    public String toString() {
        return this.cargo.size() + " suitcases" + "(" + this.totalWeight() + " kg)";
    }

}
