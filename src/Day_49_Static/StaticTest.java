package Day_49_Static;

public class StaticTest {
    static String word = "java";
    public static void main(String[] args) {
        //1. can only be called using className
        StaticMethod.displayMessage("Wooden spoon");
        //1. instance meth needs an object
        StaticMethod stm = new StaticMethod();
       // stm.InstanceMethod();
        //2. static method can only access other static var and methods
        System.out.println(word);
    }
}
