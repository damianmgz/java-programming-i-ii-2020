import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> packing;

    public Package() {
        this.packing = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.packing.add(gift);
    }
    
    public int totalWeight() {
        int total = 0;
        for (Gift gift:this.packing) {
            total += gift.getWeight();
        }
        return total;
    }
    
    
    
}
