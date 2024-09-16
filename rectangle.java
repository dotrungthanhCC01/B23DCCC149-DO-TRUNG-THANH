public class rectangle{
    private int width;
    private int height;
    public rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getPremeter(){
        return 2 * ( width + height);
    }
    public int getArea(){
        return width * height;
    }
    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("vui long nhap du tham so");
            return;
        }
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        if (width <= 0 || height <=0){
            System.out.println("vui long nhap lai ");
            return;
        }
        rectangle myRectangle = new rectangle(width, height);
        System.out.println("chu vi hinh chu nhat la" + myRectangle.getPremeter());
        System.out.println("dien tich hinh chu nhat la" + myRectangle.getArea());
    }

}