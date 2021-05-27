package Day19_Strings;

public class StringExpression {
    public static void main(String[] args) {
        String expUser = "cybertek";
        String expPassword = "ABC123";

        String userName="Cybertek";
        String password = "aBv123";

        if(expUser.equalsIgnoreCase(userName) && expPassword.equalsIgnoreCase(password)){
            System.out.println("Pass user log in");
        }else{
            System.out.println("Fail log in");
        }


    }
}
