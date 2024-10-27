package poly.car1;

public class CarMain {

    public static void main(String[] args) {

        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        BmwCar bmwCar = new BmwCar();
        driver.setCar(bmwCar);
        driver.drive();
    }
}
