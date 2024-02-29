
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1, sum = 0;
        while (num != 0) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            if (num < 0) {
                sum++;
            }
        }
        System.out.println("Number of negative numbers: " + sum);
    }
}
