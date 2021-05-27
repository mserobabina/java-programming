package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you pay for rent this month?");
        int rent = scan.nextInt();
        String month = scan.next();
        System.out.println("I pay $"+ rent+ ".");
        System.out.println("month " + month);
    }
}
