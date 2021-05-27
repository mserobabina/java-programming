package Day21_String_Manipulations;

public class FirstLastTest {
    public static void main(String[] args) {
        String word = "MOM";
       /* char first = word.charAt(0);
        char second = word.charAt(2);
        if(first==second) {
            System.out.println("First and last match");
        }else{
            System.out.println("not matching");

        */
        char firstL=word.charAt(0);
        char lastL = word.charAt(word.length()-1);
        System.out.println(firstL+""+lastL);
       // System.out.println(lastL);
        //System.out.println(lastL);
        //System.out.println(word);

        }

}
