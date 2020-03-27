

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(13);

    }
    
    public static void printUntilNumber(int startNumber) {
        int i = 1;
        while (i <= startNumber) {
            System.out.println(i);
            i++;
        }
    }


}
