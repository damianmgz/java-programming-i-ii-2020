
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> hash = new HashMap<>();
        
        hash.put("matthew", "matt");
        hash.put("michael", "mix");
        hash.put("arthur", "artie");
        
        System.out.println(hash.get("matthew"));
        
    }

}
