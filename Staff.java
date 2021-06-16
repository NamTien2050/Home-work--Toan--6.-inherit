package aahomework;

public class Staff {
    private int id;
    private String name;
    private int age;
    private double phoneNumBer;
    private String email;

    public Staff() {
    }

    public Staff(int id, String name, int age, double phoneNumBer, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumBer = phoneNumBer;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPhoneNumBer() {
        return phoneNumBer;
    }

    public void setPhoneNumBer(long phonenumber) {
        this.phoneNumBer = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumBer=" + phoneNumBer +
                ", email='" + email + '\'' +
                '}';
    }
}
