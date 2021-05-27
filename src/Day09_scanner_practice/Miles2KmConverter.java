package Day09_scanner_practice;

import java.util.Scanner;


public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles: ");


        double miles = scan.nextDouble();

        double km = miles * 1.6;
        System.out.println("Which is " +km+ " km.");
    }
}

