package poly.ex6;

public class Tesla extends AbstractCar implements InterfaceElecTricCar{

    @Override
    public void calculateSpeed() {
        System.out.println("시속 100km");
    }

    @Override
    public void charge() {
        System.out.println("테슬라 전기차를 충전합니다.");
    }
}
