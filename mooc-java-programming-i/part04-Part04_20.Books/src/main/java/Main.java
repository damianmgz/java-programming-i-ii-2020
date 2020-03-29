import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.equals("")) {
                System.out.println("");
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.print("What information to be printed?");
        String infoRequired = scan.nextLine();
        
        if (infoRequired.equals("name")) {
            for (Book book:books) {
                System.out.println(book.getTitle());
            }
        }
        
         if (infoRequired.equals("everything")) {
            for (Book book:books) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear());
            }
        }
        
    }
}
