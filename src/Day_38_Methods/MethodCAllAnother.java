package Day_38_Methods;

public class MethodCAllAnother {
    public static void main(String[] args) {
        start();
        countinue();
        end();


    }
        public static void start(){
            System.out.println("Start");
            countinue();
        }
        public static void countinue(){
            System.out.println("countinue");
            end();
        }
    public static void end(){
        System.out.println("end");
    }
}
