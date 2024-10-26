package poly.ex3;

import poly.ex2.Animal;

public class AbstractMain {

    public static void main(String[] args) {
//        추상 클래스는 직접 인스턴스 생성 불가
//        AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Pig pig = new Pig();
        Duck duck = new Duck();
        Caw caw = new Caw();

        animalSound(dog);
        animalSound(cat);
        animalSound(pig);
        animalSound(duck);
        animalSound(caw);
    }

    private static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println("======================");
    }
}
