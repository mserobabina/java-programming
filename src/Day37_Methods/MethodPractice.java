package Day37_Methods;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi",3,'|'));
    }
    public static String repeatString(String word,int times,char delimiter){
        String retValue = "";
        for (int i=1;i<=times;i++) {
            retValue+=word+delimiter;
        }
        return retValue;
    }
}
