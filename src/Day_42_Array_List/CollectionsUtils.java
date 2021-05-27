package Day_42_Array_List;
import java.util.*;
public class CollectionsUtils {
    public static void main(String[] args) {
        List<Character>letter=new ArrayList<>();
        letter.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
        System.out.println("size = "+letter.size());

        Collections.reverse(letter);
        System.out.println("reversed ="+letter);
        System.out.println("How many 'a' in array "+Collections.frequency(letter, 'a'));


        System.out.println("max = "+Collections.max(letter));
        System.out.println("min = "+Collections.min(letter));

        Collections.replaceAll(letter,'a','u');
        Collections.reverse(letter);
        System.out.println("Result = "+letter);
        Collections.sort(letter);
        System.out.println("sort = "+letter);
        System.out.println("---------------------------------------------------------------");

        //Integers
        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 0, 1, 5, 5 ,5 ,5);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);

        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOf1s);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("shuffle = "+nums);
    }
}
