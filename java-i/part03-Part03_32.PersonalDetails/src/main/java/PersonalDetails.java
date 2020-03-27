
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int lengthLongest = 0;
        String nameLongest = "";
        
        double average = 0;
        int sum = 0;
        int count = 0;
        
        while(true) {
            
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            if (parts[0].length() > lengthLongest) {
                lengthLongest = parts[0].length();
                nameLongest = parts[0];
            }
            
            sum += Integer.valueOf(parts[1]);
            count++;
            
        }
        
        average = (double) sum / count;
        
        System.out.println("Longest name: " + nameLongest);
        System.out.println("Average of the birth years: " + average);


    }
}
