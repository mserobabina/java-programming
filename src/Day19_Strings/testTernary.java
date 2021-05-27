package Day19_Strings;
import java.util.Scanner;
public class testTernary {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
*/
        //WRITE YOUR CODE HERE:
        String str ="";
        int check =132;
        //double decimal=13.142;
        if (check%2==0) {
            str += check;
            if (check % 5 == 9) {
                str += "132";


            } else {
                str = "500";


            }
        }else{
            str +="123";
        }
        //String str =check?"5": "10";

        System.out.println(str);
    }
}
