package Day35_Methods;
import java.util.*;
public class quiz1 {
    public static void main(String[] args) {
        //  int n = 0;
        String[] days = {"house", "shed", "slide", "zebra", "park", "garden"};
        for (String s : days) {
            switch (s.charAt(1)) {
                case 'h':
                    System.out.println(1);
                    //case"sun":
                    //   n-=1;
                    break;
                case 'a':
                    System.out.println(2);
                case 's':
                    System.out.println(3);
                    break;
                case 'o':
                default:
                    System.out.println(4);
                case 'p':
                    System.out.println(5);
                    break;

                //n++;
                case 'z':
                    System.out.println(6);
                case 'l':
                    break;
                case 'g':
                    System.out.println(7);

            }
        }
    }
}



