
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int count = 1;
        while (count <= size) {
            printSpaces(size-count);
            printStars(count);
            count++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int real = height + (height-1);
        int count = 1;
        int spacesBottom = 0;
        
        while (count <= height) {
            int stars = count + (count-1);
            int spaces = (real-stars)/2;
            printSpaces(spaces);
            printStars(stars);
            count++;
            if (stars == 3) {
                spacesBottom = spaces;
            }
        }
                
        for (int i = 0; i <= 1; i++) {
            printSpaces(spacesBottom);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
