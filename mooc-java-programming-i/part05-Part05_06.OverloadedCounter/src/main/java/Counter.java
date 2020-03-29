/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dam
 */
public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase(int number) {
        if (number > 0) {
            this.value += number;
        }
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease(int number) {
        if (number > 0) {
            this.value -= number;
        }
    }
    public void decrease(){
        this.decrease(1);        
    }
    
}
