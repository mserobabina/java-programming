package Day23_StringManip_Chaining;

public class StringManipulationMethods {
    public static void main(String[] args) {
        String message = "Sender: [Nadir] From Number<2223334444> Message:{Hello, lets code some java}";
        int start = message.indexOf("{");
        int end = message.indexOf("}");
        System.out.println(message.substring(start+1, end));


    }
}
