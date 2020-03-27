/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }
          
    public boolean isEmpty() {
        if (this.list.size() == 0) {
        return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public String take() {
        int topmostIndex = (this.list.size() - 1);
        String topmost = this.list.get(topmostIndex);
        this.list.remove(topmostIndex);
        return topmost;
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
}
