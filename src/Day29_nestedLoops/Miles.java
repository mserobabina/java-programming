package Day29_nestedLoops;

public class Miles {
    public static void main(String[] args) {
        for (int miles = 1; miles <= 5; miles++) {
            for (int steps = 1; steps <= 10; steps++) {
                System.out.print("**");

            }
            System.out.println();
        }

        for (int st = 1; st <= 10; st++) {
            for (int w = 1; w <= st; w++) {

                System.out.print("*");
            }

            System.out.println();

        }

    }
}




