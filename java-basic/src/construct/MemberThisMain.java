package construct;

public class MemberThisMain {
    public static void main(String[] args) {
        MemberThis m = new MemberThis();
        m.initMember("초기화");
        System.out.println(m.nameField);
    }
}
