package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member member = new Member("lsy", "lee");
        member.changeData("seo");
        member.print();
        member.changeData("park");
        member.print();
    }
}