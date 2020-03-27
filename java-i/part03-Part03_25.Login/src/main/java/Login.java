
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        
        if (user.equals("alex") && pass.equals("sunshine")) {
            System.out.println("You have succesfully logged in!");
        } else if (user.equals("emma") && pass.equals("haskell")) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
      
          
    }
}
