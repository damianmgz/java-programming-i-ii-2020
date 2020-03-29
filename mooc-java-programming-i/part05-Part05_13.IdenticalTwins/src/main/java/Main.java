
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        
        if (leo.equals(lily)) {
            System.out.println("Is this quite correct? 1");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct? 2");
        }
        
        Person leo2 = new Person("Leo", date, 62, 9);

        if (leo.equals(leo2)) {
            System.out.println("Quite correct!");
        }

    }
}
