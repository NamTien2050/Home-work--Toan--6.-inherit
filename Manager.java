package aahomework;

public class Manager {

    StaffFullTime staffFullTime = new StaffFullTime();
    StaffPartTime staffPartTime = new StaffPartTime();
    private double getmoney;

    public Staff[] create(Staff[] arr) {
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
