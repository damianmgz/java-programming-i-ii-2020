import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String line = this.scanner.nextLine();
            
            if (line.equals("stop")) {
                break;
            }
            
            if (line.equals("add")) {
                System.out.print("To add: ");
                this.todoList.add(this.scanner.nextLine());
            }
            
            if (line.equals("list")) {
                this.todoList.print();
            }
            
            if (line.equals("remove")) {
                System.out.print("Which one is removed? ");
                this.todoList.remove(Integer.valueOf(this.scanner.nextLine()));
            }
            
        }
    }
}
