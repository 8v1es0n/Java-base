package day02.homework;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null){
            System.out.println("年龄信息非法!");
        } else {
            this.gender = gender;
        }
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
        if (age < 0 || age > 150){
            System.out.println("年龄信息非法!");
        } else {
            this.age = age;
        }

    }
}
