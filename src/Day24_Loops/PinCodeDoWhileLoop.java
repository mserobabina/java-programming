package Day24_Loops;
import java.util.Scanner;
public class PinCodeDoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int securityPin=1234;
        int pinCode;
        do {
            System.out.println("enter pin code");
            pinCode=scan.nextInt();
        }while(pinCode!=securityPin);
        System.out.println("Welcome to your account");
        }
    }

