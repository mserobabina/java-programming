package Day34_Void_Methods;

public class FirstMethod {
    public static void main(String[] args){
        displayMessage();//call the method
        displayMessage();
        displayMessage();
        for (int i=1; i<=100;i++){
            System.out.println(i+" - ");
            displayMessage();
        }
    }
//custom reusable method
    public static void displayMessage(){
        System.out.println("Hello World");

    }
}
