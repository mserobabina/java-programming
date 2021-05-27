package day12_conditional_statements;

public class conditions_statements {
    public static void main(String[] args) {
        byte age = 25;
        if (age>=18) {
            System.out.println("Eligible to vote! \n->?" +age);
            System.out.println("Age is greater or equal 18 ");
        }else {
            System.out.println("Not eligible to vote");
            System.out.println("Age is less than 18");
        }

    }
}
