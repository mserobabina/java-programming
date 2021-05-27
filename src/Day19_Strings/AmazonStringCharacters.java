package Day19_Strings;

public class AmazonStringCharacters {
    public static void main(String[] args){
        String password ="Abc123";
        if (password.length()>=7){
            System.out.println("Print it: "+ password);
    }
    else{
        System.out.println("Invalid password: "+password);}
    }
}
