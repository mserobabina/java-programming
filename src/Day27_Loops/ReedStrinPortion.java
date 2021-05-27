package Day27_Loops;

public class ReedStrinPortion {
    public static void main(String[] args) {
        String list="cat,car,red_car,java, selenium";
        /*
        System.out.println(list.substring(0,3));
        System.out.println(list.substring(1,4));
        System.out.println(list.substring(2,11));

         */

        for (int i=0; i<list.length()-2; i++){
            String part = list.substring(i,i+3);
            System.out.println(list.substring(i, i+3));
        if(part.equals("cat") || part.equals("car")){
            System.out.println("cat or car found");}
        }
    }
}
