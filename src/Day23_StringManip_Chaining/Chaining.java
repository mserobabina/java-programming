package Day23_StringManip_Chaining;

import java.util.Locale;

public class Chaining {
    public static void main(String[] args) {
        String word = "wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());


        String city ="chicago";
        System.out.println(city.substring(0,1).toLowerCase()+city.substring(1).toLowerCase());
    }
}
