

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Suitcase suitcase = new Suitcase(100);
        
        suitcase.addItem(new Item("one", 10));
        suitcase.addItem(new Item("two", 20));
        suitcase.addItem(new Item("three", 30));
        
        System.out.println(suitcase.totalWeight());
        suitcase.printItems();
        System.out.println(suitcase.heaviestItem());
    }

}
