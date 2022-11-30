package sct;
public class Car {
    private final String color;
    private final int maxSpeed;
    public String carInfo(){
        return color + " Max Speed:- " + maxSpeed;
    }
    //This is constructor of Car Class
    Car(String carColor, int speedLimit){
        this.color = carColor;
        this.maxSpeed =speedLimit;
    }
}
