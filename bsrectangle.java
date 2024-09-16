public class BsRectangle {
    private int width;
    private int height;

    public BsRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public void setWidth(int width) {
        if (Common2.isPositive(width)) {
            this.width = width;
        } else {
            System.out.println("Chiều rộng phải là số dương.");
        }
    }

    public void setHeight(int height) {
        if (Common2.isPositive(height)) {
            this.height = height;
        } else {
            System.out.println("Chiều cao phải là số dương.");
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
