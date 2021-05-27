package Day37_Methods;

import java.util.Arrays;

public class overloadMin {
    public static void main(String[] differentName) {
        System.out.println("hello from real main method");
        main(10);
        Arrays.toString(differentName);
    }

    /**
     * overload main method: same name+dif param
     * JDK doesnt not look for this one to run
     */
    public static void main (int num){
        System.out.println("num = "+num);

    }
}
