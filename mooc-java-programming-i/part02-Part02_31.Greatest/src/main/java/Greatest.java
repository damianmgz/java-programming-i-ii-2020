
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int comparePair1 = 0;
        int comparePair2 = 0;
        
        if (number1 > number2) {
            comparePair1 = number1;
        } else {
            comparePair1 = number2;
        }
        
        if (comparePair1 > number3) {
            comparePair2 = comparePair1;
        } else {
            comparePair2 = number3;
        }
        
        return comparePair2;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
