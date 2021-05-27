package Day_41_Array_List;
import java.util.*;
public class targetWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java","html","javascript","java","word"));
        String target="java";
        int count=0;
        for(String word:words){
            if(word.equals(target)){
                count++;
            }
        }
        System.out.println(target+" was found "+count+" times.");
    }
}
