package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        memberConstruct member1 = new memberConstruct("user1", 15, 90);
        memberConstruct member2 = new memberConstruct("user2", 16, 80);

        memberConstruct[] members = {member1, member2};

        for (memberConstruct m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }
}
