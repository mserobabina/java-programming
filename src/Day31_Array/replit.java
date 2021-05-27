package Day31_Array;
import java.util.*;
public class replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int [] newArr = new int[nums.length*2];
        for(int i = 0;i<nums.length*2;i++){

            if (i==newArr.length-1){
                newArr[newArr.length-1]= nums[nums.length-1];

            }else{
                newArr[i] = 0;
            }


        }
        System.out.println(Arrays.toString(newArr));

    }
}
