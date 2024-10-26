package poly.ex3;

public class CarMain1 {
    //다형성 사용하지 않은 코드
    public static void main(String[] args) {
        //각각 타입으로 인스턴스를 받음
        Genesis genesis = new Genesis();
        Ferrari ferrari = new Ferrari();
        Lamborghini lamborghini = new Lamborghini();
        Maybach maybach = new Maybach();

        //중복 코드
        System.out.println("주행 속도 테스트 시작");
        genesis.move();
        System.out.println("주행 속도 테스트 종료");

        System.out.println("주행 속도 테스트 시작");
        ferrari.move();
        System.out.println("주행 속도 테스트 종료");

        System.out.println("주행 속도 테스트 시작");
        lamborghini.move();
        System.out.println("주행 속도 테스트 종료");

        System.out.println("주행 속도 테스트 시작");
        maybach.move();
        System.out.println("주행 속도 테스트 종료");
    }
}
