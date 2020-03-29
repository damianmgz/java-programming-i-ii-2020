
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    public double maxValue() {
        double maxValue = 0;
        for (Double line : list) {
            if (maxValue < line) {
                maxValue = line;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (this.list.size() == 0) {
            return 0;
        }
        double minValue = 999999999999.99;
        for (Double line : list) {
            if (minValue > line) {
                minValue = line;
            }
        }
        return minValue;
    }
    
    public double average() {
        double sum = 0.0;
        int count = 0;
        for (Double line : list) {
            sum += line;
            count++;
        }
        return (sum / count);
    }
    
    @Override
    public String toString() {
        return this.list.toString();
    }
}
