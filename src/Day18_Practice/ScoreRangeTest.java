package Day18_Practice;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 60;
        if (score >= 1 && score <= 40) {
            System.out.println(score + ": A");
        }
        else if (score >= 41 && score <= 60){
            System.out.println(score + ": B");
        }
        else if (score >= 61 && score <= 80) {
            System.out.println(score + ": C");
        }else{
            System.out.println(score+ ": Invalid number");


        }
    }
}