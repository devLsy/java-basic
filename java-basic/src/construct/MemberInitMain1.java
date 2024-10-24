package construct;

public class MemberInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        initMember(m1, "user1", 15, 90);

        MemberInit m2 = new MemberInit();
        initMember(m2, "user2", 16, 80);

        MemberInit[] members = {m1, m2};
        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
