package aahomework;

import aahomework.Staff;

public class StaffPartTime extends Staff {
    private double hour;

    public StaffPartTime() {
    }

    public StaffPartTime(double hour) {
        this.hour = hour;
    }

    public StaffPartTime(int id, String name, int age, int phonenumber, String email, double hour) {
        super(id, name, age, phonenumber, email);
        this.hour = hour;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "aahomework.StaffPartTime{" +
                "hour='" + hour + '\'' +
                super.toString() +
                '}';
    }
}
