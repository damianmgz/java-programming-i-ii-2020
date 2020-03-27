
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> proof = new ArrayList<>();
        
        proof.add(3);
        proof.add(2);
        proof.add(6);
        proof.add(-1);
        proof.add(5);
        proof.add(1);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(proof, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(proof, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number: numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    
}
