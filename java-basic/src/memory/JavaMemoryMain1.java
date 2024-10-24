package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        mehotd1(10);
        System.out.println("main end");
    }

    static void mehotd1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        mehotd2(cal);
        System.out.println("method1 end");
    }

    static void mehotd2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
