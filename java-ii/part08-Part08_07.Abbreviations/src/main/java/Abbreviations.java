
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> list;

    public Abbreviations() {
        this.list = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.list.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.list.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return this.list.get(abbreviation);
    }
}
