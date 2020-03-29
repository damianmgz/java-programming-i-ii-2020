import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();
    }
    
    public void add(String task) {
        this.toDo.add(task);
    }
    
    public void print() {
        String print = "";
        for (String task:this.toDo) {
            print = print + (this.toDo.indexOf(task) + 1) + ": " + task + "\n";
        }
        System.out.print(print);
    }
    
    public void remove(int number) {
        this.toDo.remove(number -1);
    }
}
