public class Rectangle {
    public double width;
    public double height;

    // 1. Constructor không tham số: tạo hình vuông cạnh 1
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // 2. Constructor 1 tham số: tạo hình vuông cạnh side
    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    // 3. Constructor 2 tham số: tạo hình chữ nhật bình thường
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Phần mở rộng: Copy constructor
    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }

    // Trả về diện tích
    public double getArea() {
        return this.width * this.height;
    }

    // Trả về chu vi
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    // Kiểm tra có phải hình vuông
    public boolean isSquare() {
        return this.width == this.height;
    }

    // Phần mở rộng: Phóng to/thu nhỏ hình
    public void scale(double factor) {
        this.width *= factor;
        this.height *= factor;
    }

    public void showInfo() {
        System.out.println("Width: " + width + ", Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Is Square: " + isSquare());
    }
}