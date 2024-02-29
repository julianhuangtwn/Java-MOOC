import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tax = 0.08;
        int lowerLimit = 100;
        int lowerValue = 5000;
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        
        if (gift < 25000) {
            ;
        } else if (gift <= 55000) {
            tax = 0.1;
            lowerLimit = 1700;
            lowerValue = 25000;
        } else if (gift <= 200000) {
            tax = 0.12;
            lowerLimit = 4700;
            lowerValue = 55000;
        } else if (gift <= 1000000) {
            tax = 0.15;
            lowerLimit = 22100;
            lowerValue = 200000;
        } else {
            tax = 0.17;
            lowerLimit = 142100;
            lowerValue = 1000000;
        }
        
        if (gift < 5000){
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + (lowerLimit + ((gift - lowerValue) * tax)));
        }
    }
}
