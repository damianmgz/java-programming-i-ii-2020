import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            
            String input = this.scanner.nextLine();
                 
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("add")) {
                System.out.print("To add: ");
                String add = this.scanner.nextLine();
                this.list.add(add);
            }
            
            if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                String remove = this.scanner.nextLine();
                this.list.remove(Integer.valueOf(remove));
            }
            
            if (input.equals("list")) {
                this.list.print();
            }
        }
        
    }
}


