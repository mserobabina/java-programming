package Day24_Loops;
import java.util.Scanner;
public class AnotherScannerLoopGiveMe$5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Give me $5");
        int dollars = scan.nextInt();
        while(dollars !=5){
            System.out.println("Give me $5");
            dollars=scan.nextInt();
        }
        System.out.println("Thank you for $5");
    }
}
