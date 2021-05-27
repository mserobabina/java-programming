package Day_41_Array_List;
import java.util.*;
public class FourOrLess {
    public static void main(String[] args) {
        //remove in ArrayList
        //remove(0)
        ArrayList <String> list = new ArrayList<>(Arrays.asList("apple","java","tree","cat","animal","shortcut"));
        ArrayList<String> list2 = new ArrayList<>();
        for(String each : list){
            if(each.length()<=4){
                list2.add(each);

            }
        }
        System.out.println(list2);

    }
}
