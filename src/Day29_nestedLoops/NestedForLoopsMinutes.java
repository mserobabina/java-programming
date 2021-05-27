package Day29_nestedLoops;
import java.util.*;
public class NestedForLoopsMinutes {
    public static void main(String[] args)  throws InterruptedException {

        for (int minutes = 0; minutes <= 5; minutes++) {
            System.out.println("  \nminutes: " + minutes);
            for (int sec = 0; sec <= 59; sec++) {
                System.out.println(minutes+": "+sec);
               Thread.sleep(1000);
            }
        }
    }
}