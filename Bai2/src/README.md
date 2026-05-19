# Bài 2: Class Rectangle - Phần mở rộng

## Câu hỏi 
**Tại sao không thể có 2 constructor cùng nhận 1 tham số double? Hãy thử và giải thích lỗi.**

### Giải thích:
Trong Java, tính nạp chồng (Overloading) hoạt động dựa trên **Method Signature (Chữ ký phương thức)**.

Chữ ký của một phương thức/constructor bao gồm:
1. Tên phương thức (hoặc tên class đối với constructor).
2. Danh sách kiểu dữ liệu của các tham số đầu vào (số lượng, kiểu và thứ tự các tham số).

Lưu ý quan trọng: **Tên của biến/tham số không được tính vào chữ ký phương thức.**

Nếu bạn định nghĩa thử 2 constructor như sau:
```java
// Constructor 1: Ý định nhận vào chiều dài
public Rectangle(double width) { 
    // ...
}

// Constructor 2: Ý định nhận vào chiều rộng
public Rectangle(double height) { 
    // ...
}
```
Về mặt ngữ nghĩa với người lập trình, 2 biến này khác nhau (`width` và `height`). Nhưng đối với Java Compiler (Trình biên dịch), cả hai constructor này đều có chung một chữ ký là: `Rectangle(double)`.

Khi quá trình chạy mã xảy ra, ví dụ bạn viết: 
```java
Rectangle r = new Rectangle(5.0);
```
Compiler nhìn thấy việc truyền vào một giá trị `double`. Nó sẽ so sánh với cấu trúc chữ ký, lúc này nó tìm thấy tận 2 constructor có chữ ký `Rectangle(double)` và hoàn toàn không thể phân biệt được bạn đang cố ý gán 5.0 cho chiều rộng hay chiều dài.

Để chống lại sự mơ hồ này, Java sẽ báo lỗi **"constructor is already defined in class Rectangle"** ngay từ lúc biên dịch (Compile-time error) ngăn bạn thực thi mã.