package sct;
public class CarTest {
    public static void main(String[] args) {
        sct.Car maruti = new sct.Car("Red", 160);
        sct.Car ferrari = new sct.Car("Yellow", 400);
        System.out.println(maruti.carInfo());
        System.out.println(ferrari.carInfo());
    }
}
