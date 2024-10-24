package oop1.ex;

public class RectangleProceduralObjMain {
    public static void main(String[] args) {
        Rectangle rt = new Rectangle();
        rt.width = 5;
        rt.height = 8;

        int area = rt.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rt.caculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rt.isSquare();
        System.out.println("정사각형 여부: " + square);
    }

}
