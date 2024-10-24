package extends1.overriding;

import extends1.ex2.Child1;

public class ChildMain {

    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.play();
        child1.income();
        System.out.println("참으로 좋겠구나");
    }
}
