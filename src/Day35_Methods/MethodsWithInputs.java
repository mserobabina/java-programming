package Day35_Methods;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count);
        greetByName ("Saim");
        greetByName("Maria");
        String name ="Aria";
        greetByName(name);

    }
    public static void displayValue(int num){
        System.out.println("value is "+num);

    }
    public static void greetByName(String name){

        System.out.println("hello, "+name);
    }
}
