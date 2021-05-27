package Day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate: ");


        double hourlyRate = scan.nextDouble();

        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12; //weeklyPay * 4;< might not be accurate
        double annualPay = monthlyPay * 12;
        System.out.println(weeklyPay);
        System.out.println(monthlyPay);
        System.out.println(annualPay);
    }

}
