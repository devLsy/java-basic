package poly.ex6;

public class CarMain {

    public static void main(String[] args) {

        K3 k3 = new K3();
        Tesla tesla = new Tesla();
        Grandular grandular = new Grandular();

        carTest(k3);
        carTest(tesla);
        carTest(grandular);

        elecTest(tesla);
    }

    private static void carTest(AbstractCar car) {
        System.out.println("테스트 시작");
        car.calculateSpeed();
        System.out.println("테스트 종료");
        System.out.println("======================");
    }

    private static void elecTest(InterfaceElecTricCar elecTricCar) {
        System.out.println("전기차 테스트 시작");
        elecTricCar.charge();
        System.out.println("전기차 테스트 종료");
    }
}
