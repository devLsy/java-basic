package poly.ex3;

public class AbstractAnimal2 {

    public static void main(String[] args) {
        AbstractAnimal[] animalArr = {new Dog(), new Cat(), new Caw(), new Pig()};

        for (AbstractAnimal animal : animalArr) {
            animalSound(animal);
        }
    }

    //변하지 않는 부분
    private static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("======================");
    }
}
