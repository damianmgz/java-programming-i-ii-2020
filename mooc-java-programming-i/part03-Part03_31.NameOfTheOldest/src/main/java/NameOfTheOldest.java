
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ageOldest = 0;
        String nameOldest = "";
        
        while(true) {
            
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            if (Integer.valueOf(parts[1]) > ageOldest) {
                ageOldest = Integer.valueOf(parts[1]);
                nameOldest = parts[0];
            }
            
        }
        
        System.out.println("Name of the oldest: " + nameOldest);



    }
}
