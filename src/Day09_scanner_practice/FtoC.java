package Day09_scanner_practice;

import java.util.Scanner;

public class FtoC {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Fahrenheit: ");


            double F = scan.nextDouble();

            double C = (F - 32)*5/9;
            System.out.println("It is " +C+ " 'C outside now.");
    }
}
