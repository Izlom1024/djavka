package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alexei");

        Point p1 = new Point (2, 6);
        Point p2 = new Point (7, 13);

        double kool = p1.distance(p2);

        Square s = new Square(5);
        System.out.println("Площаль квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle (4, 6);
        System.out.println("Площаль прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());
        Rectangle p = new Rectangle (4, 8);
        System.out.println("Площаль прямоугольника со стороной " + p.a + " и " + p.b + " = " + p.area());

        //double dist = distance(p1, p2);

        System.out.println("Длинна отрезка = " + kool);
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }
}