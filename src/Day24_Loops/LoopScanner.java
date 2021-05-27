package Day24_Loops;
import java.util.Scanner;
public class LoopScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number:");
        int numberToStop = scan.nextInt();
        int start = 1;
        while(start<=numberToStop){
            System.out.print(start +" ");
            start++;
        }
    }
}
