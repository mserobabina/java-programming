package Day33_Arrays_Practice;
import java.util.*;
public class ArrayWArmUp {
    public static void main(String[] args) {
        String[] names = {"Maria","Sam","Andrea","Mike","Donna", "Nadir"};
        for( String each : names){
            System.out.println(each);
            System.out.println("Happy holidays" +Arrays.toString(names));
        }
    }
}
