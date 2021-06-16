package aahomework;

import java.util.Scanner;

public class Manager {
    private int size = 1;
    private double getMoney;
    Staff[] arr = new Staff[size];
    StaffFullTime staffFullTime = new StaffFullTime();
    StaffPartTime staffPartTime = new StaffPartTime();

    public void listStaff() {
        Staff arrNum1 = add(new StaffPartTime(12, "Hung", 24, 0968.502733, "quanvu2021@gmail.com", 19));
        Staff arrNum2 = add(new StaffFullTime(13, "Han", 20, 0972.843027, "nenhue472@gmail.com", 18.294000, 32.671000, 2.467000));
        Staff arrNum3 = add(new StaffPartTime(17, "Dung", 18, 0968.215679, "quanvu2021@gmail.com", 19));
        Staff arrNum4 = add(new StaffFullTime(23, "Link", 27, 0972.439347, "nenhue472@gmail.com", 18.294000, 32.671000, 2.467000));
    }

    public void createStaff(Staff[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Số điện thoại:");
        int phoneNumBer = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
    }

    public Staff add(Staff staff) {
        arr[size]=staff;
        size++;
        return arr[size];
    }

    public double fullTimeSalary() {
        getMoney = staffFullTime.getSalary() + (staffFullTime.getBonus() - staffFullTime.getPunish());
        return getMoney;
    }

    public double partTimeSalary() {
        getMoney = staffPartTime.getHour() * 100000;
        return getMoney;
    }

    public void disPlay() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
