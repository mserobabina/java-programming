package Day28_Loop_practice;
import java.util.*;
public class columns {
    public static void main(String[] args) throws InterruptedException {
        String word = "i love java";
        for (int i = 0; i <word.length(); i++) {
            for (int j = i; j<word.length();j++) {
                System.out.print(word.charAt(j)+" ");
            }

            System.out.println(" ");
            Thread.sleep(1000);
        }

    }
}
