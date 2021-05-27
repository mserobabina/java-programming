package Day_41_Array_List;
import java.util.*;
public class SortingLIst {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        nums.add(120);nums.add(1);nums.add(3);
        System.out.println("Before sorting: "+nums);
        Collections.sort(nums);
        System.out.println("After sorting: "+nums);

    }
}
