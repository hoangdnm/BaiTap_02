public class Main {
    public static void main(String[] args) {
        System.out.println(" 1. Constructor không tham số ");
        Rectangle r1 = new Rectangle();
        r1.showInfo();

        System.out.println("\n 2. Constructor 1 tham số (side = 5)");
        Rectangle r2 = new Rectangle(5);
        r2.showInfo();

        System.out.println("\n 3. Constructor 2 tham số (width = 4, height = 6) ");
        Rectangle r3 = new Rectangle(4.0, 6.0);
        r3.showInfo();

        System.out.println("\n 4. Mở rộng ");
        Rectangle r4 = new Rectangle(r3);
        r4.showInfo();

        System.out.println("\n 5. Mở rộng ");
        r4.scale(2.0);
        r4.showInfo();
    }
}