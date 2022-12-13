package minitest2;

public class Student {
    private String name;
    private int age;
    private String address;
    private String gender;
    private double avg;
    private int id;


    public Student(int id,String name, int age, String address, String gender, double avg ) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.avg = avg;
        this.id = id;
    }

    public Student(String name, int age, String address, String gender, double avg) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                ", id=" + id +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", avg=" + avg +
                '}';
    }



    public Student() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
}
