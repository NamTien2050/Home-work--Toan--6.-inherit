package aahomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        do {
            System.out.println("----Menu----");
            System.out.println("0.Hiển thị danh sách" + "\n" + "1.Thêm" + "\n" + "2.Sửa" + "\n" + "3.xóa" + "\n" + "4.Thực lĩnh Full time: " + "\n" + "5.Thực lĩnh fart time: ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 0:
                    manager.disPlay();
                    break;
                case 1:

                case 2:
                case 3:
                case 4:
                    manager.fullTimeSalary();
                    break;
                case 5:
                    manager.partTimeSalary();
                    break;
            }
        } while (true);
    }
    public void create (Staff[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Số điện thoại:");
        int phonenumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();

    }
}
