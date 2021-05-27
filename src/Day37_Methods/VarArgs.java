package Day37_Methods;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
    }
    public static void addNumbers(int...nums){
        int sum = 0;
        for(int n:nums){
            sum+=n;
        }
        System.out.println("sum = "+sum);
    }
}
