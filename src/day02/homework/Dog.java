package day02.homework;

public class Dog extends Animal{
    private String type;

    public Dog(String type) {
        this.type = type;
    }

    public Dog(String name, int age, String type) {
        super(name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
