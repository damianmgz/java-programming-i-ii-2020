

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(13);

    }
    
    public static void printFromNumberToOne(int startNumber) {
        int i = startNumber;
        while (i > 0) {
            System.out.println(i);
            i = i - 1;
        }
    }

}
