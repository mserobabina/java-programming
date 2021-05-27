package OfficeHours.Methods;

public class MethodTest {
    public static void main(String[] args) {
        methods.methodOne();
        System.out.println(methods.methodTwo());
        String s = methods.methodTwo();
        String s2 = "words";
        System.out.println(methods.methodThree(s2));
    }
}
