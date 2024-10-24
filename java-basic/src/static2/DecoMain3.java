package static2;

public class DecoMain3 {

    public static void main(String[] args) {
        String s = "ironMan";

        String deco = DecoUtil3.deco(s);
        System.out.println("deco: " + deco);

        int result = DecoUtil3.test1(100);
        System.out.println("result: " + result);
    }
}
