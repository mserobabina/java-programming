package Day15_Logical_Operators;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName1 = "Hair pin";
        String itemName2 = "Wooden spoon";
         if (onSale && freeShipping  && itemName1.equals("Hair pin") && itemName2.equals("Wooden spoon")) {
             System.out.println(("Adding to your shopping list - " + itemName1 +" and " +itemName2));
         }else {
             System.out.println("Continue shopping for - "+ itemName1+" and "+itemName2);
         }

    }
}
