package Day_40_Array_List;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        System.out.println("size = "+nums.size());

        //reading from arraylist
        System.out.println("index 1 = "+nums.get(1));
        //remove element at index 1
        nums.remove(1);
        System.out.println(nums);
    }
}