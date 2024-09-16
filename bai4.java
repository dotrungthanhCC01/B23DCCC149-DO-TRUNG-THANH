public class bai4 {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5.0, 10.0);
        Shape circle = new Circle(7.0);

        System.out.println("Rectangle:");
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());

        System.out.println("\nCircle:");
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
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