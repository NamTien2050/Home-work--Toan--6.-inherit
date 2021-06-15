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
}
