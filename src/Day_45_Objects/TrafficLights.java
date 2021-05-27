package Day_45_Objects;

public class TrafficLights {
    String color;
    //read only method
    public void showColor(){
        System.out.println("Current color is "+color);

    }
    //this method updates the value
    public void changeColor(String newColor){
        System.out.println("Changing color to "+newColor);
        color = newColor;
    }
}
