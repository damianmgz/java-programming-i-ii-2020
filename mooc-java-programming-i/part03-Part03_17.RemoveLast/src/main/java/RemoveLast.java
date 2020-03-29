
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    
    public static void removeLast(ArrayList<String> stringsRemoval) {
        if (stringsRemoval.size() == 0) {
            return;
        }
        int last = stringsRemoval.size() - 1;
        stringsRemoval.remove(last);
    }

}
