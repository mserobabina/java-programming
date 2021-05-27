package Day30_Arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {22,34,5,67,78,60};
        for (int each : data){
            System.out.print(each+" ");

            System.out.println("____________________________");
            for (int i=0;i< data.length;i++){
                System.out.println(data[i]);
                System.out.println("============================");
                System.out.println("Last value:"+ data[ data.length-1]);
            }
        }
    }
}
