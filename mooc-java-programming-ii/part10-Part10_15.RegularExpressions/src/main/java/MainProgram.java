

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        Checker check = new Checker();
        String s = "00:54:37";
        
        System.out.println(check.isDayOfWeek(s));
        System.out.println(check.allVowels(s));
        System.out.println(check.timeOfDay(s));
    }
}
