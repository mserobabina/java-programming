package Day09_scanner_practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int result = number1 + number2;
        System.out.println(result);

    }
}
