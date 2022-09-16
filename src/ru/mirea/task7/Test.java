package ru.mirea.task7;

public class Test {
    public static void testShapes() {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version? - circle
        System.out.println(s1.getArea()); // which version? - circle
        System.out.println(s1.getPerimeter()); // which version? - circle we overrided it
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // this method does not work in Shape.
        // The previous methods are accessible because they were abstract and overridden
        Circle c1 = (Circle) s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
//        Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());this method does not work in Shape.
        //        // The previous methods are accessible because they were abstract and overridden
        Rectangle r1 = (Rectangle) s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());// this method does not work in Shape.
        // The previous methods are accessible because they were abstract and overridden
//        System.out.println(s4.getSide());
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); // such method exists in Square not in Rectangle
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

    public static void testMovable() {
        MovablePoint point = new MovablePoint(0, 0, 10, 1);
        System.out.println(point);
        for (int i = 0; i < 15; i++) {
            point.moveDown();
        }
        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(1, -11, 1, 2, 4);
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 8, 4, 1, 1);
        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle);
    }

    public static void main(String[] args) {
        testShapes();
        System.out.println("/////////Movable test////////");
        testMovable();
    }
}
