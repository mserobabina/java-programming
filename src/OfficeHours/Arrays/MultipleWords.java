package OfficeHours.Arrays;
import java.util.*;
public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer";
        String [] arrWords = words.split(", ");

        System.out.println(Arrays.toString(arrWords));

        for (String eachWord : arrWords) {


            System.out.println(eachWord);

        }
    }
}
