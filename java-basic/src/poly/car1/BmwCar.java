package poly.car1;

public class BmwCar implements Car{

    @Override
    public void startEngine() {
        System.out.println("BmwCar.startEngine");
    }

    @Override
    public void offEnine() {
        System.out.println("BmwCar.offEnine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("BmwCar.pressAccelerator");
    }
}
