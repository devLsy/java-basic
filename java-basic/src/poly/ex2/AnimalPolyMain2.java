package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        //여기가 핵심, 부모타입으로 배열을 만들어서 각각 인스턴스를 받는다.
        Animal[] animaArr = {dog, cat, caw};

        //변하지 않는 부분(위에서 아무리 많은 동물이 추가 되더라도)
        for (Animal animal : animaArr) {
            System.out.println("동물 테스트 시작");
            animal.sound();
            System.out.println("동물 테스트 종료");
            System.out.println("=======================");
        }
    }
}
