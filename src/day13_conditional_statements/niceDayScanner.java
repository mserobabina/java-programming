package day13_conditional_statements;

import java.util.Scanner;

public class niceDayScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        int temp = scan.nextInt();
        if (temp >= 70) {
            System.out.println("It is a nice day!!!!Please, go outside and enjoy it!!! It is " + temp+ " C");
        } else {
            System.out.println("Oh ..No.. It is too cold out " + temp+ " C");

        }

        System.out.println("Learn how to dance in the rain :)");
    }
}
