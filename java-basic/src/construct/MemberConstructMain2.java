package construct;

public class MemberConstructMain2 {
    public static void main(String[] args) {
        memberConstruct memberConstruct = new memberConstruct("user1", 20);
        System.out.println("member : " + memberConstruct.toString() + "age: " + memberConstruct.age + "grade : " + memberConstruct.grade);
    }
}
