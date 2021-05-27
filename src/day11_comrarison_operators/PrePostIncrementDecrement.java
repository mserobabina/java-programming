package day11_comrarison_operators;

public class PrePostIncrementDecrement {
    public static void main(String[] args) {
        int num = 1;
        num++;
        System.out.println(num);
        ++num;
        System.out.println(num);
        num+=1;
        System.out.println((num));

        int num1 = 4;
        int num2 = ++num1;
        System.out.println(num1);
        System.out.println(num2);

        int num3 = 6;
        int num4 = num1++;
        System.out.println(num3);
        System.out.println(num4);

        int num5 = 7;
        int num6 = num1--;
        System.out.println(num5);
        System.out.println(num6);

    }
}
