
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1, sum = 0, count = 0;
        while (num != 0) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            sum += num;
            count++;
           
        }
        System.out.println("Number of numbers: " + --count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
