package poly.ex3;

public class CarPolyMain1 {

    //다형성을 사용해서 중복을 제거하고 부모타입으로 자식 인스턴스를 받아서 처리
    public static void main(String[] args) {
        Genesis genesis = new Genesis();
        Ferrari ferrari = new Ferrari();
        Lamborghini lamborghini = new Lamborghini();
        Maybach maybach = new Maybach();

        carMove(genesis);
        carMove(ferrari);
        carMove(lamborghini);
        carMove(maybach);
    }
    //부모타입으로 자식 인스턴스를 받는다.
    private static void carMove(Car car) {
        System.out.println("주행 속도 테스트 시작");
        car.move();
        System.out.println("주행 속도 테스트 종료");
        System.out.println("================================");
    }
}
