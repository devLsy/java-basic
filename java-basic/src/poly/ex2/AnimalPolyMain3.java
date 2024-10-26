package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        //변수 선언을 인라인으로 처리
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Pig()};
        for (Animal animal : animalArr) {
            animalSound(animal);
        }
    }

    //변하지 않는 부분
    private static void animalSound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("======================");
    }

}
