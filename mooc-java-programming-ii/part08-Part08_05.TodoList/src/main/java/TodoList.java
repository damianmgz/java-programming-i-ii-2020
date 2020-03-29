import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void remove(int number) {
        this.list.remove(number - 1);
    }
    
    public void print() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i+1) + ": " + this.list.get(i));
        }
    }
    
}
