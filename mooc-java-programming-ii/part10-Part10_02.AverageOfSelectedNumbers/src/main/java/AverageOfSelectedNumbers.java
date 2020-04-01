
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String selectAverage = scanner.nextLine();

        if (selectAverage.equals("n")) {
            double average = list.stream()
                    .mapToInt(value -> Integer.valueOf(value))
                    .filter(value -> (value < 0))
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        }

        if (selectAverage.equals("p")) {
            double average = list.stream()
                    .mapToInt(value -> Integer.valueOf(value))
                    .filter(value -> (value > 0))
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
