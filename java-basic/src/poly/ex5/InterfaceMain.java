package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        //인터페이스 생성 불가
//        InterfaceAnimal animal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        animalSound(dog);
        animalSound(cat);
        animalSound(caw);
    }

    private static void animalSound(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("======================");
    }
}