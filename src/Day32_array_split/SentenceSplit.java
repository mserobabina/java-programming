package Day32_array_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println(words[0]);
        for (String w:words){
            System.out.println(w);
        }
        String googleResult = "About 1,234,334 results (0.68 sec)";
        String[] results = googleResult.split(" ");
        System.out.println("sec = "+results[3].replace("(",""));
    }
}
