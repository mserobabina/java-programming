package Day35_Methods;
import java.util.*;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below
        for (int i = 0; i < nums.length; i++) {


            int count = 0;
            for (int each : nums) {
                if (each == nums[i]) {
                    count++;
                }
            }

                if (count == 1) {
                    System.out.println(nums[i]);
                }

            }
        }
    }
