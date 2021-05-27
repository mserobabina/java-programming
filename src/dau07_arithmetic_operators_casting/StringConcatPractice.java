package dau07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args){
        System.out.println("java" +5+3);
        System.out.println("java" + (5+3));
        System.out.println( 5+3+ " java " +5+3);
        System.out.println( 5+(3+ " java "));

        int num1 = 7, num2 = 8;
        System.out.println(num1+num2);
        System.out.println(num1 + "" + num2);


    }
}
