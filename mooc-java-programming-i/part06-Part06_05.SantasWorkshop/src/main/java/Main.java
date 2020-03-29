import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        
        Package pack = new Package();
        pack.addGift(book);
        System.out.println(pack.totalWeight());
        
        Package pack1 = new Package();
        pack1.addGift(book);
        System.out.println(pack.totalWeight());
    }
}
