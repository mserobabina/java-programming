package OfficeHours.EncapsulationAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four"));
        System.out.println(removeLongStrings(list, 4));

    }

    public static ArrayList<String> removeLongStrings(ArrayList<String> list, int minLength) {
        ArrayList<String> validString = new ArrayList<>();
        for (String word : list) {
            if (word.length() >= minLength) {
                validString.add(word);
            }
        }
        return validString;
    }

    public static ArrayList<String> removeLongStrings2(ArrayList<String> list, int minLength) {
        list.removeIf(each -> each.length() < minLength);
        return list;
    }


}
