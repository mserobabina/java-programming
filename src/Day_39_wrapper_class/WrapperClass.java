package Day_39_wrapper_class;

public class WrapperClass {
    public static void main(String[] args) {
        int num=100;
        System.out.println("num = "+num);
        num+=10;
        System.out.println(num);

        Integer n = new Integer(500);
        System.out.println("is n 500 = "+n.equals(500));
        System.out.println(n+300);

        Integer intObject = 1000;
        intObject.equals(500);
        System.out.println(intObject/50);
        System.out.println("*****************************");
        Byte b1 = new Byte((byte)5);
        Byte b2 =10;
        Short sh1=new Short((short)40);
        short sh2=50;
        Integer i1=new Integer(100);
        Integer i2=200;
        Long l1 = new Long(300L);
        Long l2 = 3456L;

        Float f1 = new Float(5.3F);
        Float f2 = 43.5F;
        Double d1=new Double(345.3);
        Double d2=234.5;
        Character ch1 = new Character('Q');
        Character ch2='V';

        Boolean bl1=new Boolean(true);
        Boolean bl2=false;



    }
}
