package Day31_Array;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums ={100,5,688,8899,34};
        System.out.println(Arrays.toString(nums));

        String [] words = {"java", "R", "SQL", "Python"};

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
