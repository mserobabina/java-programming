package day12_conditional_statements;
//import java.util.Scanner;
public class ComparisonExample {
    public static void main(String[] args) {
        int speedLimit= 5_5;
        int currentSpeed = 4_5;
        // Scanner scan = new Scanner(System.in);
        System.out.println(currentSpeed>speedLimit);
        boolean inSpeeding = currentSpeed>speedLimit;
        System.out.println("Are you speeding? - " + inSpeeding);
        System.out.println("Current speed is: "+ currentSpeed);
        System.out.println("Speed Limit is: "+ speedLimit);

        currentSpeed +=20;
        boolean inSpeeding2 = currentSpeed>speedLimit;
        System.out.println(currentSpeed);
        System.out.println(speedLimit);
        System.out.println(inSpeeding2);


        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can i afford to go shopping? - " + (accountBalance>=itemPrice));

        double itemPrice2 = 300.99;
        System.out.println("Can i afford to go shopping? - " + (accountBalance>=itemPrice2));

    }
}
