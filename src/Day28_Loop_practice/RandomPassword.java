package Day28_Loop_practice;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ASDDFGGU&^^&&*((LLKJHB >?????UYTT";
        Random random = new Random();
        String password = "";

        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(30);
          System.out.print(source.charAt(index));
            password+=source.charAt(index);
          //  System.out.println(random.nextInt(source.length()));
        }
//main(null);
        System.out.println("\nYour password: "+password);
    }
}