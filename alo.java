public class alo {
    public static void main(String[] args) {
        if (args.length < 2 ) {
            System.out.println("vui long nhap du tham so");
            return;
        }

        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        if (width <= 0 || height <= 0) {
            System.out.println("Chiều rộng và chiều cao phải là các số nguyên dương.");
            return;    
    }
    int chuvi = 2 * (width + height);
    int dientich = width * height;
    System.out.println("chu vi hinh chu nhat la: " + chuvi);
    System.out.println("dien tich hinh chu nhat la: " +  dientich);
}
}