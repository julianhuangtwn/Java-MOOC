
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Password?");
        String pass = scan.nextLine();
        
        if (!(pass.equals("Caput Draconis"))) {
            System.out.println("Off with you!");
        } else {
            System.out.println("Welcome!");
        }
        // Write your program here 
    }
}
