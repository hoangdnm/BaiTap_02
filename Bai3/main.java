package Bai3;
public class main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("CODE001", "1234567890", 1000.0);
        BankAccount account2 = new BankAccount("CODE002", "0987654321", 500.0);

        account1.displayInfo();
        account2.displayInfo();

        account1.transfer(account2, 200.0);

        System.out.println("\nAfter transfer:");
        account1.displayInfo();
        account2.displayInfo();


        // trường họp rut tiền vượt quá số dư
         System.out.println("\ntrường họp rut tiền vượt quá số dư ");
        account1.withdraw(2000.0);
       
        // trường hợp nạp tiền số âm
        System.out.println("\ntrường hợp nạp tiền số âm ");
        account2.deposit(-100.0); 
        // Không nên có setter cho accountNumber
        // vì số tài khoản phải cố định sau khi tạo.
        // Nếu cho phép thay đổi sẽ dễ gây sai dữ liệu,
        // nhầm lẫn giao dịch và mất tính bảo mật.
    }
}
 