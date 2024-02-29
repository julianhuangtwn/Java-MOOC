
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1, sum = 0, count = 0;
        while (num != 0) {
            num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                sum += num;
                count++;
            }
        }
        if (count > 0) {
            System.out.println(1.0 * sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
