package Day_41_Array_List;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        char target = 'a';
        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == target) {
                    count++;
                }
            }
        }

        System.out.println(target + " was found " + count + " times.");
    }

}