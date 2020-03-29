import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debtRegister;

    public IOU() {
        this.debtRegister = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.debtRegister.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.debtRegister.getOrDefault(toWhom, 0.0);
    }
        
}
