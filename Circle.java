public class Circle {
    private double radius;
    public Circle(double radius){
        setRadius(radius);
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        if (Common.isPositive(radius)) {
            this.radius = radius;
        } else {
            System.out.println("Bán kính phải là số dương.");
        }
    }
    
}
