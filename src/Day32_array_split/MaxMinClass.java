package Day32_array_split;
import java.util.*;
public class MaxMinClass {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        double maxPrice = prices[0];
        int index = 0;
        for (int i = 1; i < prices.length; i++) {
            if (maxPrice < prices[i]) {
                maxPrice = prices[i];
                index = i;

            }
        }
            System.out.println("We found the most expensive item: " + " $" + maxPrice+", index: "+index);



       // System.out.println(Arrays.toString(items));

    }
}
