package Day_40_Array_List;
import java.util.*;
import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        nums.add(10);nums.add(20);nums.add(43);nums.add(34);;nums.add(10);
        System.out.println(nums.isEmpty());
        System.out.println(nums.size());
        System.out.println(nums);

        nums.remove(2);
        System.out.println(nums);

        nums.remove(new Integer(10));
        System.out.println(nums);
        System.out.println("***************************");

        //for loop-iterate through all values and print
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
          //  System.out.println("");
            //for each
            for(int num:nums){
                System.out.println(num+" ");
            }
        }




    }
}
