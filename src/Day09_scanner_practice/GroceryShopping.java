package Day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter milk price: ");
        double price1 = scan.nextDouble();

        System.out.println("Enter cucumber price: ");
        double price2 = scan.nextDouble();

        double totalPrice = price1 + price2;
        System.out.println("Total Price is $"+ totalPrice);
    }
}
