
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myFirstAccount = new Account("Damian First Account", 100.0);
        
        myFirstAccount.deposit(20.0);
        
        System.out.println(myFirstAccount);
    }
}
