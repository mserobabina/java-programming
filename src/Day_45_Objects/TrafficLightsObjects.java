package Day_45_Objects;

public class TrafficLightsObjects {
    public static void main(String[] args) {


        //create traffic light object
        TrafficLights trafficLights = new TrafficLights();

        trafficLights.changeColor("red");

        trafficLights.showColor();
        System.out.println("-------------------");

        TrafficLights trafficLights2 = new TrafficLights();
        trafficLights2.changeColor(("blue"));
        trafficLights2.showColor();
    }
}