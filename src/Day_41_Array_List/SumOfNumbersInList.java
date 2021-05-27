package Day_41_Array_List;
import java.util.*;
public class SumOfNumbersInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "54", "65"));

            for (int i = 0; i < list.size(); i++) { //[1,2,3]
                int totalSum = 0;
                for (char digit : list.get(i).toCharArray()) {//[1,2,3]
                    totalSum += Integer.parseInt("" + digit);

                }
                list.set(i, "" + totalSum);
            }
            System.out.println(list);


        }
    }

