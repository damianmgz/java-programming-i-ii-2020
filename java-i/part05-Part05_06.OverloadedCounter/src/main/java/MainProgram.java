
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter test = new Counter();
        
        test.decrease();
        System.out.println(test.value());
        
        test.increase();
        System.out.println(test.value());
        
        test.increase(12);
        System.out.println(test.value());
        
        test.decrease(3);
        System.out.println(test.value());
        
        
    }
}
