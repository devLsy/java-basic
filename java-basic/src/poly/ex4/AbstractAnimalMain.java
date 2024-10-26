package poly.ex4;


public class AbstractAnimalMain {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Caw caw = new Caw();
        Duck duck = new Duck();

        dog.sound();
        dog.move();

        animalSound(dog);
        animalSound(caw);
        animalSound(duck);

        animalMove(dog);
        animalMove(caw);
        animalMove(duck);
    }

    //변하지 않는 부분
    private static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("======================");
    }

    private static void animalMove(AbstractAnimal animal) {
        System.out.println("동물 걸음 테스트 시작");
        animal.move();
        System.out.println("동물 걸음 테스트 종료");
        System.out.println("======================");
    }
}
