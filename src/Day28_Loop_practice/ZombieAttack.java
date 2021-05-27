package Day28_Loop_practice;
import java.util.*;
public class ZombieAttack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int dayCount = 0;

        if (inhabitants != 0) {
            do {
                System.out.println("Day " + dayCount + " [" + inhabitants + "]");
                dayCount++;
                inhabitants = inhabitants / 2;
            } while (inhabitants > 0);
            System.out.println("---- EXTINCT ----");
        } else
            System.out.println("---- EXTINCT ----");

    }
}
