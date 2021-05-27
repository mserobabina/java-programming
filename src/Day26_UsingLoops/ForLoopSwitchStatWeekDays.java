package Day26_UsingLoops;

public class ForLoopSwitchStatWeekDays {
    public static void main(String[] args) {
       /*  int day = 1;

        switch(day){
            case 1:
                System.out.println(day+" - Monday! ");
                break;
            case 2:
                System.out.println(day+" - Tuesday! ");
                break;
            case 3:
                System.out.println(day+" - Wednesday! ");}
                break;

         */


        for (int day = 1; day <= 10; day++) {
            if (day == 1) {
                switch (day) {
                    case 1:
                        System.out.println(day + " - Monday! ");
                      //  break;
                    case 2:
                        System.out.println(day + " - Tuesday! ");
                        break;
                    case 3:
                        System.out.println(day + " - Wednesday! ");
                        break;
                    default:
                        System.out.println(day + " -No such a day!");
                        break;
                }
            }
        }
    }
}



