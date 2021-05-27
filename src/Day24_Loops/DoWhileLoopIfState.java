package Day24_Loops;
import java.util.*;
public class DoWhileLoopIfState {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
       // System.out.println(random.nextInt(101));
       int guessingNumber = 0;
       int secretNumber = randomNum.nextInt(101);
       do {
           System.out.println("Guess the secret number:");
           guessingNumber = scan.nextInt();
           if (guessingNumber>secretNumber) {
               System.out.println("wrong, number is too large");
           }else if( guessingNumber<secretNumber){
               System.out.println("wrong,your number is too small");
           }
       }while (secretNumber!=guessingNumber);
        System.out.println("Congratulations you have found the secret number"+secretNumber);
    }
}
