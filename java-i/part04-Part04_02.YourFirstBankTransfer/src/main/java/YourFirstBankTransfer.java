
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mattAccount = new Account("Matthews account", 1000);
        Account damiAccount = new Account("My account", 0);
        
        mattAccount.withdrawal(100);
        damiAccount.deposit(100);
        
        System.out.println(mattAccount);
        System.out.println(damiAccount);
    }
}
