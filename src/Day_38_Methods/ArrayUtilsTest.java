package Day_38_Methods;

import java.util.*;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] nums= {5,23,1,90};
        ArrayUtils.printArray(nums);
        System.out.println("sum = "+ArrayUtils.sum(nums));
       System.out.println("sum = "+ArrayUtils.sum(new int [] {5,23,1,90, 67, 87}));

       int [] nums2 = {4,1,5,8};
       int num=5;
       boolean found =false;

       for(int each:nums2){
           if (each==num){
               found=true;
               break;
           }
       }




    }
}
