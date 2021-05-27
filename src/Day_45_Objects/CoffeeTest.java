package Day_45_Objects;

import java.util.concurrent.Callable;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount is "+myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("Amount after refill is "+myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("Amount after drinking 10% is "+ myCoffee.getAmount());
        myCoffee.setType("Turkish coffee");
        System.out.println("my coffee is "+ myCoffee.getType());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("Coffee1 type is "+coffee1.getType());
        Coffee coffee2 = coffee1;
        System.err.println("coffee2 type reassing "+coffee2.getType());

            }
    }
