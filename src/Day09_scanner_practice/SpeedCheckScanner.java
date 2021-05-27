package Day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckScanner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is speed limit? ");
        int speedLimit = scan.nextInt();
        System.out.println("Are you driving over the limit?");
        System.out.println("Yes :) ");
        System.out.println("What is you current speed? ");
        int currentSpeed = scan.nextInt();
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("which is " + overTheLimit + "mph over the limit.");
        System.out.println("You are driving too fast. Please, slow down!");


    }
}
