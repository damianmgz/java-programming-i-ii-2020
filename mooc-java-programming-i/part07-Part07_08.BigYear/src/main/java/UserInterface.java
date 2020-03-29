
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdRegister register;

    public UserInterface(Scanner scanner, BirdRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start() {

        while (true) {
            System.out.print("?");
            String input = this.scanner.nextLine();

            if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = this.scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = this.scanner.nextLine();
                register.add(name, latinName);

            }

            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String search = this.scanner.nextLine();
                int count = 0;
                for (Bird bird:this.register.getRegister()) {
                        if (bird.getName().equals(search)) {
                            bird.addObservation();
                            count++;
                        }
                }
                if (count == 0) {
                    System.out.println("Not a bird!");
                }
            }

            if (input.equals("All")) {
                for (Bird bird : this.register.getRegister()) {
                    System.out.println(bird);
                }
            }

            if (input.equals("One")) {
                System.out.println("Bird? ");
                String search = this.scanner.nextLine();
                for (Bird bird : this.register.getRegister()) {
                    if (bird.getName().equals(search)) {
                        System.out.println(bird);
                    }
                }
            }

            if (input.equals("Quit")) {
                break;
            }

        }
    }

}
