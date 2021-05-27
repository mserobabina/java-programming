package Day36_Methods;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(810);
        checkEligible(790);
        System.out.println(getCreditScore());
        int count = getCreditScore();
        System.out.println("score "+count);

    }
    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {

            System.out.println("you are eligible");

    }else
        {
            System.out.println("you are not eligible");
        }
    }
    public static int getCreditScore() {
        return 800;

    }
}