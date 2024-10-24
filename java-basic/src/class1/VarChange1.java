package class1;

public class VarChange1 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("a = " + a); //10
        System.out.println("b = " + b); //20

        //a변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //20

        //b변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); //20
        System.out.println("b = " + b); //30
    }
}
