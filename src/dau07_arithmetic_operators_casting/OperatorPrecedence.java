package dau07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10+5);
        System.out.println(10-5-3);
        System.out.println(10-(5-3));
        System.out.println(2*3);
        System.out.println(2*3/3);
        System.out.println(20/(2*2));

        System.out.println(10 / 3);
        System.out.println(5 / 2);

        int num1 = 40;
        int num2 = 15;
        System.out.println(num1/num2);

        double d1 = 12;
        double d2 = 3;
        System.out.println(d1/d2);

        int count = 100;
        double dCount = 30.0;
        System.out.println(count / dCount);


    }
}
