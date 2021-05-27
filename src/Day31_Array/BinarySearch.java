package Day31_Array;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {34,45,56,78,23,56,1};
        System.out.println(Arrays.binarySearch(nums,34));
        System.out.println(Arrays.binarySearch(nums,24));
        System.out.println(Arrays.binarySearch(nums,100));
        System.out.println(Arrays.binarySearch(nums,-4));

        if (Arrays.binarySearch(nums,12345)>=0 ){
            System.out.println(" present in array");
        }else{
            System.out.println("It is not presented");
        }
    }
}
