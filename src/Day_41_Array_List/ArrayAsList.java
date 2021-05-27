package Day_41_Array_List;

import Day31_Array.ArraysUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArrayAsList {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList(Arrays.asList(23, 1, 34, 5, 654));
        System.out.println("nums = " + nums);
        nums.add(100);
        System.out.println(nums);
        List<Double> nums1 = new ArrayList(Arrays.asList(3, 5, 6, 78));
        System.out.println("new num list: " + nums1);
        nums1.remove(0);
        System.out.println("after a value was removed: " + nums1);


        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi","sprite","ginger ale"));
        System.out.println("drinks with caffeine: " + drinksWithCaffeine);
        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("coffee")) {
                caffeineAmount = 150;
                System.out.println(drink + " -----> " + caffeineAmount);
            } else if (drink.equals("tea") || drink.equals(("coke"))) {
                caffeineAmount = 120;
                System.out.println(drink + " -----> " + caffeineAmount);
            } else{
                caffeineAmount=90;
                System.out.println(drink + " -----> " + caffeineAmount);
            }
        }
        for(String drink:drinksWithCaffeine){

            switch(drink){
                case "monster": case"red bull": case"coffee":
                    caffeineAmount = 150;
                    System.out.println(drink+" ------> "+caffeineAmount);
                    break;
                case "tea": case "coke": case "pepsi":
                    caffeineAmount = 80;
                    System.out.println(drink+" ------> "+caffeineAmount);
                    break;
            }
        }
        System.out.println("--------------------------------------------");
        drinksWithCaffeine.forEach(drink-> System.out.println(drink.toUpperCase()));
        drinksWithCaffeine.forEach(drink->{
            System.out.println("this is forEach block: "+drink);
        });
    }
}