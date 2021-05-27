package Day25_Loops_Practice;
import java.util.*;
public class ForLoopScanner {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("enter start and end number");
        int start =scan.nextInt();

        int end =scan.nextInt();
        if(start>end){
            System.out.println("reverse numbering is not supported");
        }
      //  int start = scan.nextInt();
        for(int i =start; i<=end; i++) {

            //int end =0;
            System.out.println(i + " ");
        
        }
    }
}
