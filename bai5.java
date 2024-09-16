import java.util.ArrayList;

public class bai5 {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(5.0, 10.0));
        shapes.add(new Circle(7.0));
        shapes.add(new Rectangle(3.0, 4.0));
        shapes.add(new Circle(2.5));


        double totalArea = 0;
        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalArea += shape.getArea();
            totalPerimeter += shape.getPerimeter();
        }


        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
    }

    static abstract class Shape {
        public abstract double getPerimeter();
        public abstract double getArea();
    }


    static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getPerimeter() {
            return 2 * (width + height);
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }

    
    static class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }
}