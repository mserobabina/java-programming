package Day28_Loop_practice;

public class FindUniqueCharacters {
    public static void main(String[] args) {
        String word ="javjkka";
       String  unique="";
        for (int i=0;i<word.length();i++){
            if (!unique.contains(word.charAt(i)+"")){
               unique+=word.charAt(i);
            }
        }

        System.out.println(unique);
    }
}
