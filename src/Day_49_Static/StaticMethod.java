package Day_49_Static;

public class StaticMethod {
    int num = 10;
    static int count =5;
    public static void displayMessage(String message){
        System.out.println("message: "+message);
       // System.out.println("num = "+num);//error num is instance var.static cannot call
        System.out.println("count = "+count);//no error.count is static var

    }
    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    //StaticMethods.instanceMethod();no
    //need to create an object
    public void instanceMethod (){
        System.out.println("Instance method");
        System.out.println("num ");
    }
}
