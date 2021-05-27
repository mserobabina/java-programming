package Day24_Loops;

public class ForLoopsPracticeReverse {
    public static void main(String[] args) {
        //  byte count =5;
        //while(count >=0){
        //     System.out.println("counter = "+ count++);
        //   }
        //   System.out.println("Finished the code");
        int unreadSMS = 10;
        while (unreadSMS >= 0) {
            // System.out.println("I have total " + unreadSMS);

            System.out.println("Reading sms \uD83D\uDCE9" + unreadSMS);
            --unreadSMS;

        }
    }
}
