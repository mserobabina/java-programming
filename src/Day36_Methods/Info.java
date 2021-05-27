package Day36_Methods;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        int[] arr = {14, 1, 84, 97, 1243, 46};
        int total = 0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 != 0){
                total += 5;

            }else{
                total += 10;
            }
        }
        System.out.print(total);

    }
}
