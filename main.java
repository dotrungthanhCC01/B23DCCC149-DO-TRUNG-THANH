public class main {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle myCircle = new Circle(5.0);
        System.out.println("Chu vi hình tròn là: " + myCircle.getPerimeter());
        System.out.println("Diện tích hình tròn là: " + myCircle.getArea());

        // Thay đổi bán kính
        myCircle.setRadius(10.0);
        System.out.println("Bán kính mới: " + myCircle.getRadius());
        System.out.println("Chu vi hình tròn mới: " + myCircle.getPerimeter());
        System.out.println("Diện tích hình tròn mới: " + myCircle.getArea());
    }
}
