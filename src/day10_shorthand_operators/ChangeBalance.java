package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance is $" + balance);

        double baklava = 22.40;
        System.out.println("baklava is $"+ baklava);

        balance = balance - baklava;
        System.out.println("remaining balance is $" + balance);

    }
}
