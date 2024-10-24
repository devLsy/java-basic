package access;

//자동차 클래스
public class Car {
    private int speed;

    public Car() {
        speed = 0;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public void takeBreak() {
        if(isStoped()) {
            System.out.println("자동차가 완전히 멈췄습니다.");
        } else {
            speed = Math.max(0, speed -50);
            System.out.println("속도를 50 감소 시킵니다.");
        }
    }

    public void accelerate(int speed) {
        if(!isLimited()) {
            this.speed = Math.min(this.speed += speed, 200);
            System.out.println("속도를 증가 시킵니다.");
        } else {
            System.out.println("더 이상 속도를 올릴 수 없습니다. 죽어요 그러다가");
        }
    }
    public void showStatus() {
        System.out.println("현재 속도: " + speed + "km");
    }

    private boolean isStoped() {
        return this.speed <= 0;
    }

    private boolean isLimited() {
        return this.speed >= 200;
    }

}
