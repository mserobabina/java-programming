package Day_45_Objects;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = method8(scan.next(),scan.next(),scan.next());
        System.out.println(s);

        }

    public static String method8(String one,String two,String three) {

       return ""+middle(one)+middle(two)+middle(three);
        }
        public static char middle(String s){
        return s.charAt(s.length()/2);

    }
}