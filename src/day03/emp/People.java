package day03.emp;

public class People {
    private String name;
    private int uid;
    private double salary;

    public People() {
    }

    public People(String name, int uid, double salary) {
        this.name = name;
        this.uid = uid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("正在工作中. . .");
    }
}
