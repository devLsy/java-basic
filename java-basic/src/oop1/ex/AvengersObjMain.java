package oop1.ex;

public class AvengersObjMain {
    public static void main(String[] args) {
        Avengers avengers = new Avengers();
        avengers.age = 500;
        avengers.power = 50000;
        avengers.name = "thor";

        avengers.printAge();
        avengers.printPower();
        avengers.printName();

        System.out.println("참조값: " + avengers);
        printLine();

        avengers.age = 52;
        avengers.power = 5000;
        avengers.name = "ironMan";

        avengers.printAge();
        avengers.printPower();
        avengers.printName();

        System.out.println("참조값: " + avengers);
    }

    static void printLine() {
        System.out.println("=============================================");
    }
}
