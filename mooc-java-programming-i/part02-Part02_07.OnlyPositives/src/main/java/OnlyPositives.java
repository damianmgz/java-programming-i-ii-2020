
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scan.nextLine());
            
            if(number<0) {
                System.out.println("Unsuitable number");
                continue;
            } 
            
            if (number==0) {
                break;
            } 
            
            System.out.println(number*number);
            
        }
   
            
    }    
}

