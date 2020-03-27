
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager jokes = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface userIntface = new UserInterface(jokes, scanner);
        userIntface.start();
    }
}
