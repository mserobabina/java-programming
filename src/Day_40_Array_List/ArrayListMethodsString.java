package Day_40_Array_List;
import java.util.*;
import java.util.ArrayList;
public class ArrayListMethodsString {
    public static void main(String[] args) {
    List<String> shoppingList = new ArrayList<>();
        System.out.println(shoppingList.isEmpty());
        if (shoppingList.isEmpty()) {
            System.out.println("Keep coding");
        }else{
            System.out.println("List is not empty");
        }
        shoppingList.add("mask"); shoppingList.add("book");shoppingList.add("dress");shoppingList.add("shoes");shoppingList.add("cat");
        if (shoppingList.isEmpty()) {
            System.out.println("Keep coding");
        }else{
            System.out.println("List is not empty");
            System.out.println("shoes are in my list? "+shoppingList.contains("shoes"));
            System.out.println(shoppingList.remove("shoes"));
            System.out.println(shoppingList);
            System.out.println("Done shopping, go back to work");
            shoppingList.clear();//list is cleared
        }
        }


}
