package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args){
        int weather = 4;
        if (weather==1){
            System.out.println("It sunny out, enjoy your day!");
        }
        else if (weather==2){
            System.out.println("Its runny out, stay home and play with Java!");
        }
        else if (weather==3){
            System.out.println("Its snowy, go play in snow!");
        }else{
            System.out.println("You are boring!");
        }
    }
}
