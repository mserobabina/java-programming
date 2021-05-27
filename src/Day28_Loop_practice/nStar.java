package Day28_Loop_practice;
import java.util.*;
public class nStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n:");
        int n = scan.nextInt();

        while(n>0){
            n--;

            System.out.print("*");


        }
    }
}
