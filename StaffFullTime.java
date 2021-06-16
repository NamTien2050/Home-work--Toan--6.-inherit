package aahomework;

public class StaffFullTime extends Staff {
    private double salary;
    private double bonus;
    private double punish;

    public StaffFullTime() {
    }

    public StaffFullTime(double salary, double bonus, double punish) {
        this.salary = salary;
        this.bonus = bonus;
        this.punish = punish;
    }

    public StaffFullTime(int id, String name, int age, double phoneNumBer, String email, double salary, double bonus, double punish) {
        super(id, name, age, phoneNumBer, email);
        this.salary = salary;
        this.bonus = bonus;
        this.punish = punish;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPunish() {
        return punish;
    }

    public void setPunish(double punish) {
        this.punish = punish;
    }

    @Override
    public String toString() {
        return "StaffFullTime{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", punish=" + punish +
                super.toString() +
                '}';
    }
}
