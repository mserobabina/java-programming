package Day15_Logical_Operators;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("! true = "+(!true));
        System.out.println("! false = "+ (!false));

        int age = 8;
        if(!(age>7)){
            System.out.println("Use car seat");
        }else {
            System.out.println("Use normal seat");
        }
    }
}
