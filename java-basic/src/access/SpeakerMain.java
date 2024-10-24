package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.vloumeUp();
        speaker.showVloume();
        speaker.vloumeUp();
        
        //필드 직접 접근
        speaker.vloumeUp();
        speaker.showVloume();

    }
}
