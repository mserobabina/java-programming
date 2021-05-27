package Day33_Arrays_Practice;

public class ForLoopWith_2_Variables {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i <= 4 && j <= 5; i++, j++) {
            System.out.println("i= " + i + "; j= " + j);
        }
        // another way
        System.out.println("*********************");
        for (int i = 1, j = 5; j >= 0; i++, j--) {
            System.out.println("i = " + i + " j = " + j);
        }
        System.out.println("*********************");
        for (int i = 1, j = 5, c = 3; j >= 0; i++, j--,c++) {
            System.out.println("i = " + i + "; j = " + j + "; c= " + c);
        }
    }
}