package oop1.ex;

public class AvengersMain {
    public static void main(String[] args) {
        int age1 = 500;
        int power1 = 50000;
        String name1 = "thor";

        printAge(age1);
        printPower(power1);
        printName(name1);

        int age2 = 52;
        int power2 = 5000;
        String name2 = "ironMan";

        System.out.println("============================");

        printAge(age2);
        printPower(power2);
        printName(name2);
    }

    static void printAge(int age) {
        System.out.println("나이: " + age);
    }
    
    static void printPower(int power) {
        System.out.println("전투력: " + power);
    }

    static void printName(String name) {
        System.out.println("이름: " + name);
    }
}
