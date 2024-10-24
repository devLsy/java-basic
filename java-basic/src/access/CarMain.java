package access;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(100);
        car.showStatus();

        car.accelerate(100);
        car.showStatus();

        car.accelerate(1900);
        car.showStatus();

    }
}
