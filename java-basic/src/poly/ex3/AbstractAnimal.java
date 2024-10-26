package poly.ex3;

public abstract class AbstractAnimal {
    //추상 메서드(자식에서 재정의를 강제로 제약함)
    public abstract void sound();
    //일반 메서드
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
