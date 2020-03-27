
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int pointsGiven = Integer.valueOf(scan.nextLine());
        
        if (pointsGiven < 0) {
            System.out.println("Grade: impossible!");
        } else if (pointsGiven < 50) {
            System.out.println("Grade: failed");
        } else if (pointsGiven < 60) {
            System.out.println("Grade: 1");
        } else if (pointsGiven < 70) {
            System.out.println("Grade: 2");
        } else if (pointsGiven < 80) {
            System.out.println("Grade: 3");
        } else if (pointsGiven < 90) {
            System.out.println("Grade: 4");
        } else if (pointsGiven <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
        

    }
}
