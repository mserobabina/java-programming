package Day_46_Encapsulation;

public class car_example {
    private String model;
    private int year;
    private int millage;

    //setter method for model
    public void setModel(String carModel){

        model = carModel;
    }
    public String getModel(){

        return model;
    }
    //setter for year
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
}
    public void setMillage(int millage){
        this.millage = millage;
    }
    public int getMillage(){
        return millage;
    }

    @Override
    public String toString() {
        return "car_example{" +
                "model='" + model + '\'' +
                '}';
    }
}
