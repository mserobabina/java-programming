package Day19_Strings;

import java.util.Locale;

public class startEndCases {
    public static void main(String[] args) {
        String companyName ="Google";
        if (companyName.endsWith("le")){
            System.out.println("Name: "+ companyName);
        }else {
            System.out.println("invalid entry: "+ companyName);
        }
    }

}
