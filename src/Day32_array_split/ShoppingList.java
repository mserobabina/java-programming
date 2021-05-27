package Day32_array_split;

public class ShoppingList {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println("-------FIND THE INDEX OF 'GLOVES' IN ITEMS ARRAY--------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves were found at index: " + i);
                break;

                //System.out.println(i+"-"+items[i]);
            }
        }

        System.out.println("-------BOOLEAN to true if first 'iPad' is found--------");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExists = true;
                break;

            }
        }
        System.out.println("iPadExists " + iPadExists);
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - \t$" + prices[i] + " - \tItem Id is " + itemIDs[i]);
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("JACKET")) {
                System.out.println("Finally found my fave: " + items[i]+ " for $"+prices[i]);
                break;
            }

        }
    }
}