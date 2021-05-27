package day17_ternary_switch;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 30;
        String result = (score > 60) ? "pass" : "fail";
        System.out.println(result);

        String quality = "good";
        int shoes = (quality.equals("good")) ? 100 : 0;
        System.out.println(shoes);

        String quality1 = "bad";
        System.out.println(quality1.equals("good") ? 100 : 0);
        int raiting = quality1.equals("good") ? 100 : 0;
        System.out.println(raiting);




    }
}
