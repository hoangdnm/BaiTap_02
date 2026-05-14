package ORG;

public class Main {

    public  void main() {

        // Constructor mặc định
        Book b1 = new Book();

        b1.title = "Java Core";
        b1.author = "Nguyen Van A";
        b1.year = 2025;
        b1.price = 99.5;



        // Constructor có tham số
        Book b2 = new Book(
                "OOP Java",
                "Tran Van B",
                2024,
                150.0
        );
        System.out.println("Constructor mặc định" );
        b1.showInfo();
        System.out.println("----------------------" );
        System.out.println("Constructor có tham số" );
        b2.showInfo();
    }
}