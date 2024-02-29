
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int max = 0;
        if (number1 > number2) {
            max = number1;
            if (number1 < number3) {
                max = number3;
            }
        } else {
            max = number2;
            if (number2 < number3) {
                max = number3;
            }
        }
        
        return max;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
