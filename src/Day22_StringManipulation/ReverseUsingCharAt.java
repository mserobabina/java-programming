package Day22_StringManipulation;
import java.lang.*;
import java.util.Scanner;
public class ReverseUsingCharAt {
    public static void main(String[] args) {
        /*String word="java";
        System.out.println(""+word.charAt(0)+word.charAt(1) +word.charAt(2)+word.charAt(3));
        System.out.println(word);

         */

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        int length = txt.length();
        System.out.println(txt.substring(length-3));


    }
}
