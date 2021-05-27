package Day15_Logical_Operators;

public class seasonSelector {
    public static void main(String[] args){
        char g = 'F';

        if (g=='A'){
            System.out.println("Great Job");
        }
        else if (g=='B'){
            System.out.println("Good job. Put more effort next semester");
        }
        else if (g=='C'){
            System.out.println("I'd recommend a tutor.");
        }
        else if (g=='D'){
            System.out.println("You really need to work hard to catch up.");
        }else {
            System.out.println("Are you studying at this school? The grade does not match our school system.");
        }

        char grade = 'a';
        if (grade=='A' || grade =='B' || grade == 'C'){
            System.out.println("pass with grade - " +grade);
        }
        else if (grade=='D'){
            System.out.println("Qualify for retake");
        }else if (grade=='E'){
            System.out.println("Failed");
        }else {
            System.out.println("Keep studying. Knowledge is power!");
        }

    }
}
