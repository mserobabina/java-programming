package Day26_UsingLoops;

public class ForLoopCountMatches {
    public static void main(String[] args) {
        char letter = 'a';
        int count = 0;
        String word = "java";
        for(int i = 0; i<word.length(); i++){
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("There are " +count+ " " + letter+" letters in "+word);
    }
}
