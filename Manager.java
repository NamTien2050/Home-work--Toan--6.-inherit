package aahomework;

import java.util.Scanner;

public class Manager {
    Staff[] arr;

    StaffFullTime staffFullTime = new StaffFullTime();
    StaffPartTime staffPartTime = new StaffPartTime();
    private double getmoney;

    public void create(Staff[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Số điện thoại:");
        int phonenumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập Email: ");
        String email = scanner.nextLine();
    }

    public double fullTimeSalary() {
        getmoney = staffFullTime.getSalary() + (staffFullTime.getBonus() - staffFullTime.getPunish());
        return getmoney;
    }

    public double partTimeSalary() {
        getmoney = staffPartTime.getHour() * 100000;
        return getmoney;
    }

    public void disPlay() {
        System.out.println(staffFullTime.toString());
        System.out.println(staffPartTime.toString());
    }
}
