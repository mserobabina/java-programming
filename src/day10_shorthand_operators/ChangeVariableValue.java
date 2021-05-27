package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        count = 3+10;
        System.out.println("Count is " + count);

        int apples = 2;
        System.out.println(apples);
        apples = apples + 10;
        System.out.println(apples);


        int PizzaSlices = 8;
        PizzaSlices = 8/2;
        System.out.println("Only half of pizza left which is only " + PizzaSlices + " slices.");

        int cents = 244;
        System.out.println("to begin with " + cents);
        cents = cents+400;
        System.out.println("now i have " + cents);
        cents = cents % 100;
        System.out.println(cents+ " is remaining.");
    }
}
