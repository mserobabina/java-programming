package Day_42_Array_List;

import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,67,78));

        List<Integer> uniqueList = getUniqueList(nums);
        System.out.println();
        System.out.println("Unique list is "+uniqueList);
    }

    public static List<Integer> getUniqueList(List<Integer> nums) {
        List<Integer>uniqueList = new ArrayList<>();
        for(int each: nums){
            if(Collections.frequency(nums,each)==2) {
                System.out.println(each + " is in my frequency");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }

}
