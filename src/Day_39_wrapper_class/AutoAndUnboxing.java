package Day_39_wrapper_class;

public class AutoAndUnboxing {
    public static void main(String[] args) {
        //auto-boxing
        int n1 = 500;
        Integer n2 = n1;
        Integer n3=234;
        System.out.println(n1+" "+n2+" "+n3+" ");
        //un-boxing
        Double d1=new Double(100.2);
        double d2=d1;
        double d3 = new Double(342.3);
        System.out.println(d1+" "+d3);

    }
}
