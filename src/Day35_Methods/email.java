package Day35_Methods;

import java.util.Locale;

public class email {
    public static void main(String[] args) {
        myEmail("Maria Serobabina","Amazon");

    }
    public static void myEmail(String name, String domain){
        String email = name+"@"+domain+".com";
        System.out.println("Email: "+ email.replace(" ","_").toLowerCase());
    }
}
