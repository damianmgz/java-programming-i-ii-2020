import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit) {
        return this.storage.getOrDefault(unit, new ArrayList<>());
    }
    
    public void remove(String unit, String item) {
        this.storage.get(unit).remove(item);
        if (this.storage.get(unit).isEmpty()) {
            this.storage.remove(unit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String key : this.storage.keySet()) {
            if (this.storage.get(key).size() != 0) {
                storageUnits.add(key);
            }
        }
        return storageUnits;
    }
}
