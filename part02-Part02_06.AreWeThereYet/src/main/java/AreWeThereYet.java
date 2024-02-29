
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = 0;
        while (str != 4) {
            System.out.println("Give a number:");
            str = Integer.valueOf(scanner.nextLine());
        }
    }
}
