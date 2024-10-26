package poly.ex3;

public class AvengersMain1 {

    public static void main(String[] args) {
        IronMan ironMan = new IronMan();
        Thor thor = new Thor();
        Loki loki = new Loki();

//        1. 부모 타입으로 자식 인스턴스를 받아서(다형적 참조) 공통 함수로 처리
//        avengersAttack(ironMan);
//        avengersAttack(thor);

//      2.배열과 루프를 이용해서 중복제거
//        Avengers[] avengers = {ironMan, thor, loki};

        //
        //변하지 않는 부분
//        for (Avengers avenger : avengers) {
//            System.out.println("어벤저스 집합!!");
//            avenger.attack();
//            System.out.println("빌런을 무찌름");
//            System.out.println("==========================");
//        }
    }

//    private static void avengersAttack(Avengers avengers) {
//        System.out.println("어벤저스 집합!!");
//        avengers.attack();
//        System.out.println("빌런을 무찌름");
//        System.out.println("==========================");
//    }
}
