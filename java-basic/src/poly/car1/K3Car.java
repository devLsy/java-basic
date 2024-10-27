package poly.car1;

public class K3Car implements Car{

    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }

    @Override
    public void offEnine() {
        System.out.println("K3Car.iffEnine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
