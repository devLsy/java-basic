package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2  호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();  
        //java 16부터 사용 가능, 인스턴스 확인하면서 변수 선언 같이 가능, 캐스팅 불필요
        if(parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
