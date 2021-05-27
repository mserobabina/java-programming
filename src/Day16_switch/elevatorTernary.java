package Day16_switch;

public class elevatorTernary {
    public static void main(String[] args) {
        int floorNum = 4;
        switch(floorNum){
            case 1:
                System.out.println("Floor #"+floorNum+" was entered");
                break;
            case 2:
                System.out.println("Floor #"+floorNum+" was entered");
                break;
            case 3:
                System.out.println("Floor #"+floorNum+" was entered");
                break;
            default:
                System.out.println("Invalid floor # was entered - "+ floorNum);
        }
    }
}
