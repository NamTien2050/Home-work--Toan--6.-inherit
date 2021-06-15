package aahomework;

public class Staff {
    private int id;
    private String name;
    private int age;
    private int phoneNumBer;
    private String email;

    public Staff() {
    }

    public Staff(int id, String name, int age, int phonenumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumBer = phonenumber;
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

    public int getPhoneNumBer() {
        return phoneNumBer;
    }

    public void setPhoneNumBer(int phonenumber) {
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
