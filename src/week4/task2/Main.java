package week4.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test Shape:\n1.No param");
        Shape shapeNoParam = new Shape();
        System.out.println(shapeNoParam.toString());
        System.out.println("2. Have param");
        Shape shapeHaveParam = new Shape("yellow", false);
        System.out.println(shapeHaveParam.toString());

        System.out.println("------//////--------");
        System.out.println("Test Circle");
        Circle circle = new Circle("blue", false, 3.0);
        System.out.println(circle.getArea() + " " + circle.getPerimeter());
        System.out.println(circle.toString());

        System.out.println("------//////--------");
        System.out.println("Test Rect");
        Rectangle rectangle = new Rectangle("blue", false, 3, 4);
        System.out.println(rectangle.getArea() + " " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        System.out.println("------//////--------");
        System.out.println("Test sqare");
        Square square = new Square(3);
        System.out.println(square.getArea() + " " + square.getPerimeter());
        System.out.println(square.toString());
        square.setSide(5);
        System.out.println(square.getArea() + " " + square.getPerimeter());
        System.out.println(square.toString());
    }
}
