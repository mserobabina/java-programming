package Day37_Methods;

public class overloading {
    public static void main(String[] args) {
        overloading.sum(10,5,8);
    }
    public static void sum(int num1, int num2) {
        System.out.println("Result 1,2= " + (num1 + num2));
    }

    public static void sum(int num1, int num2, int num3) {
        System.out.println("Result 1,2,3= " + (num1 + num2 + num3));

    }

    public static void sum(double num1, double num2) {
        System.out.println("Result double 1,2= " + (num1 + num2));
    }
}