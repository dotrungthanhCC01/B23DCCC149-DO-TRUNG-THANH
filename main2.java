public class Main2 {
    public static void main(String[] args) {
        // Tạo đối tượng BsRectangle
        bsrectangle myBsRectangle = new BsRectangle(5, 10);
        System.out.println("Chu vi hình chữ nhật là: " + myBsRectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + myBsRectangle.getArea());

        // Thay đổi chiều rộng và chiều cao
        myBsRectangle.setWidth(15);
        myBsRectangle.setHeight(20);
        System.out.println("Chiều rộng mới: " + myBsRectangle.getWidth());
        System.out.println("Chiều cao mới: " + myBsRectangle.getHeight());
        System.out.println("Chu vi hình chữ nhật mới: " + myBsRectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật mới: " + myBsRectangle.getArea());
    }
}
