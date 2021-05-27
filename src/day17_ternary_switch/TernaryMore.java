package day17_ternary_switch;

public class TernaryMore {
    public static void main(String[] args) {

    int hourlyRate = 50;

    String reply = (hourlyRate>50) ? "accept": "reject";
        System.out.println( "Reply - " +reply);

        String todayClass = "java";
        String teacher =(todayClass.equals("java")) ? "Murodil/Saim": "Nadir";
        System.out.println(teacher);

        boolean isEligibleDrive = true;
        String driving = (isEligibleDrive)?"yes":"no";
        System.out.println(driving+" - You can drive.");

}
}
